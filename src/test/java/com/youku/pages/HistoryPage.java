/**
 * 
 */
/**
 * @author roger
 *
 */
package com.youku.pages;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePage;

import com.alibaba.fastjson.JSONObject;
import com.youku.pageuis.HistoryPageUI;
import com.youku.pageuis.HomePageUI;

public class HistoryPage extends BasePage {

	public HistoryPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 点击当前页面指定的button
	 * @param index 要点击的button的index,限可视区域
	 */
	public void clickButton(int index) throws Exception{
		driver.onclickBeanAtIndex(HistoryPageUI.HISTORYPAGE_BUTTONS,index);
	}
	/**
	 * 清除全部记录
	 */
	public void clearHistory() throws Exception{
		driver.onclickBean(HistoryPageUI.HISTORYPAGE_EDIT);
		driver.sleep(1000);
		driver.onclickBean(HistoryPageUI.HISTORYPAGE_SELECTALL);
		driver.sleep(1000);
		driver.tap(731, 753);
		driver.sleep(1000);
		driver.acceptAlert();
	}
	
}