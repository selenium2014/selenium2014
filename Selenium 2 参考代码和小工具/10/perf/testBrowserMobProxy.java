package com.learningselenium.web.frontier.perf;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.Proxy;
import net.lightbody.bmp.proxy.ProxyServer;
import net.lightbody.bmp.core.har.Har;

import junit.framework.TestCase;

public class testBrowserMobProxy extends TestCase{
	public void testBaidu() throws Exception {

		ProxyServer server = new ProxyServer(9090);
		server.start();

		Proxy proxy = server.seleniumProxy();

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.PROXY, proxy);

		WebDriver driver = new FirefoxDriver(capabilities);

		server.newHar("baidu.com");

		driver.get("http://www.baidu.com");
		Har har = server.getHar();

		File harFile = new File("/Selenium2/codes/10/HAR-baidu.com.json");
	    har.writeTo(harFile);

	    server.stop();
	    
	    driver.quit();
	}
}
