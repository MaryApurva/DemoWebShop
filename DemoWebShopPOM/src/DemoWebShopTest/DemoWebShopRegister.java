package DemoWebShopTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import MypackagePOM.RegisterPOM;

public class DemoWebShopRegister {

	@Test
	public void checklogin()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		RegisterPOM register=new RegisterPOM(driver);
		register.enterfirstname("Apurva");
		register.enterlastname("Reddy");
		register.enteremail("apurvareddy123456@gmail.com");
		register.enterpassword("apurvareddy");
		register.enterconfirmpassword("apurvareddy");
		register.clickgender();
		register.clickregister();
		register.clickcontinue();
	}
		
}
