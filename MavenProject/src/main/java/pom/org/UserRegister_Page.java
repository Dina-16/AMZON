package pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegister_Page {
	
	WebDriver driver;
	public UserRegister_Page(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='New User Register Here']")
	private WebElement newUserReg;
	public WebElement getNewUserReg() {
		return newUserReg;
	}
	
	@FindBy(name = "username")
	private WebElement user;

	public WebElement getUser() {
		return user;
	}

	@FindBy(id="password")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}
	@FindBy(id="re_password")
	private WebElement confirmPass;

	public WebElement getConfirmPass() {
		return confirmPass;
	}
	@FindBy(name ="full_name")
	private WebElement fullName;

	public WebElement getFullName() {
		return fullName;
	}
	@FindBy(id="email_add")
	private WebElement emailAddr;

	public WebElement getEmailAddr() {
		return emailAddr;
	}
	@FindBy(xpath="//img[@alt='Refresh Captcha']")
	private WebElement refreshCapt;

	public WebElement getRefreshCapt() {
		return refreshCapt;
	}
	@FindBy(id="captcha-form")
	private WebElement captchaText;

	public WebElement getCaptchaText() {
		return captchaText;
	}
	@FindBy(id="tnc_box")
	private WebElement termCond;

	public WebElement getTermCond() {
		return termCond;
	}
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	private WebElement termCondition;

	public WebElement getTermCondition() {
		return termCondition;
	}
	@FindBy(xpath="//input[@value='Register']")
	private WebElement reg;

	public WebElement getReg() {
		return reg;
	}
	@FindBy(xpath="//input[@value='Reset']")
	private WebElement reset;

	public WebElement getReset() {
		return reset;
	}
	
	
	
	
	
}
