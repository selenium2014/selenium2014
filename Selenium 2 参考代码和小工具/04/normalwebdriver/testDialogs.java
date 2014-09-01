package com.learningselenium.normalwebdriver;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class testDialogs {
	WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("http://sislands.com/coin70/week1/dialogbox.htm");
	}

	@Test
	public void testAlertDialog() throws Exception {
		WebElement alertButton = 
				driver.findElement(By.xpath("//input[@value = 'alert']"));
		
		alertButton.click();
		Alert javascriptAlert = driver.switchTo().alert();
		System.out.println(javascriptAlert.getText()); 
		javascriptAlert.accept();
	}
	
	@Test
	public void testPromptDialog() throws Exception {
		WebElement promptButton = 
				driver.findElement(By.xpath("//input[@value = 'prompt']"));
		
		promptButton.click();
		Alert javascriptPrompt = driver.switchTo().alert();
		javascriptPrompt.sendKeys("This is Learning Selenium");
		javascriptPrompt.accept();
		
		System.out.println(javascriptPrompt.getText()); 
		
		javascriptPrompt = driver.switchTo().alert();
		javascriptPrompt.accept();

		promptButton.click();
		javascriptPrompt = driver.switchTo().alert();
		System.out.println(javascriptPrompt.getText());
		javascriptPrompt.dismiss();
		
		javascriptPrompt = driver.switchTo().alert();
		System.out.println(javascriptPrompt.getText());
		javascriptPrompt.accept();

	}
	
	@Test
	public void testConfirmDialog() throws Exception {
		 WebElement confirmButton = 
				 driver.findElement(By.xpath("//input[@value = 'confirm']"));
		 
		 confirmButton.click();
		 Alert javascriptConfirm = driver.switchTo().alert();
		 javascriptConfirm.accept();
		 
		 javascriptConfirm = driver.switchTo().alert();
		 System.out.println(javascriptConfirm.getText());
		 javascriptConfirm.accept();
		 
		 confirmButton.click();
		 javascriptConfirm = driver.switchTo().alert();
		 System.out.println(javascriptConfirm.getText());
		 javascriptConfirm.dismiss();
		 
		 javascriptConfirm = driver.switchTo().alert();
		 System.out.println(javascriptConfirm.getText());
		 javascriptConfirm.accept();
	}
		
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
