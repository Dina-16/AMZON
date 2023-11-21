package pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
	WebDriver driver;
	public Logout_Page(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}	
		
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}

}
