package com.learningselenium.simplewebdriver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class testFirefoxBinary {
	public static void main(String[] args) {
		FirefoxBinary firefoxBinary = new FirefoxBinary(new File("/path/to/firefox"));
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		
		WebDriver driver = new FirefoxDriver(firefoxBinary,firefoxProfile);
		driver.get("http://www.baidu.com");
		driver.close();
	}
}
