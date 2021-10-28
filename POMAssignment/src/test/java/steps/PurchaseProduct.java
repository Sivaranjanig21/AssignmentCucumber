
package steps;


import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseProduct extends BaseClass
{
	SignInPage sp=new SignInPage();
	MyAccountPage MA = new MyAccountPage();
	
	@Given("Click on Signin link")
	public void clickSigninLink() throws InterruptedException 
	{
		new HomePage().clickSigninLink();
	}
	@Given("Enter Email address as {string}")
	public void enterEmailId(String email)
	{
		
		sp.enterEmail(email);
	}
	@Given("Enter the password as {string}")
	public void enterPassword(String pword)
	{
		sp.enterPassword(pword);
	}
	@Given("Click on Sign in button")
	public void clickSignin() throws InterruptedException
	{
	 sp.clickSignin();
	}
	@Given("Click on Women option")
	public void click_on_women_option() throws InterruptedException
	{
	 MA.click_on_women_option();
	}	
	
	@Given("Click on image button")
	public void clickOnImageButton()
	{
	 MA.clickOnImageButton();
	}
	@Given("Click on Add to cart button")
	public void clickOnAddtoCart()
	{
		MA.clickOnAddtoCart();
	}

	@Given("Click on Proceed to checkout button")
	public void clickProceedCheckoutButton()
	{
		MA.clickProceedCheckoutButton();
	}
	@Given("Click on Proceed to checkout button in summary tab")
	public void clickProceedSummarytab() 
	{
		MA.clickProceedSummarytab();
	}
	@Given("Click on Proceed to checkout button in address tab")
	public void clickProceedAddresstab()
	{
		MA.clickProceedAddresstab();
	}
	@Given("Click on Terms of service check box")
	public void clickTermsbox() 
	{
		MA.clickTermsbox();
	}
	@When("Click on Proceed to checkout button in shipping tab")
	public void clickProceedShipping()
	{
		MA.clickProceedShipping();
	}
	@Then("Verify the Product details")
	public void verify_the_product_details() 
	{
	 MA.verify_the_product_details();
	}


}
