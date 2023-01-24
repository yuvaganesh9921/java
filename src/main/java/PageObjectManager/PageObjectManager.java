package PageObjectManager;

import org.openqa.selenium.WebDriver;

import fb.com.Baseclass.BaseClass;
import fb.com.Locators.LoginPage;

public class PageObjectManager extends BaseClass{

	public PageObjectManager(WebDriver xdriver) {
this.driver=xdriver;
	}
	
	private LoginPage LoginPage;

	public LoginPage getLoginPage() {
		if (LoginPage==null) {
			LoginPage=new LoginPage(driver);
		}
		return LoginPage;
	}
	
	
	
}
