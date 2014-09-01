package com.learningselenium.pageobject.notuse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testMessageNoPageObject {
	public static void main(String... args) {	
		WebDriver driver = new FirefoxDriver();
		
		//login
		driver.get("http://www.cnblogs.com");
		driver.findElement(By.linkText("登录")).click();
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbUserName")));
		driver.findElement(By.id("tbUserName")).sendKeys("seleniumpageobject");	
		driver.findElement(By.id("tbPassword")).sendKeys("pageobject123");	
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//message page
		driver.findElement(By.partialLinkText("短消息")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//send message 1
		driver.findElement(By.linkText("撰写新短消息")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("txtIncept")).sendKeys("seleniumpageobject");
		driver.findElement(By.id("txtTitle")).sendKeys("testSendingMessage1");
		driver.findElement(By.id("txtContent")).sendKeys("text messages 1");
		driver.findElement(By.id("btnSend")).click();
		
		//send message 2
		driver.findElement(By.partialLinkText("短消息")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.linkText("撰写新短消息")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("txtIncept")).sendKeys("seleniumpageobject");
		driver.findElement(By.id("txtTitle")).sendKeys("testSendingMessage2");
		driver.findElement(By.id("txtContent")).sendKeys("text messages 2");
		driver.findElement(By.id("btnSend")).click();
		
		//logout for the 1st time
		driver.findElement(By.linkText("退出")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert logoutPrompt = driver.switchTo().alert();
		logoutPrompt.accept();
		
		//login
		driver.get("http://www.cnblogs.com");
		driver.findElement(By.linkText("登录")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbUserName")));
		driver.findElement(By.id("tbUserName")).sendKeys("seleniumpageobject");	
		driver.findElement(By.id("tbPassword")).sendKeys("pageobject123");	
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//message page
		driver.findElement(By.partialLinkText("短消息")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//send message 3
		driver.findElement(By.linkText("撰写新短消息")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("txtIncept")).sendKeys("seleniumpageobject");
		driver.findElement(By.id("txtTitle")).sendKeys("testSendingMessage3");
		driver.findElement(By.id("txtContent")).sendKeys("text messages 3");
		driver.findElement(By.id("btnSend")).click();
		
		//message page
		driver.findElement(By.partialLinkText("短消息")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//select all received messages
		driver.findElement(By.linkText("收件箱")).click();
		WebElement checkBoxSelectAll = driver.findElement(By.id("chkSelAll"));
		if(!checkBoxSelectAll.isSelected()) {
			checkBoxSelectAll.click();
		}
		
		//delete all received messages
		driver.findElement(By.id("btnBatDel")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert confirmDeletePrompt = driver.switchTo().alert();
		confirmDeletePrompt.accept();
		
		//logout
		driver.findElement(By.linkText("退出")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		driver.quit();

	}
}
