package com.AmazonScenario.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_AddToCartTest {
	
	@Test
	public void login2() {
		
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	System.out.println("welcome to google");
	driver.get("https://google.com");

	}

}
