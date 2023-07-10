package com.AmazonScenario.testcases;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import generic_Utitlity.WebDriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Prac {
	WebDriver driver;
	@Test
	public void login() {
		 
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://amazon.in");
		WebDriver_Utility wlib=new WebDriver_Utility();
		int ranNum=wlib.randomNum();
		String cdate = wlib.date();
		 wlib.takeScreensot(driver,"amazon"+cdate);
		
		
		
	}
	
	@Test
	public void logout() {
		
		driver.get("https://facebook.com/");
		WebDriver_Utility wlib=new WebDriver_Utility();
       String cdate = wlib.date();
		int ranNum=wlib.randomNum();
		wlib.takeScreensot(driver,"facebook"+cdate);
	}

}
