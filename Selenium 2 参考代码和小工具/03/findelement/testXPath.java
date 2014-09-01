package com.learningselenium.findelement;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class testXPath {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Selenium2/chromedriver");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	@Test
	public void testGoogle() throws InterruptedException {
		
		driver.get("http://www.google.com/");
		
		//enter 'selenium' into the search box by XPath
		WebElement searchBox = driver.findElement(
				By.xpath("//*[@id=\"lst-ib\"]"));	
		searchBox.sendKeys("selenium");
		
		//click search button by XPath
        WebElement searchButton = driver.findElement(
        		By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]"));
        searchButton.click();
        
        //wait the web element's visibility by XPath
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(visibilityOfElementLocated(
        		By.xpath("//*[@id=\"rso\"]/li[1]/div/h3/a/em")));
	}
}
