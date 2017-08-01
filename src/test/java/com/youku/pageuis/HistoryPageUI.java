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

public class HistoryPageUI extends BasePageUI{
	
	/**
	 * button的集合
	 */
	public static final CommonUIBean HISTORYPAGE_BUTTONS = new CommonUIBean(GetElementWay.CLASS_NAME, "XCUIElementTypeButton", "MINEPAGE BUTTONS");
	/**
	 * 编辑按钮
	 */
	public static final CommonUIBean HISTORYPAGE_EDIT = new CommonUIBean(GetElementWay.NAME, "编辑", "编辑按钮");
	/**
	 * 全选按钮
	 */
	public static final CommonUIBean HISTORYPAGE_SELECTALL = new CommonUIBean(GetElementWay.NAME, "全选", "全选按钮");
	


}