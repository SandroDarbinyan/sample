package am.vivarobet.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import am.vivarobet.pages.base.VivarobetBasePage;
import am.vivarobet.pages.login.VivarobetLoginPage;

public class VivaroHomePage extends VivarobetBasePage  {
	
	public VivaroHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@ng-click='signin()']")
	WebElement loginLink;
	
	public VivarobetLoginPage navigateToLoginPage() {
		waitForElementPresent(loginLink);
		loginLink.click();
		return new VivarobetLoginPage(driver);
	}
	
}
