package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class LoginPage extends PageBase{
	
	@FindBy(id = "userName")
	public WebElement userNameField;
	
	@FindBy(id = "password")
	public WebElement passwordField;
	
	@FindBy(name = "Submit")
	public WebElement submitButton;
	
	@FindBy(linkText = "Forgot Your Password?")
	public WebElement forgotPasswordLinkText;
	
	@FindBy(linkText = "Forgot Your Username?")
	public WebElement forgotUserNameLinkText;
	
	@FindBy(linkText = "Register Now")
	public WebElement registerNowLinkText;
	
	
	public void loginProcess(String userName, String password){
		userNameField.clear();
		userNameField.sendKeys(userName);
		passwordField.clear();
		passwordField.sendKeys(password);
		submitButton.click();
	}
	
	
	

}
