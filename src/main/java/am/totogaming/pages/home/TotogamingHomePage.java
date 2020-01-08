package am.totogaming.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.totogaming.pages.base.TotogamingBasePageObject;

public class TotogamingHomePage extends TotogamingBasePageObject {

	public TotogamingHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//div[contains(@class,'logo')]/a")
	WebElement logo;
	
	public TotogamingHomePage clickOnLogo() {
	 logo.click();
	 return new TotogamingHomePage(driver);
 }
}
