package screenshot;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;                                           
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_Demo {



	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.14.0");
		driver.manage().window().maximize();
		
        TakesScreenshot ts =(TakesScreenshot)driver;  //DownCasting
        File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File fi = new File("C:\\Users\\HP\\eclipse-workspace\\Tcf Selenium\\Screenshot\\MavenScreenshot.png");
        FileUtils.copyFile(screenshotAs, fi);
        
       
	}

}
