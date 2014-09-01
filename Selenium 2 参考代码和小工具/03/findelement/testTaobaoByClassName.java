package com.learningselenium.findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testTaobaoByClassName {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.taobao.com/");
		
		WebElement searchBox = driver.findElement(By.className("search-combobox-input"));
		searchBox.sendKeys("test Taobao By ClassName");
		searchBox.submit();
		
		driver.close();
	}
}
