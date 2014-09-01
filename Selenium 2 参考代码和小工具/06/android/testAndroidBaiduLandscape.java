package com.learningselenium.android;

import junit.framework.TestCase;

import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;

public class testAndroidBaiduLandscape extends TestCase{
	public void testBaidu() throws Exception {
		
		WebDriver driver = new AndroidDriver("http://localhost:8888/wd/hub");
		
		((Rotatable) driver).rotate(ScreenOrientation.LANDSCAPE); 
		
		driver.get("http://www.baidu.com");

		driver.close();
	}
}
