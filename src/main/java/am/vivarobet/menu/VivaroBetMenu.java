package am.vivarobet.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.vivarobet.pages.home.VivaroHomePage;
import am.vivarobet.sport.VivaroSportPage;

public class VivaroBetMenu extends VivaroHomePage {

	public VivaroBetMenu(WebDriver driver) {
		super(driver);
		
	}

	public static final String SPORT_BTN_XPATH="//a[@ng-href='#/sport/?type=0']";
	@FindBy(xpath=SPORT_BTN_XPATH)
	public	WebElement sportbtn;
	
	public VivaroSportPage sportBtn() {
		waitForElementPresent(sportbtn);
		sportbtn.click();
		return new VivaroSportPage(driver);
	}
}
