package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepage {
	WebDriver driver;
	@FindBy(xpath="//span[text()='Dashboard']")private WebElement dashboard;
    @FindBy(xpath="//span[text()='HZY462']")private WebElement user;
	@FindBy(xpath="//a[@target=\"_self\"]")private WebElement logout;
	@FindBy(xpath="//span[text()='Orders']")private WebElement orders ;
	@FindBy(xpath="//span[text()='Holdings']")private WebElement holdings ;
	@FindBy(xpath="//span[text()='Funds']")private WebElement funds;
@FindBy(xpath="//button[@type=\"button\"]")private WebElement addfund;

public KiteHomepage(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
public void clickOnuser() {
	user.click();
}
public void clickOnLogout() {
	//Actions act=new Actions(driver);
	//act.moveToElement(logout).perform();
	//act.click().perform();
	logout.click();
	}
public void clickOnorders() {
	orders.click();
}
public void clickOnholdings() {
	holdings.click();
}
public void clickOndashboard() {
	dashboard.click();
}
public void clickOnfunds() {
	funds.click();
}
public void clickonaddfunds() {
	addfund.click();
}


}