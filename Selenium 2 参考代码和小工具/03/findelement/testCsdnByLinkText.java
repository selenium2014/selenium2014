package com.learningselenium.findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCsdnByLinkText {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.csdn.com/");
		
		WebElement contactLink = driver.findElement(By.linkText("联系方式"));
		contactLink.click();
		
		driver.close();
	}
}
