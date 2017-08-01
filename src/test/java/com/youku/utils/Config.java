package com.youku.utils;

import java.io.File;


public class Config {

   // 根目录
   public static final String RootPath = System.getProperty("user.dir");
   //截图保存目录
   public static final String ScreenshotPath = RootPath + File.separator + "screenshot";
   //结果日志保存文件
   public static final String ResultLogPath = RootPath + File.separator + "result.log";
   //详细执行日志保存文件
   public static final String CustomLogPath = RootPath + File.separator + "custom.log";
   //crash日志存放路径
   public static final String CrashfilePath = RootPath + File.separator + "crashfile";
   //crash日志存放路径
   public static final String CustomLogRemovePath = "/Users/roger/Sites/WebRoot/result.log";
   //要开启的macaca server个数
   //public static final String NumOfMacacaServer = "2";
   // 目标平台- ios android
   public static final String PLATFORM = "ios";
   // 测试包所在路径
   public static final String PackagePath = RootPath + File.separator + "app";
   // 是否覆盖安装 0: 启动并安装 app。1 (默认): 卸载并重装 app。 2: 仅重装 app。3: 在测试结束后保持 app 状态
   public static final String REUSE = "3";

   // ios平台相关信息 各参数含义参考 https://macacajs.github.io/macaca/desired-caps.html
   public static final String IOS_PLATFORM_NAME = "iOS";
   public static final String IOS_DEVICE_NAME = "iPad Air 2";
   //以.zip包的形式安装到手机 支持.ipa，.app 或者 .apk 或者是包含上述文件格式的 Zip 文件
   public static final String IOS_APP = RootPath + File.separator + "app/ios-app-bootstrap.zip";
   //安装到真机中的app的boundleid
   public static final String IOS_BUNDLEID = "com.youku.hd";//"com.youku.YouKu";//
   public static final String IOS_UDID = "a7cf4ecadda076c9677f38f997bdf96215a62d01";

   // 安卓平台相关信息
   public static final String ADR_PLATFORM_NAME = "Android";
   //支持.ipa，.app 或者 .apk 或者是包含上述文件格式的 Zip 文件
   public static final String ADR_APP = RootPath + File.separator + "app/android-app-bootstrap.zip";
   // 多台设备时，如果指定某一台设备可以在这里指定udid
   public static final String ADR_UDID = "";



}