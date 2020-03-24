package DemoWebShopTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import MypackagePOM.LoginPOM;

public class verifyLogin {

	@Test
	public void checklogin()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		LoginPOM login=new LoginPOM(driver);
		login.enteremail("apurvareddy1@gmail.com");
		login.enterpassword("apurvareddy");
		login.clicklogin();
	}
	
}
