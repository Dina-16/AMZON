package waitConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement createNew = driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0')]"));
		createNew.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("XXXXX");
		
//		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
//		lastName.sendKeys("YYYYY");
//		
//		WebElement emailOrPhoneNum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
//		lastName.sendKeys("YYYYY");
		

	}

}
