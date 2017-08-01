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

public class TopLinePageUI extends BasePageUI{
	
	
	/**
	 * 底部导航我的按钮
	 */
	public static final CommonUIBean TopLinePage_MineBtn = new CommonUIBean(GetElementWay.NAME, "user@2x", "底部MineBtn");
	/**
	 * 回到顶部按钮
	 */
	public static final CommonUIBean TopLinePage_BacktoTop = new CommonUIBean(GetElementWay.NAME, "bt backtotop b", "回到顶部按钮");
	/**
	 * 底部导航首页按钮
	 */
	public static final CommonUIBean TopLinePage_HomePageBtn = new CommonUIBean(GetElementWay.NAME, "home@2x", "底部HomePageBtn");
	
}