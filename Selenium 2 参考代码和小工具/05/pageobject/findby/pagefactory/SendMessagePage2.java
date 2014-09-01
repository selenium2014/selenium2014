package com.learningselenium.pageobject.findby.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SendMessagePage2 {
	WebDriver driver;
	
	@FindBy(how = How.ID, id = "txtIncept")
	WebElement toUser;
	@FindBy(how = How.ID, id = "txtTitle")
	WebElement titleContent;
	@FindBy(how = How.ID, id = "txtContent")
	WebElement textContent;
	@FindBy(how = How.ID, id = "btnSend")
	WebElement sendButton;

	public SendMessagePage2(WebDriver driver) {
		this.driver = driver;
		
		/************************************************
		 * the driver.findElement() methods are removed *
		 ************************************************/
	}
	
	public void sendNewMessage(String to, String title,
			String content) {
		toUser.sendKeys(to);
		titleContent.sendKeys(title);
		textContent.sendKeys(content);
		sendButton.click();
	}
}
