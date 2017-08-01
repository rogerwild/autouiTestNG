package com.youku.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Shell {
	
	public static void crashMonitor(final String UDID, final String BUNDLEID) throws IOException, InterruptedException {
		
		Runnable runnable = new Runnable() {  
            public void run() {
            	
            	
            	Process pp;
				try {
					
					System.out.println("=======启动crash日志收集进程=======");
					pp = Runtime.getRuntime().exec("/usr/local/bin/idevicesyslog -u "+UDID);
					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(pp.getInputStream()));

	                String line;
	                //String curbundleid = BUNDLEID;
	                
	                while ((line = bufferedReader.readLine()) != null) {
	                    /*if(line.contains("HW kbd: currently")){
	                    	//System.out.println("=============="+line);
	                    	if(line.split(" ")[8].equals("currently")){
	                    		curbundleid = line.split(" ")[9];
	                    	}else{
	                    		curbundleid = line.split(" ")[10];
	                    	}
	                    	//System.out.println("=============="+curbundleid);
	                    	
	                    	if(!curbundleid.equals("com.youku.hd")){
	                     		//System.out.println("==当前启动的APP bundleid是<"+curbundleid+">,非测试APP，重新呼起测试APP====");
	                     		//Runtime.getRuntime().exec("/usr/local/bin/idevicedebug -u " + UDID + " run " + BUNDLEID);
	                     		//收集.crash日志
	                     		System.out.println("收集.crash日志");
	                     		Runtime.getRuntime().exec("/usr/local/bin/idevicecrashreport -k -g YoukuHD " + Config.CrashfilePath);
	                     		Runtime.getRuntime().exec("pkill idevice");
	                     	}
	                    }*/
	                	if(!line.contains(BUNDLEID)) {
	                    	//收集.crash日志
                     		System.out.println("收集.crash日志");
                     		Runtime.getRuntime().exec("/usr/local/bin/idevicecrashreport -u " + UDID + " -e -k "  + Config.CrashfilePath);
                     		Runtime.getRuntime().exec("pkill idevice");
	                    }
	                }
	                
	                bufferedReader.close();
	               
	                
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
            }  
        };  
        ScheduledExecutorService service = Executors  
                .newSingleThreadScheduledExecutor();  
        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间  
        //service.scheduleAtFixedRate(runnable, 30, 10, TimeUnit.SECONDS);  
        service.scheduleWithFixedDelay(runnable, 30, 30, TimeUnit.SECONDS);

    }

    
    
    public static void main(String[] args) throws IOException, Exception {
    	crashMonitor(Config.IOS_UDID,Config.IOS_BUNDLEID);
	}
}
