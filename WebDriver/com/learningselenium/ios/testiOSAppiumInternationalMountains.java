package com.learningselenium.ios;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import junit.framework.TestCase;

public class testiOSAppiumInternationalMountains extends TestCase{
	public void tesInternationalMountains() throws Exception {

		DesiredCapabilities nativeAppCap = new DesiredCapabilities();
		nativeAppCap.setCapability("app", "InternationalMountains");

		RemoteWebDriver driver = new RemoteWebDriver(new URL(
				"http://localhost:4723/wd/hub"), nativeAppCap);

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
