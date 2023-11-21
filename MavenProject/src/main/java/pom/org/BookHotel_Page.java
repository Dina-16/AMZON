package pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel_Page {
	
	WebDriver driver;
	public BookHotel_Page(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}
	@FindBy(id="last_name")
	private WebElement lastName;
	public WebElement getLastName() {
		return lastName;
	}
	
	
	@FindBy(id="address")
	private WebElement billingAddr;
	public WebElement getBillingAddr() {
		return billingAddr;
	}
	
	@FindBy(id="cc_num")
	private WebElement cardNo;
	public WebElement getCardNo() {
		return cardNo;
	}
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	public WebElement getCardType() {
		return cardType;
	}
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;	
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNum;
	public WebElement getCvvNum() {
		return cvvNum;
	}
	
	@FindBy(id="book_now")
	private WebElement bookNow;	
	public WebElement getBookNow() {
		return bookNow;
		
		
	}
	@FindBy(id="cancel")
	private WebElement bookCancel;
	public WebElement getBookCancel() {
		return bookCancel;
	}	
	
}
