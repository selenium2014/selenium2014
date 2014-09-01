package com.learningselenium.normalwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class testWait {
	public static void main(String... args) {	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium 2");
		searchBox.submit();
		
		//Explicit wait
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("selenium");
            }
        });

        System.out.println("Page title is: " + driver.getTitle());
        
        driver.navigate().back();
        
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.findElement(By.name("btnK")).click();
		
        driver.quit();
	}
}
