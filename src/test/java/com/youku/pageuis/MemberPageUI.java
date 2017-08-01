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

public class MemberPageUI extends BasePageUI{
	
	/**
	 * button的集合
	 */
	public static final CommonUIBean MEMBERPAGE_BUTTONS = new CommonUIBean(GetElementWay.CLASS_NAME, "XCUIElementTypeButton", "MEMBERPAGE BUTTONS");
	/**
	 * VIP福利社按钮
	 */
	public static final CommonUIBean MEMBERPAGE_VIPWELLBE = new CommonUIBean(GetElementWay.NAME, "VIP福利社", "VIP福利社按钮");
	/**
	 * 底部导航我的按钮
	 */
	public static final CommonUIBean MEMBERPAGE_MineBtn = new CommonUIBean(GetElementWay.NAME, "user@2x", "底部MineBtn");
	/**
	 * 底部头条按钮
	 */
	public static final CommonUIBean MEMBERPAGE_TOPline= new CommonUIBean(GetElementWay.NAME, "topline@2x", "底部头条按钮");
	/**
	 * 底部首页按钮
	 */
	public static final CommonUIBean MEMBERPAGE_HOMEBtn= new CommonUIBean(GetElementWay.NAME, "home@2x", "底部首页按钮");

}