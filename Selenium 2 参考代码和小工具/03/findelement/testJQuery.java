package com.learningselenium.findelement;
import static org.testng.AssertJUnit.assertEquals;
import java.util.List;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class testJQuery {

	WebDriver driver;
	
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
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	driver.get("http://www.jquery.org/");
    	List<WebElement> elements = 
    			(List<WebElement>)jse.executeScript 
    			("return jQuery.find('.menu-item')");
    	assertEquals(10,elements.size()); 
    	assertEquals("Members",elements.get(2).getText()); 

    }
}
