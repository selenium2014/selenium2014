package com.learningselenium.ios;

import junit.framework.TestCase;

import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.uiautomation.ios.IOSCapabilities;

public class testiOSBaidu extends TestCase{
	
	public void testBaidu() throws Exception {
		DesiredCapabilities safari = IOSCapabilities.iphone("Safari");
        RemoteWebDriver driver = new RemoteWebDriver(
        		new URL("http://localhost:5555/wd/hub"), safari);
		
		driver.get("http://www.baidu.com");
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);

		driver.close();
	}
}
