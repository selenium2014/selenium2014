package com.learningselenium.simplewebdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testFirefoxDriver {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}
}
