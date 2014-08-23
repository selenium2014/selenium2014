package com.learningselenium.normalwebdriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testGetCookies {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.zhihu.com/#signin");

		driver.findElement(By.name("email"))
				.sendKeys("seleniumcookies@126.com");
		driver.findElement(By.name("password")).sendKeys("cookies123");
		if (driver.findElement(By.name("rememberme")).isSelected()) {
			driver.findElement(By.name("rememberme")).click();
		}
		driver.findElement(By.className("sign-button")).click();

		File cookieFile = new File(
				"/Selenium2/codes/4/zhihu.cookie.txt");
		try {
			cookieFile.delete();
			cookieFile.createNewFile();
			FileWriter fileWriter = new FileWriter(cookieFile);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			for (Cookie cookie : driver.manage().getCookies()) {
				bufferedWriter.write((cookie.getName() + ";" + cookie.getValue() + ";"
						+ cookie.getDomain() + ";" + cookie.getPath() + ";"
						+ cookie.getExpiry() + ";" + cookie.isSecure()));
				bufferedWriter.newLine();
			}
			bufferedWriter.flush();
			bufferedWriter.close();
			fileWriter.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		driver.quit();

	}
}
