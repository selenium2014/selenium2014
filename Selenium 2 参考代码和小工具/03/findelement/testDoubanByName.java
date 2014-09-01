package com.learningselenium.findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testDoubanByName {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.douban.com/");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("test Douban By Name");
		searchBox.submit();
		
		driver.close();
	}
}
