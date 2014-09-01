package com.learningselenium.normalwebdriver;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCheckbox {
	WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("http://www.w3schools.com/html/html_forms.asp");
	}
	
	@Test
	public void testCheckbox() throws Exception {
		WebElement bikeCheckbox = 
				driver.findElement(
						By.xpath("//*[@id=\"main\"]/form[4]/input[1]"));
		
		if(!bikeCheckbox.isSelected()) {
			bikeCheckbox.click();
		}
		
		assertTrue(bikeCheckbox.isSelected());
		
		WebElement carCheckbox =
				driver.findElement(
						By.cssSelector("input[value='Car']"));
		
		if(!carCheckbox.isSelected()) {
			carCheckbox.click();
		}
		
		assertTrue(carCheckbox.isSelected());
	}
		
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
