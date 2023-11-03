package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();   // overriding concept to be used
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        
       WebElement frame = driver.findElement(By.id("singleframe"));
       driver.switchTo().frame(frame);
        
       WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));  //overloading concept to be used
       findElement.sendKeys("Java");
       Thread.sleep(2000);
       
       findElement.clear();
       driver.switchTo().defaultContent();
        
        WebElement iFrameWithInFrame = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
        iFrameWithInFrame.click();
        
        WebElement parentFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(parentFrame);
        Thread.sleep(1000);
        
        WebElement childFrame = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
        driver.switchTo().frame(childFrame);
        Thread.sleep(1000);
        
        WebElement findElement1 = driver.findElement(By.xpath("//input[@type='text']"));
        findElement1.sendKeys("Welcome to IFrame");
       driver.switchTo().defaultContent();
         
        WebElement singleIFrame = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]"));
        singleIFrame.click();
        
        WebElement singleFrame = driver.findElement(By.id("singleframe"));
        driver.switchTo().frame(singleFrame);
       
        
        WebElement findElement3 = driver.findElement(By.xpath("//input[@type='text']"));
        findElement3.sendKeys("Selenium");
        
        
        
        
        
        	
	}

}
