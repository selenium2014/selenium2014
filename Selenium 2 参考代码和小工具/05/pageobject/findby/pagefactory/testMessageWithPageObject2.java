package com.learningselenium.pageobject.findby.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class testMessageWithPageObject2 {
	public static void main(String... args) {	
		WebDriver driver = new FirefoxDriver();
		
		MainPage2 mainPage = PageFactory.initElements(driver, MainPage2.class);
		MessagePage2 messagePage = PageFactory.initElements(driver, MessagePage2.class);

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
