package com.learningselenium.event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.learningselenium.event.MyEventListener;

public class testWebDriverEvent {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		
		EventFiringWebDriver eventFiringDriver = new EventFiringWebDriver(driver);
		MyEventListener myEventListener = new MyEventListener();
		eventFiringDriver.register(myEventListener);
		
		eventFiringDriver.get("http://www.google.com");
		eventFiringDriver.get("http://www.baidu.com");
		eventFiringDriver.navigate().back();
		
		eventFiringDriver.findElement(By.name("btnK")).click();
		
		driver.quit();
	}
}
