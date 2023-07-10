package generic_Utitlity;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriver_Utility {
	
	public void takeScreensot(WebDriver driver, String screenshotname) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/"+screenshotname+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public String date() {
		Date d=new Date();
		String currentdate = d.toString().replace(" ","-").replace(":","/");
		return currentdate;
		
		
	}
	
	public int randomNum() {
		Random r=new Random();
		int rNum=r.nextInt(100);
		return rNum;
	}

}
