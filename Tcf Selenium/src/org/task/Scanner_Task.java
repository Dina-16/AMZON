package org.task;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scanner_Task {


	public static void main(String[] args) {
		String c = "Chrome";
		String f = "FireFox";
		String e = "Edge";	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser");
		
		String bn = sc.next();
		
		if(bn.equalsIgnoreCase(c)) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		}
		else if (bn.equalsIgnoreCase(f)) {
			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.co.in/");
		}
         else if (bn.equalsIgnoreCase(e)) {
			
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.google.co.in/");
		} 
		
		
	}	}

