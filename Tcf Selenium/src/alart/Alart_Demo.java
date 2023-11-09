package alart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alart_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Friends");
		alert3.accept();
		
		}

}
