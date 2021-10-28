package Pages;

import org.openqa.selenium.By;

import steps.BaseClass;

public class HomePage extends BaseClass
{
	public SignInPage clickSigninLink() 
	{
		driver.findElement(By.partialLinkText("Sign in")).click();
		return new SignInPage();
	}

	

}
