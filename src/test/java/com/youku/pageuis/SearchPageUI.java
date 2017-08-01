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

public class SearchPageUI extends BasePageUI{
	/**
	 * 热搜榜标签
	 */
	public static final CommonUIBean SEARCH_HOTLIST = new CommonUIBean(GetElementWay.NAME, "热搜榜", "SEARCH HOTLIST");
	/**
	 * 搜索首页StaticText的集合
	 */
	public static final CommonUIBean SEARCH_STATICTEXTS = new CommonUIBean(GetElementWay.CLASS_NAME, "XCUIElementTypeStaticText", "SEARCH STATICTEXTS");
	/**
	 * 搜索框
	 */
	public static final CommonUIBean SEARCH_INPUT = new CommonUIBean(GetElementWay.CLASS_NAME, "XCUIElementTypeTextField", "SEARCH INPUT");
	/**
	 * 搜全网按钮
	 */
	public static final CommonUIBean SEARCH_SEARCH = new CommonUIBean(GetElementWay.NAME, "搜全网", "搜全网按钮");
	/**
	 * kubox table
	 */
	public static final CommonUIBean SEARCH_KUBOX = new CommonUIBean(GetElementWay.CLASS_NAME, "XCUIElementTypeTable", "kubox table");
	/**
	 * 键盘的search键
	 */
	public static final CommonUIBean SEARCH_KEYBOARDS = new CommonUIBean(GetElementWay.NAME, "Search", "KEYBOARD SEARCH");
	/**
	 * 键盘的隐藏键
	 */
	public static final CommonUIBean SEARCH_KEYBOARDH = new CommonUIBean(GetElementWay.NAME, "隐藏键盘", "KEYBOARD HIDE");
	/**
	 * 清空搜索记录按钮
	 */
	public static final CommonUIBean SEARCH_CLEARALL = new CommonUIBean(GetElementWay.NAME, "清空所有记录", "CLEAR ALL");
	/**
	 * 搜索记录
	 */
	public static final CommonUIBean SEARCH_HISTORY = new CommonUIBean(GetElementWay.NAME, "动物世界", "搜索记录");
	/**
	 * 删除单条记录按钮
	 */
	public static final CommonUIBean SEARCH_CLEARONE = new CommonUIBean(GetElementWay.NAME, "icon delete", "CLEARONE BUTTON");
	/**
	 * cell的集合
	 */
	public static final CommonUIBean SEARCH_CELLS = new CommonUIBean(GetElementWay.CLASS_NAME, "XCUIElementTypeCell", "CELLS");
}