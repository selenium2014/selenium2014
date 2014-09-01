package com.learningselenium.pageobject.findby.pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage2 {
	WebDriver driver;
	
	@FindBy(how = How.LINK_TEXT, linkText = "登录")
	WebElement loginLink;
	@FindBy(how = How.LINK_TEXT, linkText = "退出")
	WebElement logoutLink;
	
	public MainPage2(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openMainPage(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	}
	
	public void login(String userName, String passWord) {
		/************************************************
		 * the driver.findElement() method is removed *
		 ************************************************/
		
		loginLink.click();
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbUserName")));
		
		LoginPage2 loginPage = PageFactory.initElements(driver, LoginPage2.class);
		loginPage.login(userName, passWord);
	}
	
	public void logout() {
		/************************************************
		 * the driver.findElement() method is removed *
		 ************************************************/
		
		logoutLink.click();
		
		LogoutPage2 logoutPage = PageFactory.initElements(driver, LogoutPage2.class);
		logoutPage.logout();
	}
}
