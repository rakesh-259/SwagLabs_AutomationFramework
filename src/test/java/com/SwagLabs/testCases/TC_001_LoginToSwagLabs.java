package com.SwagLabs.testCases;

//import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.SwagLabs.PageObjects.HomePage;
import com.SwagLabs.PageObjects.LoginPage;
import com.SwagLabs.testBase.BaseClass;

public class TC_001_LoginToSwagLabs extends BaseClass {
	
	@Test()
	public void testLogin()
	{
		LoginPage lg= new LoginPage(driver);
//		lg.SetUserName();
//		lg.Userpassword();
//		lg.LoginClick();
		lg.login_auto();
		HomePage hp= new HomePage(driver);
		hp.FindProductAndClick("Sauce Labs Onesie");
		
	}
	
}
