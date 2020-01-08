package am.vivarobet.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.vivarobet.pages.base.VivarobetBasePage;
import am.vivarobet.pages.home.VivaroHomePage;
import am.vivarobet.pages.member.VivaroMemberPage;

public class VivarobetLoginPage extends VivaroHomePage{

	public VivarobetLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@ng-model='user.username']")
	WebElement emailField;
	

	@FindBy(xpath="//input[@ng-model='user.password']")
	WebElement passField;
	
	public static final String loginBtnXPath="//button[@type='submit']";
	@FindBy(xpath=loginBtnXPath)
	WebElement loginButton;
	
	public static final String errorMsgXPath="//p[@ng-bind='signInError']";
	@FindBy(xpath=errorMsgXPath)
	public	WebElement errorMsg;
	
	public static final String closeLoginDialogXPath="//div[@class='closed-popup-form']";
	@FindBy(xpath=closeLoginDialogXPath)
	public WebElement closeLoginDialogElement;
	
	public VivaroHomePage closeLoginDialog() {
		
		closeLoginDialogElement.click();
		return new VivaroHomePage(driver);
	}
	public VivarobetLoginPage fillEmail(String emailValue) {
		emailField.sendKeys(emailValue);
		return new VivarobetLoginPage(driver);
	}
	
	
	public VivarobetLoginPage fillPassword(String passwordValue) {
		passField.sendKeys(passwordValue);
		return new VivarobetLoginPage(driver);
	}
	
	public VivarobetBasePage clickOnLoginBtn() {
		loginButton.click();
		if(isElementPresent(loginBtnXPath)) {
			return new VivarobetLoginPage(driver);
		}
		return new VivaroMemberPage(driver);
	}
}
