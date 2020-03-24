package TestFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageFactory.LoginPageFactory;

public class loginFactory {

	@Test
	public void checklogin()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		LoginPageFactory login=PageFactory.initElements(driver, LoginPageFactory.class);
		login.sendEmail("apurvareddy1@gmail.com");
		login.sendPassword("apurvareddy");
		login.clicklogin();
		driver.close();
	}
	
}
