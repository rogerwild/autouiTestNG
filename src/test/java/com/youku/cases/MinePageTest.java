package com.youku.cases;

import macaca.client.MacacaClient;
import macaca.java.biz.BaseErrorType;
import macaca.java.biz.ResultGenerator;

import org.testng.annotations.Test;

import com.youku.pages.HistoryPage;
import com.youku.pages.HomePage;
import com.youku.pages.MinePage;
import com.youku.pages.PersonalDataPage;
import com.youku.pages.VideoDetialPage;
import com.youku.pageuis.HistoryPageUI;
import com.youku.pageuis.HomePageUI;
import com.youku.pageuis.PersonalDataPageUI;
import com.youku.pageuis.VideoDetialPageUI;

public class MinePageTest extends BaseTest{

	@Test
	public void test_case_mine() throws Exception{
		
		//个人中心测试
		
		HomePage homePage = new HomePage("首页");
		homePage.setDriver(driver);
		
		if(homePage.hasPageShown(HomePageUI.HOME_TopLine)){
			//首页截屏
			saveScreen(homePage.pageDesc);
			//页面加载成功日志记录
			ResultGenerator.loadPageSucc(homePage);	
			//点击首页轮播图下方的视频
			homePage.clickCell(2);
			driver.sleep(150000);
			
		}else{
			//页面加载失败日志记录
			ResultGenerator.loadPageFail(homePage);
			//首页如果加载失败，直接退出测试 return
			return;
		}
		
		VideoDetialPage videoDetialPage = new VideoDetialPage("视频详情页");
		videoDetialPage.setDriver(driver);
		if(videoDetialPage.hasPageShown(VideoDetialPageUI.DOWNLOAD)){
			saveScreen(videoDetialPage.pageDesc);
			ResultGenerator.loadPageSucc(videoDetialPage);
					
			videoDetialPage.oppositeClikBtn(1);
			
		}else{
			ResultGenerator.loadPageFail(videoDetialPage);
		}
		
		//进入我的模块
		homePage.toMinePage();
		//个人中心测试
		ResultGenerator.customLog("个人中心测试", "");
		MinePage minePage = new MinePage("我的模块");
		minePage.setDriver(driver);	
		minePage.clickHead();
		//登录测试
		minePage.clickTouristLoginBtn();
				
		PersonalDataPage personalDataPage = new PersonalDataPage("个人资料页");
		personalDataPage.setDriver(driver);
		if(personalDataPage.hasPageShown(PersonalDataPageUI.PersonalDataPage_PersonalTag)){
			saveScreen(personalDataPage.pageDesc);
			ResultGenerator.loadPageSucc(personalDataPage);
			//退出登录
			//personalDataPage.clickLogOut();
					
		}else{
			ResultGenerator.loadPageFail(personalDataPage);
		}
		
		//进入记录页
		minePage.toHistoryPage();
		HistoryPage historyPage = new HistoryPage("记录页");
		historyPage.setDriver(driver);
		if(historyPage.hasPageShown(HistoryPageUI.HISTORYPAGE_EDIT)){
			saveScreen(historyPage.pageDesc);
			ResultGenerator.loadPageSucc(historyPage);
			//删除全部记录
			ResultGenerator.customLog("删除全部记录", "");
			historyPage.clearHistory();
			saveScreen("删除全部记录");
		}else{
			ResultGenerator.loadPageFail(historyPage);
		}
		
		//进入收藏页面
		minePage.toCollectPage();
		saveScreen("收藏页");
		//进入缓存页面
		minePage.toDownloadPage();
		saveScreen("缓存页");
		//进入消息页
		minePage.toMessagePage();
		saveScreen("消息页");
		//进入上传页
		minePage.toUploadPage();
		saveScreen("上传页");
		//进入客服页
		minePage.toCusserPage();
		saveScreen("客服页");
		//进入设置页
		minePage.toSetupPage();
		saveScreen("设置页");
		
		
	}
	
	
	
	 
	
	
	
}
