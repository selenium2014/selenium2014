package com.learningselenium.pageobject.findby.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage2 {
	WebDriver driver;
	
	public LogoutPage2(WebDriver driver) {
		this.driver = driver;
	}
	
	public void logout() {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
}
