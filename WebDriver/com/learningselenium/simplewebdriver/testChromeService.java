package com.learningselenium.simplewebdriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class testChromeService {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Selenium2/chromedriver");

		ChromeDriverService.Builder builder = new ChromeDriverService.Builder();
		ChromeDriverService chromeService = builder
				.usingDriverExecutable(
						new File(
								"/Selenium 2/chromedriver"))
				.usingPort(3333).build();

		try {
			chromeService.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

		WebDriver driver = new ChromeDriver(chromeService);

		driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("webdriver");
        searchBox.submit();

		driver.quit();
		chromeService.stop();

	}
}
