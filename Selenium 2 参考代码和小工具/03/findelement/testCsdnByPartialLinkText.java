package com.learningselenium.findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCsdnByPartialLinkText {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.csdn.com/");
		
		WebElement contactLink = driver.findElement(By.partialLinkText("联系"));
		contactLink.click();
		
		driver.close();
	}
}
