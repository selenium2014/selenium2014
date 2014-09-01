package com.learningselenium.remotewebdriver;

import java.io.File;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testRemoteWebDriverTakesScreenshot {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"), 
                DesiredCapabilities.firefox());
	}
	
	@Test
	public void testRemoteWebDriverTakesScreenshot() throws Exception {
		driver.get("http://www.google.com");
		
		WebDriver augmentedDriver = new Augmenter().augment(driver);
        
		File screenshot = ((TakesScreenshot)augmentedDriver).
                            getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, 
        		new File("/Selenium2/remotewebdriver_screenshot.png"));
	}
		
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
