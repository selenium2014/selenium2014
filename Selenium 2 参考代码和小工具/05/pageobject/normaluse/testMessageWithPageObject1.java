package com.learningselenium.pageobject.normaluse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testMessageWithPageObject1 {
	public static void main(String... args) {	
		WebDriver driver = new FirefoxDriver();
		
		MainPage1 mainPage = new MainPage1(driver);
		MessagePage1 messagePage = new MessagePage1(driver);

		mainPage.openMainPage("http://www.cnblogs.com");
		mainPage.login("seleniumpageobject", "pageobject123");
		messagePage.sendMessage("seleniumpageobject", "testSendingMessage1", "text messages 1");
		messagePage.sendMessage("seleniumpageobject", "testSendingMessage2", "text messages 2");
		mainPage.logout();
		
		mainPage.openMainPage("http://www.cnblogs.com");
		mainPage.login("seleniumpageobject", "pageobject123");
		messagePage.sendMessage("seleniumpageobject", "testSendingMessage3", "text messages 3");
		messagePage.deleteAllMessage();
		mainPage.logout();
		
		driver.quit();
	}
}
