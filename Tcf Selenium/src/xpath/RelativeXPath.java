package xpath;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.network.model.WebSocketWillSendHandshakeRequest;

public class RelativeXPath  {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	/*	WebElement findElement = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		findElement.click();
		Thread.sleep(2000);
		
		WebElement textbox1 = driver.findElement(By.xpath("//input[@placeholder=\"First name\"]"));
		textbox1.sendKeys("Dinagaran");
		
		
		WebElement textbox2 = driver.findElement(By.xpath("//input[@name='lastname']"));
		textbox2.sendKeys("M");
		Thread.sleep(2000);
		
		WebElement textbox3 = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		textbox3.sendKeys("dinagarancs@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("dinagarancs@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("12345");
		
		driver.findElement(By.id("day")).sendKeys("16");
		driver.findElement(By.id("month")).sendKeys("May");
		driver.findElement(By.id("year")).sendKeys("1992");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("websubmit")).click();  */
		
		
	//	WebElement findElement = driver.findElement(By.id("email"));
		
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]")).click();  //dnamic xpath
		

	}

}
