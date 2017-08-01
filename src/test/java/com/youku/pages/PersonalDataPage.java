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
import com.youku.pageuis.MinePageUI;
import com.youku.pageuis.PersonalDataPageUI;
import com.youku.pageuis.SubscribePageUI;

public class PersonalDataPage extends BasePage {

	public PersonalDataPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 点击退出登录按钮
	 */
	public void clickLogOut() throws Exception {
		driver.onclickBean(PersonalDataPageUI.PersonalDataPage_LogOut);
	}

}