package Pages;

import org.openqa.selenium.By;

import steps.BaseClass;

public class SignInPage extends BaseClass
{

	public SignInPage enterEmailId(String email)
	{
		driver.findElement(By.id("email_create")).sendKeys(email);
		return this;
	}
	public CreateAccountPage clickCreateAccount()
	{
		driver.findElement(By.id("SubmitCreate")).click();
		return new CreateAccountPage();
	}
	public SignInPage enterEmail(String email)
	{
		driver.findElement(By.id("email")).sendKeys(email);
		return this;
	}
	public SignInPage enterPassword(String pword)
	{
		driver.findElement(By.id("passwd")).sendKeys(pword);
		return this;
	}
	public MyAccountPage clickSignin() throws InterruptedException
	{
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(3000);
		return new MyAccountPage();
	}
	
}
