package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDwon_SelectClass {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement findElement = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		findElement.click();
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
	    List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
			
		}
		
		s.selectByIndex(15);
		System.out.println(s);
		Thread.sleep(1000);
		
		s1.selectByValue("5");
		System.out.println(s1);
		Thread.sleep(1000);
		
		s2.selectByVisibleText("1992");
		System.out.println(s2);
		
		

	}

}
