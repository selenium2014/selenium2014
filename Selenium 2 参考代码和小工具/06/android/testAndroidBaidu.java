package com.learningselenium.android;

import junit.framework.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;

public class testAndroidBaidu extends TestCase{
	
	public void testBaidu() throws Exception {
		
		WebDriver driver = new AndroidDriver("http://localhost:8888/wd/hub");
		
		driver.get("http://www.baidu.com");
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);

		driver.close();
	}
}
