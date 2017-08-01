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
import com.youku.pageuis.SubscribePageUI;

public class SubscribePage extends BasePage {

	public SubscribePage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 点击倒数指定的button
	 * @param index button倒数的索引
	 * @throws Exception 
	 */
	public void oppositeClikBtn(int index) throws Exception {
		int i= driver.countOfElment(SubscribePageUI.SUBSCRIBE_BUTTONS);
		driver.onclickBeanAtIndex(SubscribePageUI.SUBSCRIBE_BUTTONS, i-index);
	}
	/**
	 * 进入会员模块
	 * @throws Exception 
	 */
	public void toVip() throws Exception {
		driver.onclickBean(SubscribePageUI.SUBSCRIBE_VIPBtn);
	}
	/**
	 * 进入首页模块
	 * @throws Exception 
	 */
	public void toHomePage() throws Exception {
		driver.onclickBean(SubscribePageUI.SUBSCRIBE_HOMEBtn);
	}

}