package org.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenShot_Task{
	
	public void screenShot(String s) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts =(TakesScreenshot)driver;  //DownCasting
        File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File fi = new File("C:\\Users\\HP\\eclipse-workspace\\Tcf Selenium\\Screenshot\\ "+s+".png");
        FileUtils.copyFile(screenshotAs, fi);
		    
	}

	public static void main(String[] args) throws IOException {
		
		ScreenShot_Task stc = new ScreenShot_Task();
		stc.screenShot("Facebook");
	
		
		
	}

}
