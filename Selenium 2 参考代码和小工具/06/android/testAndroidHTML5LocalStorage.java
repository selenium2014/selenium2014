package com.learningselenium.android;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.android.AndroidDriver;

public class testAndroidHTML5LocalStorage {
	@Test
	public void testHTML5LocalStorage() throws Exception {
		
		WebDriver driver = new AndroidDriver("http://localhost:8888/wd/hub");

		driver.get("http://www.baidu.com");

		LocalStorage localStorage = 
				((WebStorage) driver).getLocalStorage();
		
		localStorage.clear();
		
		System.out.println("The size of LocalStorage is : " 
		+ localStorage.size());
		
		localStorage.setItem("key1", "learningselenium");
		
		System.out.println(localStorage.getItem("key1"));
		
		driver.quit();
	}
}



