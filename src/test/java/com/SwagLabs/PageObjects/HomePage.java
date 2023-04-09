package com.SwagLabs.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver){
		super(driver);
	}
	//location of methods 
	@FindBy(xpath = "//div[@class=\"inventory_item_description\"]//a//div")
	List<WebElement> ProductCount;
	//button[@id='add-to-cart-sauce-labs-backpack']
	//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']
	@FindBy(xpath="//button[normalize-space()='Add to cart'][1]")
	WebElement AddToCart; 
	
	public void FindProductAndClick(String prodName) 
	{		
		for( int i = 0;i<=ProductCount.size();i++)
		{
			if (ProductCount.get(i).getText().equals(prodName))
			{
				ProductCount.get(i).click();
				AddToCart();
				break;
			}
		}
	}
	public  void AddToCart()
	{
		AddToCart.click();
		driver.navigate().back();
	}
}
