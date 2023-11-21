package amazon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Get Text in for Each iterator
public class AmazonGetTitle_Task3 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		List<WebElement> headerList = driver.findElements(By.xpath("//h2[@class='a-color-base headline truncate-2line']"));

		for (WebElement list : headerList) {
			int size = headerList.size();
			for (int i = 0; i < size; i++) {
				WebElement webElement = headerList.get(i);
		    	System.out.println(webElement.getText());
				if (i==0)
					break;
			}
			
//			String headerListText = list.getText();
//			System.out.println(headerListText);
		}
//		int size = headerList.size()-1;   // index based
//        int length = headerList.size();   // length based
//      for (int i = 0; i <= size; i++) {
//    	  WebElement webElement = headerList.get(i);
//    	  System.out.println(webElement.getText());
//    	 if (i==3)
//    		 break;
// 	}
//
//	}

//for (int i = 0; i < 4; i++) {                        //using for for loop 
//	  WebElement webElement = headerList.get(i);
//	  System.out.println(webElement.getText());
//	}
//
}

}




