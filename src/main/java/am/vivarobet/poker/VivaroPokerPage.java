package am.vivarobet.poker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.vivarobet.menu.VivaroBetMenu;

public class VivaroPokerPage extends VivaroBetMenu{

	public VivaroPokerPage(WebDriver driver) {
		super(driver);
		
	}

	public static final String LEFT_MENU_XPATH="//div[@ng-controller='classicViewLeftController']";
	@FindBy(xpath=LEFT_MENU_XPATH)
	 WebElement leftMenu ; 
}
