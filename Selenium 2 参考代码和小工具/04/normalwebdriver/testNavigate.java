package com.learningselenium.normalwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testNavigate {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.baidu.com");
		System.out.println("Go to url: " + driver.getCurrentUrl());
		
		driver.navigate().to("http://www.cnblogs.com");
		System.out.println("Navigate to url: " + driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		System.out.println("Back to url: " + driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("Forward to url: " + driver.getCurrentUrl());

		driver.quit();
	}
}
