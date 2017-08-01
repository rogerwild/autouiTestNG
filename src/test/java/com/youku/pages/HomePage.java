/**
 * 
 */
/**
 * @author roger
 *
 */
package com.youku.pages;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePage;

import com.alibaba.fastjson.JSONObject;
import com.youku.pageuis.HomePageUI;
import com.youku.pageuis.SearchPageUI;

public class HomePage extends BasePage {

	public HomePage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 点击当前页面指定的button
	 * @param index 要点击的button的index,限可视区域
	 */
	public void clickButton(int index) throws Exception{
		driver.onclickBeanAtIndex(HomePageUI.HOME_BUTTONS,index);
	}
	/**
	 * 点击当前页面倒数指定的某个button
	 * @param index 要点击的button倒数的index,限可视区域
	 * @return 
	 */
	public void backClickbutton(int index) throws Exception{
		driver.onclickBeanAtIndex(HomePageUI.HOME_BUTTONS,driver.countOfElment(HomePageUI.HOME_BUTTONS) - index);
	}
	/**
	 * 滑动到某个element
	 * @param element 控件的名字
	 */
	public void scrollToElement(String element) throws Exception{
		driver.scrollToElementCustom(GetElementWay.NAME, element,2000);
	}
	/**
	 * 向上滑动页面
	 * @throws Exception 
	 * @param time 滑动次数
	 */
	public void scrollToBottom(int time) throws Exception {
				
		JSONObject windowSize = driver.getWindowSize();
		
		int windowX = windowSize.getIntValue("height");
		int windowY = windowSize.getIntValue("width");
		
		int startX =(int)windowX*1/5;
  		int	endX =(int)windowX*4/5;
  		int	startY = windowY-20;
  		int	endY =startY;
  		
  		for(int i=0;i<time;i++){
  			driver.drag(startX, startY, endX, endY, 0.5);
  			driver.sleep(2000);
  		}

		
	}
	/**
	 * 点击当前页面指定的Cell
	 * @param index 要点击的Cell的index,限可视区域
	 */
	public void clickCell(int index) throws Exception{
		driver.onclickBeanAtIndex(HomePageUI.HOME_CELL,index);
	}
	/**
	 * 左滑页面切换频道
	 * @throws Exception
	 * @param time 滑动次数
	 */
	public void scrollLeft(int time) throws Exception{

		JSONObject windowSize = driver.getWindowSize();
		int windowX = windowSize.getIntValue("height");
		int windowY = windowSize.getIntValue("width");
		
		int startX =(int)windowX*3/8;
  		int	endX = startX;
  		int	startY = (int) windowY*4/5;
  		int	endY =(int) windowY*1/5;

  		for(int i=0;i<time;i++){
  			driver.drag(startX, startY, endX, endY, 0.5);
  			driver.sleep(2000);
  		}
		

	}
	
	/**
	 * 右滑页面切换频道
	 * @throws Exception
	 * @param time 滑动次数
	 */
	public void scrollRight(int time) throws Exception{

		JSONObject windowSize = driver.getWindowSize();
		int windowX = windowSize.getIntValue("height");
		int windowY = windowSize.getIntValue("width");
		
		int startX =(int)windowX*3/8;
  		int	endX = startX;
  		int	startY = (int) windowY*1/5;
  		int	endY =(int) windowY*4/5;

  		for(int i=0;i<time;i++){
  			driver.drag(startX, startY, endX, endY, 0.5);
  			driver.sleep(2000);
  		}
		

	}
	
	/**
	 * 回到页面顶部
	 * @throws Exception
	 */
	public void resume() throws Exception{

		driver.onclickBean(HomePageUI.HOME_HEAD);

	}
	/**
	 * 进入搜索首页
	 */
	public void toSearchPage() throws Exception{
		driver.onclickBean(HomePageUI.HOME_SearchInput);
	}
	/**
	 * 向搜索框输入内容
	 * @param keyword 搜索框中输入的内容
	 */
	public void searchInput(String keyword) throws Exception{
		driver.inputBean(HomePageUI.HOME_SearchInput, keyword);
	}
	/**
	 * 点击底部订阅按钮进入订阅模块
	 */
	public void toSubs() throws Exception{
		driver.onclickBean(HomePageUI.HOME_Subs);
		driver.sleep(2000);
	}
	/**
	 * 点击搜全网按钮进入搜索结果页
	 */
	public void clickSearchBtn() throws Exception{
		driver.onclickBean(HomePageUI.HOME_SEARCHBTN);
	}
	/**
	 * 点击底部我的按钮进入我的模块
	 */
	public void toMinePage() throws Exception{
		driver.onclickBean(HomePageUI.HOME_MineBtn);
		driver.sleep(2000);
	}
	/**
	 * 点击底部首页按钮进入首页模块
	 */
	public void toHomePage() throws Exception{
		driver.onclickBean(HomePageUI.HOME_HomeBtn);
	}
	/**
	 * 点击底部会员按钮进入会员模块
	 */
	public void toVipPage() throws Exception{
		driver.onclickBean(HomePageUI.HOME_VipBtn);
		driver.sleep(2000);
	}
	/**
	 * 点击底部头条按钮进入头条模块
	 */
	public void toToplinePage() throws Exception{
		driver.onclickBean(HomePageUI.HOME_TopLine);
		driver.sleep(2000);
	}
	
}