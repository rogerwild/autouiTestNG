/**
 * 
 */
/**
 * @author roger
 *
 */
package com.youku.pages;

import macaca.java.biz.BasePage;

import com.alibaba.fastjson.JSONObject;
import com.youku.pageuis.SearchResultPageUI;

public class SearchResultPage extends BasePage {

	public SearchResultPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 点击取消按钮
	 */
	public void clikBack() {
		driver.onclickBean(SearchResultPageUI.SEARCHRESULT_BACK);
	}
	/**
	 * 上下滑动
	 * @throws Exception
	 */
	public void scroll() throws Exception{

		JSONObject windowSize = driver.getWindowSize();
		int windowX = windowSize.getIntValue("width");
		int windowY = windowSize.getIntValue("height");

		int centerx=(int)windowX/2;
		int centery=(int)windowY/2;
//		driver.swipe(centerX,(int)windowHeight-100, centerX, 300, 500);
//		driver.drag(centerx, (int)windowHeight-100, centerx, 200, 0.05, 10);
		driver.drag(centerx, centery, centerx+300, centery, 1);
		driver.sleep(1000);
//		driver.swipe(centerX, 300, centerX, (int)windowHeight-100, 500);
//		driver.drag(centerx, 200, centerx, (int)windowHeight-100, 0.05, 10);
		driver.drag(centerx, centery, centerx-300, centery, 1);
	}
	/**
	 * 点击指定的button
	 * @param index button的索引
	 */
	public void clikButton(int index) {
		driver.onclickBeanAtIndex(SearchResultPageUI.SEARCHRESULT_BUTTONS, index);
	}
	/**
	 * 点击指定的cell
	 * @param index cell的索引
	 */
	public void clikCell(int index) {
		driver.onclickBeanAtIndex(SearchResultPageUI.SEARCHRESULT_CELLS, index);
	}
	/**
	 * 点击倒数指定的button
	 * @param index button倒数的索引
	 * @throws Exception 
	 */
	public void oppositeClikBtn(int index) throws Exception {
		int i= driver.countOfElment(SearchResultPageUI.SEARCHRESULT_BUTTONS);
		driver.onclickBeanAtIndex(SearchResultPageUI.SEARCHRESULT_BUTTONS, i-index);
	}

}