package com.learningselenium.ios;

import java.net.URL;

import junit.framework.TestCase;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testiOSAppiumBaidu extends TestCase{
	
	public void testBaidu() throws Exception {
		DesiredCapabilities safari = new DesiredCapabilities();
		safari.setCapability("app", "safari");
        RemoteWebDriver driver = new RemoteWebDriver(
        		new URL("http://localhost:4723/wd/hub"), safari);
		
		driver.get("http://www.baidu.com");
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);

		driver.close();
	}
}
