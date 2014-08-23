package com.learningselenium.pageobject.findby.pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage2 {
	WebDriver driver;

	@FindBy(how = How.ID, id = "tbUserName")
	WebElement username;
	@FindBy(how = How.ID, id = "tbPassword")
	WebElement password;
	@FindBy(how = How.ID, id = "btnLogin")
	WebElement loginbutton;

	public LoginPage2(WebDriver driver) {
		this.driver = driver;
		
		/************************************************
		 * the driver.findElement() methods are removed *
		 ************************************************/
	}

	public void login(String userName, String passWord) {
		username.sendKeys(userName);
		password.sendKeys(passWord);
		loginbutton.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
}
