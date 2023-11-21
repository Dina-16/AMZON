package org.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_Map {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();     // overriding concept to be used
		driver.get("https://www.google.com/maps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
	//	driver.findElement(By.id("searchboxinput")).sendKeys("Chennai");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
	//	driver.findElement(By.xpath("(//div[@role='gridcell'])[3]")).click();
		
		driver.findElement(By.id("hArJGc")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Chennai");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("(//div[@role='gridcell'])[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Preambur");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("(//div[@role='gridcell'])[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	    
		Actions actions = new Actions(driver);
		
		WebElement findElement = driver.findElement(By.xpath("//button[@id='widget-zoom-in']"));
		actions.doubleClick(findElement).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
//		WebElement findElement1 = driver.findElement(By.xpath("//button[@id='widget-zoom-out']"));
//		actions.doubleClick(findElement1).build().perform();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.xpath("//button[@id='widget-zoom-out']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;  //Downcasting
		jse.executeScript("window.scrollBy(1000,0)");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		actions.doubleClick().build().perform();
		
		
	}

}
