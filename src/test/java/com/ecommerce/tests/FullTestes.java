package com.ecommerce.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FullTestes {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("http://demo-store.seleniumacademy.com/");
		driver.manage().window().minimize();
	}

	@Test
	public void complete() {
		System.out.println("Test Completed");
	}

	@Test
	public void fail() {
		assert (false);
	}

	@Test
	public void sky() {
		throw new SkipException("Skip this");
	}

	@Test
	public void done() {
		System.out.println("Test Done");
	}

	@AfterMethod
	@AfterClass
	public void tearDown() {
		driver.close();

	}
}
