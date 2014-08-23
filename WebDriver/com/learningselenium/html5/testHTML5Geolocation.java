package com.learningselenium.html5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.*;

public class testHTML5Geolocation {
	private static WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		FirefoxProfile profile = new ProfilesIni().getProfile("geolocation");
		profile.setPreference("geo.wifi.uri", 
				"/Selenium2/codes/5/location.json");
		driver = new FirefoxDriver(profile);
		driver.get("http://www.w3schools.com/html/html5_geolocation.asp");
	}

	@Test
	public void testGetLocation() throws Exception {
		driver.findElement(By.cssSelector("p#demo button")).click();
	}

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
}