package com.learningselenium.normalwebdriver;

import static org.junit.Assert.*;
import java .util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testMultipleWindowsTitle {
	WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("http://www.w3schools.com/jsref/met_win_open.asp");
	}
	
	@Test
	public void testMultipleWindowsTitle() throws Exception {
		String parentWindowId = driver.getWindowHandle();
		
		assertEquals("Window open() Method", driver.getTitle());
		
		WebElement tryItButton =
				driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a"));
		tryItButton.click();
		
		Set<String> allWindowsId = driver.getWindowHandles();
		
		for(String windowId : allWindowsId) {
			if(driver.switchTo().window(windowId)
				.getTitle().contains("Tryit")) {
				driver.switchTo().window(windowId);
				break;
			}
		}
		
		assertEquals("Tryit Editor v1.8", driver.getTitle());
		
		driver.switchTo().window(parentWindowId);
		assertEquals("Window open() Method", driver.getTitle());

	}
		
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
