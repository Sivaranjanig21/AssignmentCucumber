package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import steps.BaseClass;

public class MyAccountPage extends BaseClass
{
	public String verifyName(String fname,String lname)
	{
		String text1 = driver.findElement(By.xpath("//a[@class='account']/span")).getText();
  	    Assert.assertEquals(text1,fname+" "+lname);
  	    return text1;
	}
	public SignInPage click_on_sign_out_button() 
	{
	    driver.findElement(By.xpath("//a[@class='logout']")).click();
	    return new SignInPage();
	}
	public MyAccountPage click_on_women_option() throws InterruptedException
	{
	   Actions action = new Actions(driver);
	   WebElement findElement = driver.findElement(By.xpath("//a[@title='Women']"));
	   action.clickAndHold().perform();
	   action.moveToElement(findElement).perform();
	   driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]")).click();
	   Thread.sleep(3000);
	   return this;
	}	
	
	public MyAccountPage clickOnImageButton()
	{
	    text = driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[2]")).getText();
	    driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[2]")).click();
	    return this;
	}
	public MyAccountPage clickOnAddtoCart()
	{
	    driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	    return this;
	}

	public MyAccountPage clickProceedCheckoutButton()
	{
	   driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	   return this;
	}
	public MyAccountPage clickProceedSummarytab() 
	{
	  driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
	  return this;
	}
	public MyAccountPage clickProceedAddresstab()
	{
	  driver.findElement(By.name("processAddress")).click();
	  return this;
	}
	public MyAccountPage clickTermsbox() 
	{
	   driver.findElement(By.id("cgv")).click();
	   return this;
	}
	public MyAccountPage clickProceedShipping()
	{
	    driver.findElement(By.name("processCarrier")).click();
	    return this;
	}
	public String verify_the_product_details() 
	{
	  String producttext = driver.findElement(By.xpath("//p[@class='product-name']/a")).getText();
	  if(text.equalsIgnoreCase(producttext))
	  {
		  System.out.println("Items are matched");
	  }
	  else
	  {
		  System.out.println("Items are not matched");
	  }
	  return  producttext;
	}




}
