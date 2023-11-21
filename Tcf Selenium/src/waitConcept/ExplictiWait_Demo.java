package waitConcept;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.JobHoldUntil;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictiWait_Demo {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://letcode.in/waits");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
//		WebElement alertBtn = driver.findElement(By.id("accept"));  // wait for alert
//		alertBtn.click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
//		Alert until = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(until.getText());
//	    until.accept();
//	    
//	    WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Log in']"));
//	    loginBtn.click();
//	    WebElement emailText = driver.findElement(By.name("email"));
//	    emailText.sendKeys("xyz@gmai.com");
//	    WebElement passText = driver.findElement(By.name("password"));
//	    passText.sendKeys("abu@123");
//	    WebElement loginBtn1 = driver.findElement(By.xpath("//button[text()='LOGIN']"));
//	    loginBtn1.click();
    
	    
	    
	    
	    
		
	//	driver.quit();
	}

}
