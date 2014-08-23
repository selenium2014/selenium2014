package com.learningselenium.web.frontier.perf;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import junit.framework.TestCase;

public class testiOSAppiumHttpWatch extends TestCase{
	public void testGoogle() throws Exception {
		DesiredCapabilities safariCapabilities = new DesiredCapabilities();
		safariCapabilities.setCapability("device", "iphone");
		safariCapabilities.setCapability("version", "7.0");
		safariCapabilities.setCapability("app", "safari"); 
		
        RemoteWebDriver driver = new RemoteWebDriver(
        		new URL("http://localhost:4723/wd/hub"), safariCapabilities);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
		driver.get("hwhttp://www.google.com");

		driver.close();
	}
}
