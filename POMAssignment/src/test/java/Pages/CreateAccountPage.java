package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import steps.BaseClass;

public class CreateAccountPage extends BaseClass
{
	
	public CreateAccountPage clickTitle()
	{
	   driver.findElement(By.id("id_gender2")).click();
	   return this;
	}
	public CreateAccountPage firstName(String fname) 
	{
	    driver.findElement(By.id("customer_firstname")).sendKeys(fname);
	    return this;
	}
	public CreateAccountPage lastName(String lname)
	{
		driver.findElement(By.id("customer_lastname")).sendKeys(lname);
		return this;
	}
	public CreateAccountPage enterPassword(String pword)
	{
		driver.findElement(By.id("passwd")).sendKeys(pword);
		return this;
	}
	public CreateAccountPage enterDate(String date) 
	{
		WebElement dateEle = driver.findElement(By.id("days"));
		Select dateOption = new Select(dateEle);
		dateOption.selectByValue(date);
		return this;
		
	}
	public CreateAccountPage enterMonth(String month) 
	{
		WebElement monthEle = driver.findElement(By.id("months"));
		Select monthOption = new Select(monthEle);
		monthOption.selectByValue(month);
		return this;
	}
	public CreateAccountPage enterYear(String year)
	{
		WebElement yearEle = driver.findElement(By.id("years"));
		Select yearOption = new Select(yearEle);
		yearOption.selectByValue(year);
		return this;
	}
	public CreateAccountPage enterAddress(String address) 
	{
	  driver.findElement(By.id("address1")).sendKeys(address);
	  return this;
	}
	public CreateAccountPage enterCity(String city) 
	{
	 driver.findElement(By.id("city")).sendKeys(city);
	 return this;
	}
	public CreateAccountPage selectState(String state)
	{
	   WebElement stateEle = driver.findElement(By.id("id_state"));
	   Select stateOption = new Select(stateEle);
	   stateOption.selectByVisibleText(state);
	   return this;
	   
	}
	public CreateAccountPage enterPostalCode(String postalcode) 
	{
	    driver.findElement(By.id("postcode")).sendKeys(postalcode);
	    return this;
	}
	public CreateAccountPage selectCountry(String country) 
	{
	   WebElement countryEle = driver.findElement(By.id("id_country"));
	   Select countryOption = new Select(countryEle);
	   countryOption.selectByVisibleText(country);
	   return this;
	}
	public CreateAccountPage enterMbileNo(String mobileno) 
	{
		driver.findElement(By.id("phone_mobile")).sendKeys(mobileno);
		return this;
	}
	public CreateAccountPage enterAliasAddress(String aliasaddress)
	{
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys(aliasaddress);
		return this;
	}	
	public MyAccountPage clickRegisterBtton() 
	{
		driver.findElement(By.id("submitAccount")).click();
		return new MyAccountPage();
	}
	
	
}
