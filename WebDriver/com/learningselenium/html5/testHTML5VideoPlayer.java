package com.learningselenium.html5;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testHTML5VideoPlayer {
	
	WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("http://videojs.com/");
	}
	
	@Test
	public void testHTML5Video() throws InterruptedException {
		
		WebElement video = driver.findElement(By.id("home_video_html5_api"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		String source = (String) jse.executeScript(
				"return arguments[0].currentSrc;", video);
		assertEquals("http://vjs.zencdn.net/v/oceans.webm", source);
		
		jse.executeScript("return arguments[0].play()", video);
		Thread.sleep(5000);

		jse.executeScript("arguments[0].pause()", video);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
