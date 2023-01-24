package fb.com.Baseclass;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	
	public static void browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\driver\\msedgedriver.exe");
			driver=new EdgeDriver();
		} else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "");
			driver=new ChromeDriver();
		}
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
window_max();
	}
	
	public static void window_max() {
try {
	driver.manage().window().maximize();
} catch (Exception e) {
}
	}
	
	public static void getUrl(String url) {
try {
	driver.get(url);
} catch (Exception e) {
	// TODO: handle exception
}
	}
	
	public static boolean elementIsDisplayed(WebElement element) {
boolean dispalyed=false;
try {
	dispalyed=element.isDisplayed();
} catch (Exception e) {
	System.out.println("Element not Displayed :"+e.getMessage());
}
return dispalyed;
	}
	
	public static void elementSendKeys(WebElement element,String value) {
	try {
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
		wb.until(ExpectedConditions.visibilityOfAllElements(element));
		if (elementIsDisplayed(element)&&elementisEnabled(element)) {
			elementClear(element);
			element.sendKeys(value);
		}else {
			System.err.println("Unable to pass Sendkeys");
		}
		
	} catch (Exception e) {
		System.out.println("Unable to pass the value :"+e.getMessage());
	}

	}
	
	public static boolean elementisEnabled(WebElement element) {
		boolean enabled=false;
		try {
			enabled=element.isEnabled();
		} catch (Exception e) {
			System.out.println("Element not Enabled :"+e.getMessage());
		}
return enabled;
	}
	
	public static void elementClear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public static void elementClick(WebElement element) {
		try {
			WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(20));
			wb.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (Exception e) {
			System.out.println("Unable to Click : "+e.getMessage());
		}

	}
}
