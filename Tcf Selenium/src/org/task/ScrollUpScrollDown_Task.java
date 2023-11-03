package org.task;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpScrollDown_Task {

	private void scrollUD(String s) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;  //Downcasting
		jse.executeScript("window.scrollBy(0,200)");	
		Thread.sleep(2000);
	}
		
		public static void main(String[] args) throws InterruptedException {
			
			ScrollUpScrollDown_Task susd = new ScrollUpScrollDown_Task();
			susd.scrollUD("window.scrollBy(0,400)");

	}

}
