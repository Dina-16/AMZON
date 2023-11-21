package FrameWork.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filpkart_Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']")));
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Computer')]")));
		
       // driver.quit();
	}

	  
}
