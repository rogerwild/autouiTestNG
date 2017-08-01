package com.youku.cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import macaca.client.MacacaClient;
import macaca.java.biz.BaseErrorType;
import macaca.java.biz.BaseMacacaClient;
import macaca.java.biz.ResultGenerator;
import macaca.java.biz.BaseMacacaClient.PlatformType;
import macaca.java.biz.BaseUtils;

import com.youku.pages.HomePage;
import com.youku.pages.SearchResultPage;
import com.youku.pages.VideoDetialPage;
import com.youku.pageuis.HomePageUI;
import com.youku.pageuis.SearchResultPageUI;
import com.youku.pageuis.VideoDetialPageUI;
import com.youku.utils.Config;
import com.youku.utils.Shell;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class BaseTest {
	//多台设备并行参数
	private String udid,proxyport,port;
	// 屏幕截图的数目，为了实现递增的顺序
	private int screenNum = 1;

	BaseMacacaClient driver= new BaseMacacaClient();
	HomePage homePage = new HomePage("首页");
	

	public void inittingDriver() throws Exception {
		// 初始化应用基础信息
		JSONObject props = new JSONObject();
		if (Config.PLATFORM.equals("ios")) {
			//删除设备上旧的测试包
			//BaseUtils.uninstallApp(Config.PLATFORM, udid, Config.IOS_BUNDLEID);
			//安装测试包
			//BaseUtils.deviceInstaller(Config.PLATFORM, udid, Config.PackagePath+"/YoukuHD-NG-Release.ipa");

			// 创建ios实例
			//props.put("app", "https://npmcdn.com/ios-app-bootstrap@latest/build/ios-app-bootstrap.zip");
			//props.put("app", Config.PackagePath+"/YoukuHD-NG-Release.ipa");
			props.put("bundleId", Config.IOS_BUNDLEID);
			props.put("platformName", Config.IOS_PLATFORM_NAME);
			//props.put("deviceName", Config.IOS_DEVICE_NAME);
			//传递每台设备的udid
			props.put("udid", udid);
			props.put("autoAcceptAlerts", true);
			driver.setCurPlatform(PlatformType.IOS);
		} else {

			//创建安卓实例
			props.put("app", Config.ADR_APP);
			props.put("platformName", Config.ADR_PLATFORM_NAME);
			driver.setCurPlatform(PlatformType.ANDROID);
		}

		// 覆盖安装
		props.put("reuse", Config.REUSE);
		//传递代理端口
		props.put("proxyPort", Integer.parseInt(proxyport));
		JSONObject desiredCapabilities = new JSONObject();
		desiredCapabilities.put("desiredCapabilities", props);
		desiredCapabilities.put("host", "127.0.0.1");
		//传递server端口
        desiredCapabilities.put("port", Integer.parseInt(port));
        
        if(!port.equals("3456")){
        	driver.sleep(10000);
        }
        //startMacacaServer();
		driver.initDriver(desiredCapabilities);

	}
	
	@BeforeTest
    @Parameters({ "port", "proxyport","udid" })  
	public void beforeRunTest(String port,String proxyport, String udid) throws Exception {
	    this.port = port;
	    this.proxyport = proxyport;
	    this.udid = udid;
	    
	    // 清除日志记录
	    ResultGenerator.clearOldData();
	    //清理截图重新记录
	    File file = new File(Config.ScreenshotPath);
	    deleteOldScreen(file);
	    
	    //startMacacaServer();
	    inittingDriver();
	}
	
	@BeforeMethod
	public void beforeRunCase() throws Exception {
		//运行每个@Test都从首页开始
		homePage.setDriver(driver);
		homePage.toHomePage();
		
	}
	
	@AfterMethod
	public void afterRunCase() throws Exception {
		//每个@Test运行完毕后都回到首页,支持首页、播放页、搜索页
		homePage.setDriver(driver);
		if(homePage.hasPageShown(HomePageUI.HOME_HomeBtn)){
			homePage.toHomePage();
			
		}else{
			VideoDetialPage videoDetialPage = new VideoDetialPage("视频详情页");
			videoDetialPage.setDriver(driver);
			if(videoDetialPage.hasPageShown(VideoDetialPageUI.DOWNLOAD)){		
				videoDetialPage.oppositeClikBtn(1);
			}
			
			SearchResultPage searchResultPage=new SearchResultPage("搜索结果页");
			searchResultPage.setDriver(driver);
			if(searchResultPage.hasPageShown(SearchResultPageUI.SEARCHRESULT_SIFT)){
				searchResultPage.clikBack();
				
			}	
		}
		
	}

	@AfterTest
	public void tearDown() throws Exception {

		try {
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
			ResultGenerator.fail("quit fail", "", BaseErrorType.FUNCTION_FAILED);
		}
		//将custom.log复制到nodejs server下，共他人访问
		//copyFile(Config.CustomLogPath,Config.CustomLogRemovePath);

	}

	 /**
	    * 保存当前屏幕截图-生成的截图会按照截图的先后顺序生成有序的名称
	    * @param fileName 图片名称，默认为.png格式,图片默认保存在screenShot目录下
	    */
	public void saveScreen(String fileName) {
	    try {
	        // 判断是否存在对应目录，不存在的话则创建
	        File file = new File(Config.ScreenshotPath);
	        if (!file.exists() || !file.isDirectory()) {
	            // 没有目录 创建截屏目录
	            System.out.println("没有screenshot目录，创建目录");
	            boolean isMkdirSucc = file.mkdir();
	            if (isMkdirSucc) {
	                System.out.println("创建screenshot目录成功");
	            } else {
	                System.out.println("创建screenshot目录失败");
	            }
	        } else {
	            System.out.println("存在screenshot目录");
	        }

	        driver.saveScreenshot(Config.ScreenshotPath + File.separator + screenNum + "_" + fileName + ".png");
	        screenNum++;
	        } catch (Exception e) {
	        	// TODO: handle exception
	            ResultGenerator.fail("截屏异常", "", BaseErrorType.FUNCTION_FAILED);
	        	
	        }
	                    
	}

	//删除screenshot目录下旧的截图
	public void deleteOldScreen(File oldScreen) {
	    if (oldScreen.exists() && oldScreen.isDirectory()) {
	        File[] files = oldScreen.listFiles();
	        for (File file : files) {
	            deleteOldScreen(file);
	        }
	    } else {
	        oldScreen.delete();
	    }

	}
	    
   /** 
	    * 复制单个文件 
	    * @param oldPath String 原文件路径 如：c:/fqf.txt 
	    * @param newPath String 复制后路径 如：f:/fqf.txt 
	    */ 
	//复制文件
	public void copyFile(String oldPath, String newPath) {
	    try {
	        int bytesum = 0; 
	        int byteread = 0; 
	        File oldfile = new File(oldPath); 
	        if (oldfile.exists()) {
	        	//文件存在时 
	            InputStream inStream = new FileInputStream(oldPath); //读入原文件 
	            FileOutputStream fs = new FileOutputStream(newPath); 
	            byte[] buffer = new byte[1444]; 
	            while ( (byteread = inStream.read(buffer)) != -1) {
	                bytesum += byteread; //字节数 文件大小 
	                System.out.println(bytesum); 
	                fs.write(buffer, 0, byteread); 
	                }
	            inStream.close(); 
	            fs.close();
	            } 
	         }
	    catch (Exception e) { 
	    System.out.println("复制单个文件操作出错"); 
	    e.printStackTrace();
	    }
    }
	
     /** 
	 * 开启Macaca server 
	 * @throws Exception 
	 */ 
	public void startMacacaServer(){
		
		BaseUtils.exec2("/usr/local/bin/node /usr/local/lib/node_modules/macaca-cli/bin/macaca-cli-server");
		
		
	}
	
	    
	    
}