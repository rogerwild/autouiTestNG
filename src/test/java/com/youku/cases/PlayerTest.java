package com.youku.cases;

import macaca.client.MacacaClient;
import macaca.java.biz.BaseErrorType;
import macaca.java.biz.ResultGenerator;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.youku.pages.DownLoadCenterPage;
import com.youku.pages.HistoryPage;
import com.youku.pages.HomePage;
import com.youku.pages.MemberPage;
import com.youku.pages.MinePage;
import com.youku.pages.PersonalDataPage;
import com.youku.pages.VideoDetialPage;
import com.youku.pageuis.DownLoadCenterUI;
import com.youku.pageuis.HistoryPageUI;
import com.youku.pageuis.HomePageUI;
import com.youku.pageuis.MemberPageUI;
import com.youku.pageuis.MinePageUI;
import com.youku.pageuis.PersonalDataPageUI;
import com.youku.pageuis.VideoDetialPageUI;
import com.youku.utils.Config;
import com.youku.pages.SearchPage;
import com.youku.pages.SearchResultPage;
import com.youku.pages.SubscribePage;
import com.youku.pages.TopLinePage;
import com.youku.pageuis.SearchPageUI;
import com.youku.pageuis.SearchResultPageUI;
import com.youku.pageuis.SubscribePageUI;
import com.youku.pageuis.TopLinePageUI;

public class PlayerTest extends BaseTest{
	//播放器测试

	@Test 
	public void test_case_player() throws Exception{
		//大小屏切换测试
		
		
		ResultGenerator.customLog("播放器测试", "");
		//测试首页，是否正常打开
		HomePage homePage = new HomePage("首页");
		homePage.setDriver(driver);
		
		if(homePage.hasPageShown(HomePageUI.HOME_TopLine)){
			//首页截屏
			saveScreen(homePage.pageDesc);
			//页面加载成功日志记录
			ResultGenerator.loadPageSucc(homePage);	
			//点击首页轮播图下方的视频
			homePage.clickCell(2);
			
		}else{
			//页面加载失败日志记录
			ResultGenerator.loadPageFail(homePage);
			//首页如果加载失败，直接退出测试 return
			return;
		}
		
		//播放页
		driver.sleep(5000);
		VideoDetialPage videoDetialPage = new VideoDetialPage("视频详情页");
		videoDetialPage.setDriver(driver);
		if(videoDetialPage.hasPageShown(VideoDetialPageUI.DOWNLOAD)){
			saveScreen(videoDetialPage.pageDesc);
			ResultGenerator.loadPageSucc(videoDetialPage);
			//切全屏		
			
		}else{
			ResultGenerator.loadPageFail(videoDetialPage);
		}
		
		
		
		
	}
	
	
	
	
	 
	
	
	
}
