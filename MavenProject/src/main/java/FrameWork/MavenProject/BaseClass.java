package FrameWork.MavenProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserlaunch(String s) {           //Use to browser Launch
		
		
		if (s.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		} else if(s.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(s.equalsIgnoreCase("EdgeDrive")) {
			driver=new EdgeDriver();
			driver.manage().window().maximize();
}
		return driver;
	}
	
	public static void url(String s) {       // Use to get the Url 
		
		driver.get(s);
}
	
	public static void sendkeys(WebElement w , String s) {    // Use to sendkeys values pass
		
		w.sendKeys(s);
	
	}
	
	public static void SelectByIndex(WebElement w, int i) {     //use to dropdown in index based
		
		Select s = new Select(w);
		s.selectByIndex(i);

	}
	public static void frame(int index) {
		driver.switchTo().frame(index);

	}
	
	
	public static void SelectByValue(WebElement w, String str) {   // use to dropdown in value based
		
		Select s1 = new Select(w);
		s1.selectByValue(str);

	}
	
	public static void SelectByVisibleText(WebElement w, String str) {  //use to dropdown in visible based
		
       Select s2 = new Select(w);
       s2.selectByVisibleText(str);
	}
	
	
	public static void click(WebElement c) {  // use to button 
		
		c.click();

	}
	
	public static void simpleAlert(String s) {        //use to popup or alert 
		if (s.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}
		else {
			driver.switchTo().alert().dismiss();
		}

	}
	
	 public static void confirmationAlert(String s) {  //use to popup or alert 
		if (s.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}
		else  {
			driver.switchTo().alert().dismiss();
		}
		 
	 }
	
	 
	 public static void promptAlert(WebElement p, String s) {     //use to popup or alert and value to be pass
		if (s.equalsIgnoreCase("accept")) {
			 driver.switchTo().alert().accept();
			 p.sendKeys(s);
		}
		else {
			driver.switchTo().alert().dismiss();
		}
	}
		
	 public static void moveToElement(WebElement w) {           // use to action methods
		
		 Actions action = new Actions(driver);
		 action.moveToElement(w);
		 

	}
	 
	 public void doubleClick(WebElement w) {
		 Actions action = new Actions(driver);
		 action.doubleClick(w);

	}
	 public static void robot() throws AWTException {   // use to robot methods
		
		 Robot r = new Robot();
		 

	}
	 
	 public static void javaScriptExecutor(String s) {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;   // use to scrollup and scrolldown 
		 js.executeScript("window.scrollBy(0,200)");
	}
		
	 public static void implicityWait(int i) {
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));

	}
	 
	 public static void explicitWait(int i) {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));

	}
		
	
	private static void screenshot(String s) throws IOException {   // use to take screenshot
		
		TakesScreenshot ts = (TakesScreenshot) driver; //Down Casting
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\HP\\eclipse-workspace\\MavenProject\\ScreenShot\\"+s+".png");
		FileUtils.copyFile(screenshotAs,des );
		
  }
	
	public static void clear(WebElement w) {
	   w.clear();

	}
	
	public static void quit() {
		driver.quit();

	}


}
