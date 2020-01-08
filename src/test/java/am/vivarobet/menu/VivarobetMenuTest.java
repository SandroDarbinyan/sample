package am.vivarobet.menu;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.vivarobet.base.VivarobetBaseTest;
import am.vivarobet.pages.home.VivaroHomePage;
import am.vivarobet.pages.login.VivarobetLoginPage;
import am.vivarobet.sport.VivaroSportPage;

public class VivarobetMenuTest extends VivarobetBaseTest{

	@Test
	public void sportBtnFunctionality() {
		VivaroBetMenu menuPage = new VivaroBetMenu(driver);
		VivaroSportPage sportPage = menuPage.sportBtn();
		Assert.assertTrue(sportPage.isLeftMenuDisplayed());
	}


}
