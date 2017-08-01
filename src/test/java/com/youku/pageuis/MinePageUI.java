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

public class MinePageUI extends BasePageUI{
	
	/**
	 * button的集合
	 */
	public static final CommonUIBean MINEPAGE_BUTTONS = new CommonUIBean(GetElementWay.CLASS_NAME, "XCUIElementTypeButton", "MINEPAGE BUTTONS");
	/**
	 * 设置按钮
	 */
	public static final CommonUIBean MINEPAGE_SETUP = new CommonUIBean(GetElementWay.NAME, "设置", "设置按钮");
	/**
	 * 未登录头像按钮
	 */
	public static final CommonUIBean MINEPAGE_HEAD = new CommonUIBean(GetElementWay.NAME, "mtoux", "未登录头像按钮");
	/**
	 * 游客登录按钮
	 */
	public static final CommonUIBean MINEPAGE_TOURISTLogin = new CommonUIBean(GetElementWay.NAME, "游客登录", "游客登录按钮");
	/**
	 * 记录按钮
	 */
	public static final CommonUIBean MINEPAGE_HISTORY = new CommonUIBean(GetElementWay.NAME, "记录", "记录按钮");
	/**
	 * 收藏按钮
	 */
	public static final CommonUIBean MINEPAGE_COLLECT = new CommonUIBean(GetElementWay.NAME, "收藏", "收藏按钮");
	/**
	 * 缓存按钮
	 */
	public static final CommonUIBean MINEPAGE_DOWNLOAD = new CommonUIBean(GetElementWay.NAME, "缓存", "缓存按钮");
	/**
	 * 消息按钮
	 */
	public static final CommonUIBean MINEPAGE_MESSAGE = new CommonUIBean(GetElementWay.NAME, "消息", "消息按钮");
	/**
	 * 上传按钮
	 */
	public static final CommonUIBean MINEPAGE_UPLOAD = new CommonUIBean(GetElementWay.NAME, "上传", "上传按钮");
	/**
	 * 客服按钮
	 */
	public static final CommonUIBean MINEPAGE_CUSSER = new CommonUIBean(GetElementWay.NAME, "客服", "客服按钮");
	/**
	 * 底部导航首页按钮
	 */
	public static final CommonUIBean MINEPAGE_HOMEBtn = new CommonUIBean(GetElementWay.NAME, "home@2x", "底部导航首页按钮");
	


}