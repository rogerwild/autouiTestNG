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
import com.youku.pageuis.MemberPageUI;
import com.youku.pageuis.MinePageUI;
import com.youku.pageuis.SubscribePageUI;

public class MinePage extends BasePage {

	public MinePage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 点击倒数指定的button
	 * @param index button倒数的索引
	 * @throws Exception 
	 */
	public void oppositeClikBtn(int index) throws Exception {
		int i= driver.countOfElment(MinePageUI.MINEPAGE_BUTTONS);
		driver.onclickBeanAtIndex(MinePageUI.MINEPAGE_BUTTONS, i-index);
	}
	/**
	 * 点击头像
	 */
	public void clickHead() throws Exception {
		driver.onclickBean(MinePageUI.MINEPAGE_HEAD);
	}
	/**
	 * 点击游客登录按钮
	 */
	public void clickTouristLoginBtn() throws Exception {
		driver.onclickBean(MinePageUI.MINEPAGE_TOURISTLogin);
		driver.sleep(2000);
	}
	/**
	 * 进入记录页面
	 */
	public void toHistoryPage() throws Exception {
		driver.onclickBean(MinePageUI.MINEPAGE_HISTORY);
		driver.sleep(2000);
	}
	/**
	 * 进入收藏页面
	 */
	public void toCollectPage() throws Exception {
		driver.onclickBean(MinePageUI.MINEPAGE_COLLECT);
		driver.sleep(2000);
	}
	/**
	 * 进入缓存页面
	 */
	public void toDownloadPage() throws Exception {
		driver.onclickBean(MinePageUI.MINEPAGE_DOWNLOAD);
		driver.sleep(2000);
	}
	/**
	 * 进入消息页面
	 */
	public void toMessagePage() throws Exception {
		driver.onclickBean(MinePageUI.MINEPAGE_MESSAGE);
		driver.sleep(2000);
	}
	/**
	 * 进入上传页面
	 */
	public void toUploadPage() throws Exception {
		driver.onclickBean(MinePageUI.MINEPAGE_UPLOAD);
		driver.sleep(2000);
	}
	/**
	 * 进入客服页面
	 */
	public void toCusserPage() throws Exception {
		driver.onclickBean(MinePageUI.MINEPAGE_CUSSER);
		driver.sleep(2000);
	}
	/**
	 * 进入设置页面
	 */
	public void toSetupPage() throws Exception {
		driver.onclickBean(MinePageUI.MINEPAGE_SETUP);
		driver.sleep(2000);
	}
	/**
	 * 进入首页页面
	 */
	public void toHomePage() throws Exception {
		driver.onclickBean(MinePageUI.MINEPAGE_HOMEBtn);
		driver.sleep(2000);
	}
	

}