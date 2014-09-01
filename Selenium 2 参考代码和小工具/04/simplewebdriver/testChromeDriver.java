package com.learningselenium.simplewebdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testChromeDriver {
	static Thread thread = new Thread();
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Selenium2/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if(driver.findElement(By.id("kw")).isEnabled()) {
			System.out.println("Baidu Search text box is editable!");
			driver.findElement(By.id("kw")).sendKeys("selenium");
			driver.findElement(By.id("su")).click();
		}
		else {
			System.out.println("Baidu Search text box is not editable!");			
		}
		
		try{
			thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
		driver.close();

	}
}
