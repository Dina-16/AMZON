package pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
	WebDriver driver;
	public Login_Page(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="username")
	private WebElement user;
	public WebElement getUser() {
		return user;
	}

	@FindBy(name = "password")
	private WebElement pass;
	public WebElement getPass() {
		return pass;
	}

	@FindBy(xpath="//a[text()='Forgot Password?']")
	private WebElement forgotPass;
	public WebElement getForgotPass() {
		return forgotPass;
	}

	@FindBy(id = "emailadd_recovery")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}

	@FindBy(xpath="//input[@value='Email Password']")
	private WebElement emailPass;
	public WebElement getEmailPass() {
		return emailPass;
	}

	@FindBy(xpath="//input[@value='Reset']")
	private WebElement reset;
	public WebElement getReset() {
		return reset;
	}

	@FindBy(id="login")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}

}
