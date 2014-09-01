package com.learningselenium.android;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.html5.AppCacheStatus;
import org.openqa.selenium.html5.ApplicationCache;

public class testAndroidHTML5AppCache {
	
	@Test
	public void testHTML5LocalStorage() throws Exception {
		WebDriver driver = new AndroidDriver("http://localhost:8888/wd/hub");
		
		driver.get("http://www.w3schools.com/html/tryhtml5_html_manifest.htm");
		
		AppCacheStatus status = ((ApplicationCache)driver).getStatus();
		
		assertEquals(status, AppCacheStatus.DOWNLOADING);
		
		System.out.println("Application Cache's status is : " 
												+ status.toString());
		
		driver.quit();
	}
	
}
