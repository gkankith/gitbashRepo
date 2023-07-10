package com.AmazonScenario.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionEx {
	
	WebDriver driver;
	
	@Test
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://google.com/");
		String etitle="Google";
		String atitle=driver.getTitle();
		System.out.println(atitle);
	
		SoftAssert a=new SoftAssert();
		Assert.assertEquals(atitle,etitle);
		driver.close();
		a.assertAll();
	}

	@Test
	public void logout() {
		
		driver.get("https://flipkart.com/");
	}
}
