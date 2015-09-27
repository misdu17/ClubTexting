package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import pages.MainPage;

public class TestBase extends Driver {
	
	public static LoginPage loginPage;
	public static MainPage mainPage;

	protected String browserType = readProperty.getPropertyValue("browserType");
	protected String baseURL = readProperty.getPropertyValue("baseURL");

	@BeforeTest
	public void setUp() {
		// set web driver from driver class
		setWebDriver(browserType, baseURL);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//page decleration with driver instance
		mainPage = PageFactory.initElements(driver, MainPage.class);
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		
	}



		

}
