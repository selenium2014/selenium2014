package com.learningselenium.event;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class MyEventListener extends AbstractWebDriverEventListener{
	
	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After Navigate To " + url);
	}
	
	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("After Navigate Back To " + driver.getCurrentUrl());
	}
	
	@Override
	public void afterClickOn(WebElement webElement, WebDriver driver) {
		System.out.println("After Click On " + webElement.getText());
	}

}
