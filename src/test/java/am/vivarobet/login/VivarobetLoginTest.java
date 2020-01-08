package am.vivarobet.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.vivarobet.base.VivarobetBaseTest;
import am.vivarobet.pages.home.VivaroHomePage;
import am.vivarobet.pages.login.VivarobetLoginPage;
import am.vivarobet.pages.member.VivaroMemberPage;

public class VivarobetLoginTest extends VivarobetBaseTest {

	@Test(priority=1)
	public void loginWithIncorrectCredentials() throws InterruptedException {
		Thread.sleep(10000);
		VivaroHomePage homePage = new VivaroHomePage(driver);
		VivarobetLoginPage loginPage = homePage.navigateToLoginPage();
		loginPage = loginPage.fillEmail("narek@gmail.com");
		loginPage = loginPage.fillPassword("password");
		loginPage = (VivarobetLoginPage) loginPage.clickOnLoginBtn();
		//loginPage.waitForElementPresent(loginPage.errorMsg);
		//Assert.assertTrue(loginPage.isElementPresent(loginPage.errorMsgXPath));
		loginPage.closeLoginDialog();
		Thread.sleep(20000);
	}
	
	@Test(priority=2)
	public void loginWithCorrectCredentials() throws InterruptedException {
		Thread.sleep(10000);
		VivaroHomePage homePage = new VivaroHomePage(driver);
		VivarobetLoginPage loginPage = homePage.navigateToLoginPage();
		loginPage = loginPage.fillEmail("Tosunyantaron@gmail.com");
		loginPage = loginPage.fillPassword("Narek1996");
		loginPage.clickOnLoginBtn();
		loginPage.waitForElementNotPresent(loginPage.loginBtnXPath);
		Assert.assertFalse(loginPage.isElementPresent(loginPage.errorMsgXPath));
		Assert.assertFalse(loginPage.isElementPresent(loginPage.loginBtnXPath));
		
		Thread.sleep(20000);
	}
}
