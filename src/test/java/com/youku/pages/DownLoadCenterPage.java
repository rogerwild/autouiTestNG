/**
 * 
 */
/**
 * @author roger
 *
 */
package com.youku.pages;

import macaca.java.biz.BasePage;

import com.youku.pageuis.DownLoadCenterUI;
import com.youku.pageuis.VideoDetialPageUI;

public class DownLoadCenterPage extends BasePage {

	public DownLoadCenterPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 点击返回按钮
	 */
	public void clikBack() {
		driver.onclickBean(DownLoadCenterUI.DOWNLOADCENTER_BACK);
	}
	


}