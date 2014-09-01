package com.learningselenium.ios;

import java.net.URL;
import java.util.List;
import java.io.File;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.Augmenter;
import org.uiautomation.ios.IOSCapabilities;


public class testiOSInternationalMountains extends TestCase {
	public void tesInternationalMountains() throws Exception {
		DesiredCapabilities nativeAppCap = IOSCapabilities.iphone(
				"InternationalMountains", "1.1");

		RemoteWebDriver driver = new RemoteWebDriver(new URL(
				"http://localhost:4444/wd/hub"), nativeAppCap);

		List<WebElement> cells = driver.findElements(By
				.className("UIATableCell"));

		assertEquals(9, cells.size());

		WebElement first = cells.get(0);
		first.click();

		TakesScreenshot screen = (TakesScreenshot) new Augmenter()
				.augment(driver);
		File ss = new File("screenshot.png");
		screen.getScreenshotAs(OutputType.FILE).renameTo(ss);
		System.out.println("screenshot take :" + ss.getAbsolutePath());

		By selector = By.xpath("//UIAStaticText[contains(@name,'climbed')]");
		WebElement text = driver.findElement(selector);
		System.out.println(text.getAttribute("name"));

		driver.quit();
	}
}
