package MypackagePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPOM {

	WebDriver driver;
	By firstname=By.id("FirstName");
	By lastname=By.id("LastName");
	By email=By.id("Email");
	By password=By.name("Password");
	By confirmpassword=By.name("ConfirmPassword");
	By gender=By.id("gender-female");
	By register=By.id("register-button");
	By continueB=By.xpath("//input[@class='button-1 register-continue-button']");

	public RegisterPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterfirstname(String FN)
	{
		driver.findElement(firstname).sendKeys(FN);
	}
	
	public void enterlastname(String LN)
	{
		driver.findElement(lastname).sendKeys(LN);
	}
	
	public void enteremail(String EM)
	{
		driver.findElement(email).sendKeys(EM);
	}
	public void enterpassword(String Pwd)
	{
		driver.findElement(password).sendKeys(Pwd);
	}
	
	public void enterconfirmpassword(String CP)
	{
		driver.findElement(confirmpassword).sendKeys(CP);
	}
	
	public void clickgender()
	{
		driver.findElement(gender).click();
	}
	
	public void clickregister()
	{
		driver.findElement(register).click();
	}
	public void clickcontinue()
	{
		driver.findElement(continueB).click();
	}
	
	
}
