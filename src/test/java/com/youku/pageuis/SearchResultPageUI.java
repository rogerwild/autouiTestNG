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

public class SearchResultPageUI extends BasePageUI{
	
	/**
	 * 取消按钮
	 */
	public static final CommonUIBean SEARCHRESULT_BACK = new CommonUIBean(GetElementWay.NAME, "取消", "SEARCHRESULT BACK");
	/**
	 * button的集合
	 */
	public static final CommonUIBean SEARCHRESULT_BUTTONS = new CommonUIBean(GetElementWay.CLASS_NAME, "XCUIElementTypeButton", "SEARCHRESULT BUTTONS");
	/**
	 * 筛选按钮
	 */
	public static final CommonUIBean SEARCHRESULT_SIFT = new CommonUIBean(GetElementWay.NAME, "筛选", "筛选按钮");
	/**
	 * cell的集合
	 */
	public static final CommonUIBean SEARCHRESULT_CELLS = new CommonUIBean(GetElementWay.CLASS_NAME, "XCUIElementTypeCell", "SEARCHRESULT CELLS");


}