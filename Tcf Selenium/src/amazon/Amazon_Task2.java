package amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1400)");
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//a[contains(@class,'a-link-normal s-underline')]//child::span[contains(text(),'iPhone 15 (128 GB) - Pink')]")).click();
		////h2//span[text()='iPhone 15 (128 GB) - Pink']
		Thread.sleep(5000);
		System.out.println("Hi");
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(windowHandles);
		driver.switchTo().window(li.get(1));
		System.out.println(driver.getCurrentUrl());
		
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[@id=\"add-to-cart-button\"]//parent::span)[2]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(@class,'a-button a-button-primary attach')]//child::input[@type='submit']")).click();
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("Dinagaran@gmail.com");
//		
//		driver.findElement(By.className("a-button-input")).click();
//		
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dina@1605");
//		
//		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
//		Thread.sleep(3000);
		
		driver.switchTo().window(li.get(0));
		System.out.println(driver.getCurrentUrl());
	}

}
