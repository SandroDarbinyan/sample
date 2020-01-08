package am.totogaming.pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TotogamingBasePageObject {
 protected WebDriver driver;
 
 public TotogamingBasePageObject(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(this.driver, this);
 }

}
