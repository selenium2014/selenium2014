package com.learningselenium.normalwebdriver;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testMaxmizeBrowser {
	
	WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("http://www.baidu.com/");
	}
	
	@Test
	public void testMaxmizeBrowser() throws Exception {
		driver.manage().window().maximize();
	}
		
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
