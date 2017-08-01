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

public class HomePageUI extends BasePageUI{
	/**
	 * 底部导航头条按钮
	 */
	public static final CommonUIBean HOME_TopLine = new CommonUIBean(GetElementWay.NAME, "topline@2x", "HOME SYMBOL");
	/**
	 * 首页button的集合
	 */
	public static final CommonUIBean HOME_BUTTONS = new CommonUIBean(GetElementWay.CLASS_NAME, "XCUIElementTypeButton", "HOME BUTTONS");
	/**
	 * 首页ScrollView的集合
	 */
	public static final CommonUIBean HOME_SCROLLVIEW = new CommonUIBean(GetElementWay.CLASS_NAME, "XCUIElementTypeScrollView", "首页ScrollView");
	/**
	 * 首页Cell的集合
	 */
	public static final CommonUIBean HOME_CELL = new CommonUIBean(GetElementWay.CLASS_NAME, "XCUIElementTypeCell", "首页Cell");
	
	/**
	 * 头部iPad
	 */
	public static final CommonUIBean HOME_HEAD = new CommonUIBean(GetElementWay.NAME, "iPad", "HOME HEAD");
	/**
	 * 搜索框
	 */
	public static final CommonUIBean HOME_SearchInput = new CommonUIBean(GetElementWay.NAME, "searchLeft@2x", "首页搜索框");
	/**
	 * 底部导航订阅按钮
	 */
	public static final CommonUIBean HOME_Subs = new CommonUIBean(GetElementWay.NAME, "subs@2x", "首页底部订阅按钮");
	/**
	 * 搜全网按钮
	 */
	public static final CommonUIBean HOME_SEARCHBTN = new CommonUIBean(GetElementWay.NAME, "搜全网", "搜全网按钮");
	/**
	 * 底部导航我的按钮
	 */
	public static final CommonUIBean HOME_MineBtn = new CommonUIBean(GetElementWay.NAME, "user@2x", "底部MineBtn");
	/**
	 * 底部导航首页按钮
	 */
	public static final CommonUIBean HOME_HomeBtn = new CommonUIBean(GetElementWay.NAME, "home@2x", "底部HomeBtn");
	/**
	 * 底部导航会员按钮
	 */
	public static final CommonUIBean HOME_VipBtn = new CommonUIBean(GetElementWay.NAME, "vip@2x", "底部VipBtn");

}