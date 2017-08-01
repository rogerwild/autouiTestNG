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

public class MemberPage extends BasePage {

	public MemberPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 点击倒数指定的button
	 * @param index button倒数的索引
	 * @throws Exception 
	 */
	public void oppositeClikBtn(int index) throws Exception {
		int i= driver.countOfElment(MemberPageUI.MEMBERPAGE_BUTTONS);
		driver.onclickBeanAtIndex(MemberPageUI.MEMBERPAGE_BUTTONS, i-index);
	}
	/**
	 * 进入我的模块
	 * @throws Exception 
	 */
	public void toMinePage() throws Exception {
		driver.onclickBean(MemberPageUI.MEMBERPAGE_MineBtn);
	}
	/**
	 * 进入头条模块
	 * @throws Exception 
	 */
	public void toTopLinePage() throws Exception {
		driver.onclickBean(MemberPageUI.MEMBERPAGE_TOPline);
	}
	/**
	 * 进入首页模块
	 * @throws Exception 
	 */
	public void toHomePage() throws Exception {
		driver.onclickBean(MemberPageUI.MEMBERPAGE_HOMEBtn);
	}
}