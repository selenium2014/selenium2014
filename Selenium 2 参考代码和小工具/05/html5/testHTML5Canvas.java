package com.learningselenium.html5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testHTML5Canvas {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Selenium2/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://literallycanvas.com");
	}
	
	@Test
	public void testHTML5Canvas() throws Exception {
		WebElement canvas = driver.findElement(By.xpath("//*[@id=\"about\"]/div[1]/canvas"));
		
		Actions drawing = new Actions(driver);
		drawing.clickAndHold(canvas).moveByOffset(10, 50).
									moveByOffset(50, 10).
									moveByOffset(-10, -50).
									moveByOffset(-50, -10).release().perform();		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
