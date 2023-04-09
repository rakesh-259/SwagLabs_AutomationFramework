package com.SwagLabs.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.SwagLabs.PageObjects.HomePage;
import com.SwagLabs.PageObjects.LoginPage;
import com.SwagLabs.Utilities.ExcelUtiles;
import com.SwagLabs.testBase.BaseClass;


public class TC_002_HomePageAddTheProduct_dataDriven extends BaseClass {
	
	String file=System.getProperty("user.dir")+"\\testdata\\demo.xlsx";
	
	@Test()
	public void testLogin() throws IOException
	{
		LoginPage lg= new LoginPage(driver);
		lg.login_auto();	
		HomePage hp= new HomePage(driver);
		    int row =ExcelUtiles.getRowCount(file,"Sheet1");
		    int col= ExcelUtiles.getCellCount(file, "Sheet1", row);
		    for(int i=1;i<=row;i++)
		    {		
		    	hp.FindProductAndClick(ExcelUtiles.getCellData(file, "Sheet1", i, 0));
		    }		    		   		    		    			
	}

}
