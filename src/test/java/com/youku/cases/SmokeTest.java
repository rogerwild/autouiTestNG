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


public class SmokeTest extends BaseTest{
	//冒烟测试	
	
	
	@Test 
	public void test_case_homePageTest() throws Exception{
		//测试首页，是否正常打开		
		if(homePage.hasPageShown(HomePageUI.HOME_TopLine)){
			saveScreen(homePage.pageDesc);
			ResultGenerator.loadPageSucc(homePage);	
	    	//向上滑动页面
		    homePage.scrollToBottom(3);
			saveScreen("滑动页面查看数据");
			homePage.resume();
			
		}else{
			//页面加载失败日志记录
			ResultGenerator.loadPageFail(homePage);
			
		}
	}
	
	@Test
	public void test_case_playPageTest() throws Exception{
		//播放页测试
		//点击首页轮播图下方的视频
		homePage.clickCell(2);
		driver.sleep(5000);
		VideoDetialPage videoDetialPage = new VideoDetialPage("视频详情页");
		videoDetialPage.setDriver(driver);
		if(videoDetialPage.hasPageShown(VideoDetialPageUI.DOWNLOAD)){
			saveScreen(videoDetialPage.pageDesc);
			ResultGenerator.loadPageSucc(videoDetialPage);
					
		}else{
			ResultGenerator.loadPageFail(videoDetialPage);
		}
		
	}	
	
	@Test
	public void test_case_channelPageTest() throws Exception{
		//频道页测试，切换频道
		homePage.scrollLeft(2);
		saveScreen("切换频道页");
		homePage.scrollRight(2);
		
	}
		
	@Test
	public void test_case_searchTest() throws Exception{
		//测试搜全网（点击搜全网按钮）
		homePage.clickSearchBtn();
		//搜索结果页
		SearchResultPage searchResultPage=new SearchResultPage("搜索结果页");
		searchResultPage.setDriver(driver);
		if(searchResultPage.hasPageShown(SearchResultPageUI.SEARCHRESULT_SIFT)){
			saveScreen(searchResultPage.pageDesc);
			ResultGenerator.loadPageSucc(searchResultPage);		
			//上下滑动页面
			searchResultPage.scroll();
			saveScreen("上下滑动搜索结果页");
			//点击第一个海报图
			searchResultPage.clikCell(0);
			saveScreen("搜索结果页点击海报图进入播放页");
			VideoDetialPage videoDetialPage = new VideoDetialPage("播放页");
			videoDetialPage.setDriver(driver);
			videoDetialPage.oppositeClikBtn(1);
			
		}else{
			ResultGenerator.loadPageFail(searchResultPage);
		}		
	}
	
	@Test
	public void test_case_downLoadTest() throws Exception{
		//缓存测试
		//点击首页轮播图下方的视频
		homePage.clickCell(2);
		//播放页
		//下载某集视频
		VideoDetialPage videoDetialPage = new VideoDetialPage("播放页");
		videoDetialPage.setDriver(driver);
		videoDetialPage.downLoad();
		videoDetialPage.toDownLoadCenter();
		DownLoadCenterPage downLoadPage = new DownLoadCenterPage("缓存中心");
		downLoadPage.setDriver(driver);
		if(downLoadPage.hasPageShown(DownLoadCenterUI.DOWNLOADCENTER_BACK)){
			saveScreen(downLoadPage.pageDesc);
			ResultGenerator.loadPageSucc(downLoadPage);
			//返回
			downLoadPage.clikBack();
		}else{
			ResultGenerator.loadPageFail(downLoadPage);
		}
		videoDetialPage.closeDownLoad();
	}	
		
	@Test
	public void test_case_subscribePageTest() throws Exception{
		//订阅
		homePage.toSubs();
		SubscribePage subscribePage=new SubscribePage("订阅模块");
		subscribePage.setDriver(driver);
		if(subscribePage.hasPageShown(SubscribePageUI.SUBSCRIBE_MYSUBSCRIBE)){
			saveScreen(subscribePage.pageDesc);
			ResultGenerator.loadPageSucc(subscribePage);
							
		}else{
			ResultGenerator.loadPageFail(subscribePage);
		}		
	}
		
	@Test
	public void test_case_vipPageTest() throws Exception{
		//会员模块
		homePage.toVipPage();
		MemberPage memberPage = new MemberPage("会员模块");
		memberPage.setDriver(driver);
		if(memberPage.hasPageShown(MemberPageUI.MEMBERPAGE_VIPWELLBE)){
			saveScreen(memberPage.pageDesc);
			ResultGenerator.loadPageSucc(memberPage);
		
		}else{
			ResultGenerator.loadPageFail(memberPage);
		}	
	}
		
	@Test
	public void test_case_topLinePageTest() throws Exception{
		//头条
		homePage.toToplinePage();
		TopLinePage toplinePage = new TopLinePage("头条模块");
		toplinePage.setDriver(driver);
		if(toplinePage.hasPageShown(TopLinePageUI.TopLinePage_BacktoTop)){
			saveScreen(toplinePage.pageDesc);
			ResultGenerator.loadPageSucc(toplinePage);
		}else{
			ResultGenerator.loadPageFail(toplinePage);
		}
	}	
		
	@Test
	public void test_case_minePageTest() throws Exception{
		//我的模块
		homePage.toMinePage();		
		MinePage minePage = new MinePage("我的模块");
		minePage.setDriver(driver);
		if(minePage.hasPageShown(MinePageUI.MINEPAGE_SETUP)){
			saveScreen(minePage.pageDesc);
			ResultGenerator.loadPageSucc(minePage);
		}else{
			ResultGenerator.loadPageFail(minePage);
		}
	}	
		
		
		
		
	
}
