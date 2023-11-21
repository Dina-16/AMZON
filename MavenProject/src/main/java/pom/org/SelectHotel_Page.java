package pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_Page {
	
	WebDriver driver;
	public SelectHotel_Page(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement hotel_select;
    public WebElement getHotel_select() {
		return hotel_select;
	}

	@FindBy(id="continue")
	private WebElement continue_;
	public WebElement getContinue_() {
		return continue_;
	}
	@FindBy(xpath="//input[@value='Cancel']")
	private WebElement cancel;
	public WebElement getCancel() {
		return cancel;
	}
	
}
