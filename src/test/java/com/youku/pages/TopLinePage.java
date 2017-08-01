/**
 * 
 */
/**
 * @author roger
 *
 */
package com.youku.pages;

import macaca.java.biz.BasePage;

import com.alibaba.fastjson.JSONObject;
import com.youku.pageuis.MemberPageUI;
import com.youku.pageuis.SubscribePageUI;
import com.youku.pageuis.TopLinePageUI;

public class TopLinePage extends BasePage {

	public TopLinePage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 进入我的模块
	 * @throws Exception 
	 */
	public void toMinePage() throws Exception {
		driver.onclickBean(TopLinePageUI.TopLinePage_MineBtn);
	}
	/**
	 * 进入首页模块
	 * @throws Exception 
	 */
	public void toHomePage() throws Exception {
		driver.onclickBean(TopLinePageUI.TopLinePage_HomePageBtn);
	}
	
}