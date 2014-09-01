package com.learningselenium.findelement;

import static org.testng.AssertJUnit.assertEquals;
import java.util.List;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;

public class testInjectJQuery {

	WebDriver driver;
	JavascriptExecutor jse;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Selenium2/chromedriver");
		driver = new ChromeDriver();
		jse = (JavascriptExecutor) driver;
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	@Test
	public void testGoogle() throws InterruptedException {
		driver.get("http://www.google.com/");
		
		//load jQuery dynamically if needed
		injectjQueryIfNeeded();
		
		//find the top menu items on google page
		List<WebElement> elements = (List<WebElement>) jse
				.executeScript("return jQuery.find('li.gbt span.gbts')");
		
		//verify the count of the menu items
		assertEquals(12, elements.size());
		
		//verify the property of element "Images" 
		assertEquals("Images", 
				elements.get(2).getAttribute("textContent"));
	}

	private void injectjQueryIfNeeded() {
		if (!jQueryLoaded()) {
			injectjQuery();
		}
	}

	public Boolean jQueryLoaded() {
		Boolean loaded = true;
		try {
			loaded = (Boolean) jse.executeScript("return jQuery()!=null");
		} catch (WebDriverException e) {
			loaded = false;
		}
		return loaded;
	}

	public void injectjQuery() {
    	//load jQuery dynamically in the head of web page
		jse.executeScript(
		"var headID = document.getElementsByTagName(\"head\")[0];" + 
		"var newScript = document.createElement('script');" + 
    	"newScript.type = 'text/javascript';" + 
		"newScript.src = 'http://ajax.googleapis.com/ajax/libs" +
		"/jquery/1.10.1/jquery.min.js';" + 
    	"headID.appendChild(newScript)");
    }
}
