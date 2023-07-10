package com.AmazonScenario.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_002_MakePaymentTest {

	@Test
	public void login(){

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("welcome to amazon app");
		driver.get("https://amazon.in/");
	}

}

