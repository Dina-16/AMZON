import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(1000);
	//	driver.manage().window().fullscreen();
	//	Dimension size = driver.manage().window().getSize();
	//	System.out.println(size);
	//	Dimension di = new Dimension(1500, 1050);        // set the dimesion size
	//	driver.manage().window().setSize(di);
		
	   driver.navigate().to("https://www.w3schools.com/java/");
	   Thread.sleep(1000);
	   
	   driver.navigate().back();
	   Thread.sleep(1000);
	   
	   driver.navigate().forward();
	   Thread.sleep(1000);
	   
	   driver.navigate().refresh();
	   
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	   String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
	   
	   String pageSource = driver.getPageSource();
	   System.out.println(pageSource);
	   
	//   driver.close();
	   
	     driver.quit();
	   
	   
	   
	   
	   
	   
	   
	  
		
	
		
		

	}

	

}
