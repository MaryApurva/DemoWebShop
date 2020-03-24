package MypackagePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {
	WebDriver driver;
	By email=By.name("Email");
	By password=By.name("Password");
	By login=By.xpath("//input[@class='button-1 login-button']");

	public LoginPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enteremail(String EM)
	{
		driver.findElement(email).sendKeys(EM);
	}
	
	public void enterpassword(String Pwd)
	{
		driver.findElement(password).sendKeys(Pwd);
	}
	
	public void clicklogin()
	{
		driver.findElement(login).click();
	}
}
