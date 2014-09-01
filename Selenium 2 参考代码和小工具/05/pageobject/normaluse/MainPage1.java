package com.learningselenium.pageobject.normaluse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage1 {
	WebDriver driver;
	WebElement loginLink;
	WebElement logoutLink;
	
	public MainPage1(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openMainPage(String url) {
		driver.get(url);
		loginLink = driver.findElement(By.linkText("登录"));
	}
	
	public void login(String userName, String passWord) {
		loginLink.click();
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbUserName")));
		
		LoginPage1 loginPage = new LoginPage1(driver);
		loginPage.login(userName, passWord);
	}
	
	public void logout() {
		logoutLink = driver.findElement(By.linkText("退出"));
		logoutLink.click();
		
		LogoutPage1 logoutPage = new LogoutPage1(driver);
		logoutPage.logout();
	}
}
