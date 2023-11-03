package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodOverloading_Task {
	
	String c = "Chrome";
	String f = "FireFox";
	String e = "Edge";
	
		 private void browser(String b) {
		 if(b.equalsIgnoreCase(c)) {
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.co.in/");
				
				}
				else if (b.equalsIgnoreCase(f)) {
					
					WebDriver driver = new FirefoxDriver();
					driver.get("https://www.google.co.in/");
					
				}
		         else if (b.equalsIgnoreCase(e)) {
					
					WebDriver driver = new EdgeDriver();
					driver.get("https://www.google.co.in/");
					
				} 

	 }
	 

	public static void main(String[] args) {
		
		MethodOverloading_Task mot = new MethodOverloading_Task();
		mot.browser("Chrome");
	
	}

}
