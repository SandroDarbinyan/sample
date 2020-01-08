package am.vivarobet.sport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.vivarobet.menu.VivaroBetMenu;

import am.vivarobet.pages.home.VivaroHomePage;

public class VivaroSportPage extends VivaroBetMenu{

	public VivaroSportPage(WebDriver driver) {
		super(driver);
		
	}
	
	public static final String LEFT_MENU_XPATH="//div[@ng-controller='classicViewLeftController']";
	@FindBy(xpath=LEFT_MENU_XPATH)
	 WebElement leftMenu ; 
	
	public boolean isLeftMenuDisplayed() {
	return leftMenu.isDisplayed();
	}
}
