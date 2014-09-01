package com.learningselenium.normalwebdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class testTakesScreenshot {
	WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("http://www.baidu.com/");
	}
	
	@Test
	public void testTakesScreenshot() throws Exception {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("/Selenium2/codes/4/screenshot.png"));
	}
		
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
