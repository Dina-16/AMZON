package pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary_Page {
	
	WebDriver driver;
	public BookedItinerary_Page(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="my_itinerary")
	private WebElement myItinerary;
	public WebElement getMyItinerary() {
		return myItinerary;

}
	@FindBy(xpath="//input[@type='checkbox'][1]")
	private WebElement clkCheckBox;
	public WebElement getClkCheckBox() {
		return clkCheckBox;
	}
	@FindBy(xpath="//input[@value='Cancel Selected']")
	private WebElement cancelSelected;
	public WebElement getCancelSelected() {
		return cancelSelected;
	}
	
}
