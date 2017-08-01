/**
 * 
 */
/**
 * @author roger
 *
 */
package com.youku.pages;

import macaca.java.biz.BasePage;

import com.youku.pageuis.SubscribePageUI;
import com.youku.pageuis.VideoDetialPageUI;

public class VideoDetialPage extends BasePage {

	public VideoDetialPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 点击返回按钮
	 */
	/*public void clikBack() {
		driver.onclickBean(VideoDetialPageUI.BACK);
	}*/
	/**
	 * 点击倒数指定的button
	 * @param index button倒数的索引
	 * @throws Exception 
	 */
	public void oppositeClikBtn(int index) throws Exception {
		int i= driver.countOfElment(VideoDetialPageUI.BUTTONS);
		driver.onclickBeanAtIndex(VideoDetialPageUI.BUTTONS, i-index);
	}
	/**
	 * 下载某集视频
	 * @throws Exception 
	 */
	public void downLoad() throws Exception {
		driver.onclickBean(VideoDetialPageUI.DOWNLOAD);
		driver.sleep(1000);
		driver.onclickBean(VideoDetialPageUI.DOWANLOADBOARD);
		driver.sleep(10000);
	}
	/**
	 * 关闭缓存面板
	 */
	public void closeDownLoad() throws Exception {
		driver.onclickBean(VideoDetialPageUI.DOWNLOADCLOSE);
		driver.sleep(2000);
	}
	/**
	 * 去缓存中心
	 */
	public void toDownLoadCenter() throws Exception {
		driver.onclickBean(VideoDetialPageUI.DOWNLOADCENTER);
	}


}