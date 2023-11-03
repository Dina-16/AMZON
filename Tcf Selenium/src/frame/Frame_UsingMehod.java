package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_UsingMehod {
	
	
	
	public void frame() {
		System.out.println("I am Working IFrame");

	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();   // overriding concept to be used
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
  
        
        
        
        

	}

}
