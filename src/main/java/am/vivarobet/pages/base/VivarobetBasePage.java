package am.vivarobet.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VivarobetBasePage {
	protected WebDriver driver;

	public VivarobetBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	//
	// public void waitForElementPresent(String xpath) {
	// WebDriverWait wait = new WebDriverWait(driver, 20);
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	// }

	public void waitForElementPresent(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForElementNotPresent(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
	}

	public boolean isElementPresent(String xpath) {
		if (driver.findElements(By.xpath(xpath)).size() > 0) {
			return true;
		}
		return false;
	}
}
