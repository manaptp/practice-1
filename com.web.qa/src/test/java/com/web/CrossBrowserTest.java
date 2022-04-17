package com.web;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CrossBrowserTest {
	WebDriver driver;
  @Test
  public void verifyPageTitle() {
	  driver.get("https://www.google.com/");
	  Assert.assertEquals(driver.getTitle(), "Google");
  }
  @BeforeMethod
  @Parameters("browser")
  public void init(String browser) {
	  switch (browser.toLowerCase()) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
	case "ie":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;
	default:
		driver = null;
		break;
	}
  }
  @AfterMethod
  public void tearDown() throws Exception {
	  driver.quit();
	 // Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver");
  }

}
