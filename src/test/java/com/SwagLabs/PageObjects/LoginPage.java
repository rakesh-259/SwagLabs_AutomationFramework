package com.SwagLabs.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	
	 //WebDriver driver;

	public LoginPage(WebDriver driver){
		super(driver);
	}
	//web element of login page locators
    By txt_username = By.name("user-name");
	
	By txt_password = By.name("password");
	
	By check_login = By.xpath("//input[@type='submit']");
	
	By logo = By.className("login_logo");
	
	//action menthods of login page
	
	public  void SetUserName()
	{
		driver.findElement(txt_username).sendKeys("standard_user");
	}
	
	public  void Userpassword()
	{
		driver.findElement(txt_password).sendKeys("secret_sauce");		
	}
	public void LoginClick()
	{
		driver.findElement(check_login).click();
	}
	public void login_auto()
	{
		driver.findElement(txt_username).sendKeys("standard_user");
		driver.findElement(txt_password).sendKeys("secret_sauce");
		driver.findElement(check_login).click();
	}

}
