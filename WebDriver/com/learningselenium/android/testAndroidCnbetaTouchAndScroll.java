package com.learningselenium.android;

import junit.framework.TestCase;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class testAndroidCnbetaTouchAndScroll extends TestCase {

	public void testBaidu() throws Exception {

		WebDriver driver = new AndroidDriver("http://localhost:8888/wd/hub");

		driver.get("http://m.cnbeta.com");

		((Rotatable) driver).rotate(ScreenOrientation.PORTRAIT);
		
		TouchActions touch = new TouchActions(driver);

		touch.scroll(0, 400).build().perform();
		
		driver.close();
	}
}
