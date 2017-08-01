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

public class VideoDetialPageUI extends BasePageUI{
	/**
	 * 会员免广告按钮
	 */
	public static final CommonUIBean SKIPAD = new CommonUIBean(GetElementWay.NAME, "会员免广告", "PLAYER SKIPAD");
	
	/**
	 * 下载按钮
	 */
	public static final CommonUIBean DOWNLOAD = new CommonUIBean(GetElementWay.NAME, "缓存", "PLAYER DOWNLOAD");
	/**
	 * 缓存面板
	 */
	public static final CommonUIBean DOWANLOADBOARD = new CommonUIBean(GetElementWay.CLASS_NAME , "XCUIElementTypeCollectionView", "缓存面板");
	/**
	 * 缓存面板关闭按钮
	 */
	public static final CommonUIBean DOWNLOADCLOSE = new CommonUIBean(GetElementWay.NAME, "broadcast forward close", "PLAYER DOWNLOADCLOSE");
	/**
	 * 缓存面板 去缓存中心按钮
	 */
	public static final CommonUIBean DOWNLOADCENTER = new CommonUIBean(GetElementWay.NAME, "downloadCenter", "PLAYER DOWNLOADCENTER");
	/**
	 * 播放详情页button的集合
	 */
	public static final CommonUIBean BUTTONS = new CommonUIBean(GetElementWay.CLASS_NAME, "XCUIElementTypeButton", "播放详情页buttons");
	
}