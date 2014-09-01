package com.learningselenium.pageobject.normaluse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendMessagePage1 {
	WebDriver driver;
	WebElement toUser;
	WebElement titleContent;
	WebElement textContent;
	WebElement sendButton;

	public SendMessagePage1(WebDriver driver) {
		this.driver = driver;
		toUser = driver.findElement(By.id("txtIncept"));
		titleContent = driver.findElement(By.id("txtTitle"));
		textContent = driver.findElement(By.id("txtContent"));
		sendButton = driver.findElement(By.id("btnSend"));
	}
	
	public void sendNewMessage(String to, String title,
			String content) {
		toUser.sendKeys(to);
		titleContent.sendKeys(title);
		textContent.sendKeys(content);
		sendButton.click();
	}
}
