import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	    WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("Dina");
		
        WebElement findElement2 = driver.findElement(By.name("pass"));
        findElement2.sendKeys("123456");
        
        String text = findElement.getText();
        System.out.println(text);   
        
        
        
        
        
	}

}
