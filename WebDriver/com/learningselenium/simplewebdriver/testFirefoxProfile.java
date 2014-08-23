package com.learningselenium.simplewebdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class testFirefoxProfile {
	public static void main(String[] args) {
		String profileInJson = "";
		FirefoxProfile profile = new FirefoxProfile();
		try {
			profile.addExtension(new File("/path/to/extension.xpi"));
			
			profile.setPreference("browser.startup.homepage", "about:blank");
			
			profile.setAssumeUntrustedCertificateIssuer(false);
			profile.setAcceptUntrustedCertificates(false);
			
			profileInJson = profile.toJson();
			System.out.println(profileInJson);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://www.baidu.com");

		driver.close();
	}
}
