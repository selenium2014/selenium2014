package com.learningselenium.simplewebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testInternetExplorerService {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", 
				"D:\\Driver\\IEDriverServer_Win32_2.37.0_latest\\IEDriverServer.exe");
		
		InternetExplorerDriverService.Builder builder = 
				new InternetExplorerDriverService.Builder();
		InternetExplorerDriverService internetExplorerService =
				builder.usingPort(5678).withHost("127.0.0.1").build();

		DesiredCapabilities capab = DesiredCapabilities.internetExplorer();
		capab.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		
		capab.setCapability(
				InternetExplorerDriver.
				INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, 
				true);
		
		WebDriver driver = new InternetExplorerDriver(internetExplorerService, capab);
		
		driver.get("http://www.baidu.com");
		
		driver.quit();
	}
}
