package com.learningselenium.findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBaiduById {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		
		WebElement searchBox = driver.findElement(By.id("kw"));
		searchBox.sendKeys("test Baidu By Id");
		
		WebElement searchButton = driver.findElement(By.id("su")); 
		searchButton.submit();
		
		driver.close();
	}
}
