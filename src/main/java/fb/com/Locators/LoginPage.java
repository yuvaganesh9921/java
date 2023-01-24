package fb.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.Baseclass.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "img[alt='Facebook']")
	private WebElement FB_logo;
	
	@FindBy(id = "email")
	private WebElement Username;
	
	@FindBy(id = "pass")
	private WebElement Password;
	
	@FindBy(name = "login")
	private WebElement Login_btn;
	
	@FindBy(linkText = "Create New Account")
	private WebElement CreateNewAccount;

	public WebElement getFB_logo() {
		return FB_logo;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin_btn() {
		return Login_btn;
	}

	public WebElement getCreateNewAccount() {
		return CreateNewAccount;
	}
	
}
