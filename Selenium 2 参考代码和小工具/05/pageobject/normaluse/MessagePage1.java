package com.learningselenium.pageobject.normaluse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MessagePage1 {
	WebDriver driver;
	WebElement messageBox;
	WebElement newMessage;
	WebElement receivedMessage;

	public MessagePage1(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterMessageBox() {
		messageBox = driver.findElement(By.partialLinkText("短消息"));
		messageBox.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public void sendMessage(String toUser, String titleContent,
			String textContent) {
		enterMessageBox();
		newMessage = driver.findElement(By.linkText("撰写新短消息"));
		newMessage.click();
		SendMessagePage1 sendMessagePage = new SendMessagePage1(driver);
		sendMessagePage.sendNewMessage(toUser, titleContent, textContent);
	}

	public void deleteAllMessage() {
		enterMessageBox();
		receivedMessage = driver.findElement(By.linkText("收件箱"));
		receivedMessage.click();
		ReceivedMessagePage1 receivedMessagePage = new ReceivedMessagePage1(driver);
		receivedMessagePage.deleteAllMessages();
	}
}
