package com.learningselenium.pageobject.normaluse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {
	WebDriver driver;
	WebElement username;
	WebElement password;
	WebElement loginbutton;
	
	public LoginPage1(WebDriver driver) {
		this.driver = driver;

		username = driver.findElement(By.id("tbUserName"));	
		password = driver.findElement(By.id("tbPassword"));	
		loginbutton = driver.findElement(By.id("btnLogin"));
	}
	
	public void login(String userName, String passWord) {
		username.sendKeys(userName);
		password.sendKeys(passWord);
		loginbutton.click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
}
