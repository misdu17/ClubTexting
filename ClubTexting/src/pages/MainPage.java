package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class MainPage extends PageBase{
	
	@FindBy(linkText = "Pricing")
	public WebElement pricingLinkText;
	
	@FindBy(linkText = "Blog")
	public WebElement blogLinkText;
	
	@FindBy(linkText = "Contact")
	public WebElement contactLinkText;
	
	@FindBy(linkText = "Login")
	public WebElement loginLinkText;
	
	@FindBy(linkText = "Try For Free")
	public WebElement tryForFreeLinkText;
	


}
