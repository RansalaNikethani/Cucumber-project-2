package sourceDemoAutomationPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver loginPageDriver;
	
	public LoginPage(WebDriver driver)
	{
		this.loginPageDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement userNameElement = loginPageDriver.findElement(By.id("user-name"));
	@FindBy (id="user-name")
	WebElement userNameElement;
	
	@FindBy (id="password")
	WebElement pwdElement;
	
	@FindBy (id="login-button")
	WebElement loginBtnElement;
	
	
	public void enterUserName(String userName) {
		userNameElement.sendKeys(userName);
	}
	
	
	public void enterPwd(String pwd) {
		pwdElement.sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		loginBtnElement.click();
	}
	
	@FindBy (xpath="//*[@id=\"header_container\"]/div[2]/span")
	WebElement ProductLabel;

	public boolean confirmNavigation() 
	{
		boolean productLblVisibility = ProductLabel.isDisplayed();
		return productLblVisibility;
	}
	
	
}
