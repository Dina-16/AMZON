
package actionsClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();     // overriding concept to be used
		driver.get("https://www.google.com/maps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//canvas[@style='width: 811px; height: 607px;']"))).click().doubleClick().build().perform();
		
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.KEY_PRESSED);
		r.keyPress(KeyEvent.VK_KP_RIGHT);
		r.keyPress(KeyEvent.VK_KP_RIGHT);
		r.keyPress(KeyEvent.VK_KP_RIGHT);
		r.keyPress(KeyEvent.VK_KP_RIGHT);
		r.keyPress(KeyEvent.VK_KP_RIGHT);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;  //Downcasting
		jse.executeScript("window.scrollBy(1000,0)");	
		
		
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;  //Downcasting
		jse1.executeScript("window.scrollBy(-1000,0)");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		
		r.keyRelease(KeyEvent.KEY_RELEASED);
		
		

          }
}


