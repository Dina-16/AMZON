package adactinHotel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel_Project {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("Selenium143");
		driver.findElement(By.name("password")).sendKeys("password@123");
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		Thread.sleep(2000);
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(5);	
		Thread.sleep(2000);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room);
		s2.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement roomNo = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(roomNo);
		s3.selectByValue("6");
		Thread.sleep(2000);
		
		WebElement datePickIn = driver.findElement(By.name("datepick_in"));
		datePickIn.clear();
		
		
		WebElement datePickIn1 = driver.findElement(By.name("datepick_in"));
		datePickIn1.sendKeys("20/12/2023");
		Thread.sleep(2000);
		
		WebElement datePickout = driver.findElement(By.name("datepick_out"));
		datePickout.clear();
		
		
		WebElement datePickout1 = driver.findElement(By.name("datepick_out"));
		datePickout1.sendKeys("25/12/2023");
		Thread.sleep(2000);	
		
		WebElement adultRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4 = new Select(adultRoom);
		s4.selectByValue("3");
		Thread.sleep(2000);
		
		WebElement childRoom = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(childRoom);
		s5.selectByValue("2");
		Thread.sleep(2000);
		
		WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Search']"));
		searchBtn.click();
		Thread.sleep(2000);
		
		WebElement radioBtn = driver.findElement(By.xpath("//input[@type='radio']"));
		radioBtn.click();
		Thread.sleep(2000);
		
		WebElement continueBtn = driver.findElement(By.xpath("//input[@name='continue']"));
		continueBtn.click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;  //Downcasting
		jse.executeScript("window.scrollBy(0,300)");	
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.name("first_name"));
		firstName.sendKeys("Raman");
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.name("last_name"));
		lastName.sendKeys("Seetha");
		Thread.sleep(2000);
		
		WebElement addr = driver.findElement(By.xpath("//textarea[@class='txtarea']"));
		addr.sendKeys("Chennai, OMR");
		Thread.sleep(2000);
		
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys("1234567890123456");
		Thread.sleep(2000);
		
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(ccType);
		s6.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement ccExpMonth = driver.findElement(By.name("cc_exp_month"));
		Select s7 = new Select(ccExpMonth);
		s7.selectByIndex(7);
		Thread.sleep(2000);
		
		WebElement ccExpYear = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(ccExpYear);
		s8.selectByIndex(14);
		Thread.sleep(2000);
		
		WebElement cvvNum = driver.findElement(By.name("cc_cvv"));
		cvvNum.sendKeys("555");
		Thread.sleep(2000);
		
		WebElement bookNowBtn = driver.findElement(By.name("book_now"));
		bookNowBtn.click();
		Thread.sleep(3000);
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;  //Downcasting
		jse1.executeScript("window.scrollBy(0,400)");	
		Thread.sleep(2000);
		
		WebElement itineraryBtn = driver.findElement(By.id("my_itinerary"));
		itineraryBtn.click();
		Thread.sleep(2000);
		
//		WebElement checkBoxClk = driver.findElement(By.xpath("//input[@name='check_all'][last()]"));
//		Select s9 = new Select(checkBoxClk);
//		s9.deselectAll();
//		Thread.sleep(2000);		
		
		WebElement checkBoxClk1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[last()]"));
		checkBoxClk1.click();
		Thread.sleep(2000);
		
		WebElement cancelBtn = driver.findElement(By.name("cancelall"));
		cancelBtn.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		WebElement logOutBtn = driver.findElement(By.id("logout"));
		logOutBtn.click();
		
		}

}
