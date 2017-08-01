/**
 * 
 */
/**
 * @author roger
 *
 */
package com.youku.pageuis;

import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import macaca.client.common.GetElementWay;

public class PersonalDataPageUI extends BasePageUI{
	
	/**
	 * 退出登录按钮
	 */
	public static final CommonUIBean PersonalDataPage_LogOut = new CommonUIBean(GetElementWay.NAME, "退出登录", "退出登录按钮");
	/**
	 * 个人资料标签
	 */
	public static final CommonUIBean PersonalDataPage_PersonalTag = new CommonUIBean(GetElementWay.NAME, "个人资料", "个人资料标签");

}