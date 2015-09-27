package tests;

import org.testng.annotations.Test;

import base.TestBase;

public class LoginPageTest extends TestBase{
	
	protected String userName = readProperty.getPropertyValue("username");
	protected String password = readProperty.getPropertyValue("password");	
	
	@Test(priority=1)
	public void validLoginTest(){
		mainPage.loginLinkText.click();
		loginPage.loginProcess(userName, password);
	}
	

}
