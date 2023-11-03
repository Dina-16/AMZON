import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon_ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		

		
		JavascriptExecutor executor = (JavascriptExecutor)driver;   // scroll to some position
		executor.executeScript("window.scroll(0,800)", "");    // scroll down    
		Thread.sleep(2000);
		executor.executeScript("window.scroll(0,-800)", "");     // scrollup 
		
		
	
	}

	
}
