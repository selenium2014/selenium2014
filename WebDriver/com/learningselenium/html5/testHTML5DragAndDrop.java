package com.learningselenium.html5;

import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class testHTML5DragAndDrop {

	WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("http://jqueryui.com/draggable/");
	}

	@Test
	public void testDragAndDrop() throws Exception {
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Thread.sleep(3000);
		if (!isElementPresent(By.xpath("//div[@id='draggable']"))) {
			Thread.sleep(3000);
		}
		WebElement draggable = driver.findElement(By
				.xpath("//div[@id='draggable']"));
		new Actions(driver).dragAndDropBy(draggable, 200, 10).build().perform();
		Thread.sleep(10000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
