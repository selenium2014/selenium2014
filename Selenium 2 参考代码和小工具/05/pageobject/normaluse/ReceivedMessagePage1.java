package com.learningselenium.pageobject.normaluse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReceivedMessagePage1 {
	WebDriver driver;
	WebElement deleteAllMessagesButton;
	WebElement checkBoxSelectAll;
	
	public ReceivedMessagePage1(WebDriver driver) {
		this.driver = driver;
		checkBoxSelectAll = driver.findElement(By.id("chkSelAll"));
		deleteAllMessagesButton = driver.findElement(By.id("btnBatDel"));
	}
	
	public void deleteAllMessages() {
		//check box
		if(!checkBoxSelectAll.isSelected()) {
			checkBoxSelectAll.click();
		}
		
		//delete all received messages
		deleteAllMessagesButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert confirmDeletePrompt = driver.switchTo().alert();
		confirmDeletePrompt.accept();
	}
}
