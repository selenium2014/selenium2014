package com.learningselenium.ios;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import junit.framework.TestCase;

public class testiOSAppiumBaiduRealDevice extends TestCase{
	public void testBaidu() throws Exception {
		DesiredCapabilities safariCapabilities = new DesiredCapabilities();
		safariCapabilities.setCapability("device", "iphone");
		safariCapabilities.setCapability("version", "7.0");
		safariCapabilities.setCapability("app", "safari"); 
		
        RemoteWebDriver driver = new RemoteWebDriver(
        		new URL("http://localhost:4723/wd/hub"), safariCapabilities);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
		driver.get("http://www.baidu.com");
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);

		driver.close();
	}
}
