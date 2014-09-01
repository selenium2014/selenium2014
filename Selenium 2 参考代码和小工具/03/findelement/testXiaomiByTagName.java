package com.learningselenium.findelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testXiaomiByTagName {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver(); 
        driver.get("http://www.xiaomi.com");
        
        List<WebElement> scriptList = driver.findElements(By.tagName("script"));
        System.out.println("There are " + 
        				   scriptList.size() + 
        				   " scripts on Xiaomi's main page.");
        
        driver.close();
    } 
}
