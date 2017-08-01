/**
 * 
 */
/**
 * @author roger
 *
 */
package com.youku.pages;

import macaca.java.biz.BasePage;
import com.youku.pageuis.SearchPageUI;

public class SearchPage extends BasePage {

	public SearchPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 点击指定的StaticText
	 * @param index 要点击的StaticText的index,限可视区域
	 */
	public void clickText(int index) throws Exception{
		driver.onclickBeanAtIndex(SearchPageUI.SEARCH_STATICTEXTS,index);
	}
	/**
	 * 向搜索框输入内容
	 * @param keyword 搜索框中输入的内容
	 */
	public void searchInput(String keyword) throws Exception{
		driver.inputBean(SearchPageUI.SEARCH_INPUT, keyword);

	}
	/**
	 * 点击kubox table
	 */
	public void clickKuboxSell(){
		driver.onclickBean(SearchPageUI.SEARCH_KUBOX);
	}
	/**
	 * 点击键盘的search
	 */
	public void clickKeyboardS(){
		driver.onclickBean(SearchPageUI.SEARCH_KEYBOARDS);
	}
	/**
	 * 点击键盘的hide
	 */
	public void clickKeyboardH(){
		driver.onclickBean(SearchPageUI.SEARCH_KEYBOARDH);
	}
	/**
	 * 点击搜全网按钮
	 */
	public void clickSearch(){
		driver.onclickBean(SearchPageUI.SEARCH_SEARCH);
	}
	/**
	 * 点击清空所有记录按钮
	 */
	public void clearAll(){
		driver.onclickBean(SearchPageUI.SEARCH_CLEARALL);
	}
	/**
	 * 点击搜索记录
	 */
	public void clickHistory(){
		driver.onclickBean(SearchPageUI.SEARCH_HISTORY);
	}
	/**
	 * 点击单条记录删除按钮
	 */
	public void clearOne(){
		driver.onclickBean(SearchPageUI.SEARCH_CLEARONE);
	}
	/**
	 * 点击指定的cell
	 * @param index 要点击的cell的index,限可视区域
	 */
	public void clickCell(int index) throws Exception{
		driver.onclickBeanAtIndex(SearchPageUI.SEARCH_CELLS, index);
	}

}