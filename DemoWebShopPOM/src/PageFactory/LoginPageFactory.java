package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
WebDriver driver;

	@FindBy(name="Email")
	WebElement email;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement login;
	
	public LoginPageFactory(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendEmail(String EM)
	{
		email.sendKeys(EM);
	}
	public void sendPassword(String Pwd)
	{
		password.sendKeys(Pwd);
	}
	public void clicklogin()
	{
		login.click();
	}

	
}
