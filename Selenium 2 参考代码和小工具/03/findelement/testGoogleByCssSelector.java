package com.learningselenium.findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testGoogleByCssSelector {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.cssSelector("#lst-ib"));
        searchBox.sendKeys("webdriver");
        searchBox.submit();
		
		driver.close();
	}
}
