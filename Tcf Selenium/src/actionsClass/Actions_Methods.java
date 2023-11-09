package actionsClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Methods {
	


	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		Actions ac = new Actions(driver);
		
		WebElement signMouseHover = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		ac.moveToElement(signMouseHover).build().perform();
		
//	    ac.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).build().perform();
//        Thread.sleep(5000);
        
        
        
        ac.moveToElement(driver.findElement(By.xpath("//a[text()='Mobiles']"))).click().build().perform();
        Thread.sleep(5000);
        
        
        
        driver.navigate().back();
        Thread.sleep(5000);
        
        ac.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"))).click().sendKeys("pendrive").doubleClick().build().perform();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        
        //ac.doubleClick(driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"))).build().perform();
       
        ac.moveToElement(driver.findElement(By.xpath("//div[@data-index='1']"))).click().contextClick().build().perform();
       
        
        
      
        
        
		}
        
        
        
	
	 //   driver.quit();
	
	}
	
	
	

