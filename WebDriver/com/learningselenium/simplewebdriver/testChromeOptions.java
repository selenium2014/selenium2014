package com.learningselenium.simplewebdriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testChromeOptions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Selenium2/chromedriver");
		
		//Chrome Options
		ChromeOptions options = new ChromeOptions(); 
		options.addExtensions(new File("/path/to/extension.crx"));
		options.addArguments("arguments list");
		options.setBinary("/path/to/chrome");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.baidu.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if(driver.findElement(By.id("kw")).isEnabled()) {
			System.out.println("Baidu Search text box is editable!");
			driver.findElement(By.id("kw")).sendKeys("selenium");
			driver.findElement(By.id("su")).click();
		}
		else {
			System.out.println("Baidu Search text box is not editable!");			
		}
		
		driver.close();

	}
}
