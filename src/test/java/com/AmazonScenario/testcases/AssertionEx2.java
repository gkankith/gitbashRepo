package com.AmazonScenario.testcases;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//@Listeners(generic_Utitlity.Listener_Implementation.class)
public class AssertionEx2 {
	
	WebDriver driver;
	Random r=new Random();
	int rNum = r.nextInt(1000);
	@Test
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://google.com");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/"+rNum+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//String etitle="google";
		//String atitle=driver.getTitle();
		
		//Assert.assertEquals(etitle,atitle);
		//driver.close();
	}
	
	@Test
	public void logout() {
		driver.get("https://amazon.in/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/"+(rNum+1)+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
