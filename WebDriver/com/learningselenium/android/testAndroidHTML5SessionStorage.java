package com.learningselenium.android;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;

public class testAndroidHTML5SessionStorage {
	@Test
	public void testHTML5SessionStorage() throws Exception {
		
		WebDriver driver = new AndroidDriver("http://localhost:8888/wd/hub");

		driver.get("http://www.baidu.com");

		SessionStorage sessionStorage = 
				((WebStorage) driver).getSessionStorage();
		
		System.out.println("The size of SessionStorage is : " 
		+ sessionStorage.size());
		
		sessionStorage.setItem("key1", "learningselenium");
		
		System.out.println(sessionStorage.getItem("key1"));
		
		driver.quit();
	}
}
