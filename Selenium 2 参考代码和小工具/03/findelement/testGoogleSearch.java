package com.learningselenium.findelement;
import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class testGoogleSearch {

	WebDriver driver;
	JavascriptExecutor jse = (JavascriptExecutor)driver;
    @BeforeClass
    public void setUp(){
      System.setProperty("webdriver.chrome.driver","/Selenium2/chromedriver");
      driver = new ChromeDriver();
    }
    @AfterClass
	public void tearDown(){
      driver.quit();
    }
    @Test
    public void testExamples() throws InterruptedException{
    	driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("webdriver");
        Thread.sleep(2000); 
        assertEquals("webdriver - Google Search", driver.getTitle());
    }
}
