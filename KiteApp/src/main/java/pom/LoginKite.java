package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utilclass;

public class LoginKite extends Utilclass {
	@FindBy(xpath="//input[@type='text']")private WebElement userid;
	@FindBy(xpath="//input[@type=\"password\"]")private WebElement password;
@FindBy(xpath="//input[@id=\"pin\"]")private WebElement pin;
@FindBy(xpath="//button[@type='submit']")private WebElement loginbtn;
@FindBy(xpath="//button[@type='submit']")private WebElement continuebtn;
public LoginKite(WebDriver driver)
{
	
PageFactory.initElements(driver,this);
}
public void enteruserid() {
	userid.sendKeys("HZY462");
	
}
public void enterpasswd()
{
	password.sendKeys("Sneha@1994");
	}
public void enterpin()
{
	pin.sendKeys("961994");
	}
public void clickonlogin() {
	loginbtn.click();
}
public void clickoncontinue() {
	continuebtn.click();
}


}
