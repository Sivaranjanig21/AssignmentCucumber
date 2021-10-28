package steps;


import Pages.CreateAccountPage;
import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSignIn extends BaseClass
{
	SignInPage sp=new SignInPage();
	MyAccountPage MA = new MyAccountPage();
	CreateAccountPage CA=new CreateAccountPage();
	@Given("Click on the Signin link")
	public void clickSigninLink() 
	{
		new HomePage().clickSigninLink();
	}
	@Given("Enter the Email address as {string}")
	public void enterEmailId(String email)
	{
		sp.enterEmailId(email);
	}
	@Given("Click on create an account")
	public void clickCreateAccount()
	{
		sp.clickCreateAccount();
	}
	@Given("Click on the Title")
	public void clickTitle()
	{
		CA.clickTitle();
	}
	@Given("Enter the First name as {string}")
	public void firstName(String fname) 
	{
		CA.firstName(fname);
	}
	@Given("Enter the Last name as {string}")
	public void lastName(String lname)
	{
		CA.lastName(lname);
	}
	@Given("Enter the Password as {string}")
	public void enterPassword(String pword)
	{
		CA.enterPassword(pword);
	}
	@Given("Select the Date as {string}")
	public void enterDate(String date) 
	{
		CA.enterDate(date);
	}
	@Given("Select the Month as {string}")
	public void enterMonth(String month) 
	{
		CA.enterMonth(month);
	}
	@Given("Select the Year as {string}")
	public void enterYear(String year)
	{
		CA.enterYear(year);
	}
	@Given("Enter the Address as {string}")
	public void enteAddress(String address) 
	{
		CA.enterAddress(address);
	}
	@Given("Enter the City as {string}")
	public void enterCity(String city) 
	{
		CA.enterCity(city);
	}
	@Given("Select the State {string}")
	public void selectState(String state)
	{
	  CA.selectState(state);
	}
	@Given("Enter the Postal code as {string}")
	public void enterPostalCode(String postalcode) 
	{
		CA.enterPostalCode(postalcode);
	}
	@Given("Select the Country as {string}")
	public void selectCountry(String country) 
	{
		CA.selectCountry(country);
	}
	@Given("Enter the Mobile number as {string}")
	public void enterMbileNo(String mobileno) 
	{
		CA.enterMbileNo(mobileno);
	}
	@Given("Enter the Address alias as {string}")
	public void enterAliasAddress(String aliasaddress)
	{
		CA.enterAliasAddress(aliasaddress);
	}	
	@When("Click on Register button")
	public void clickRegisterBtton() 
	{
		CA.clickRegisterBtton();
	}
	@Then("Verify the name as {string} and surname as {string} to be dispalyed properly")
	public void verifyName(String fname,String lname)
	{
		MA.verifyName(fname, lname);
	}
	@Given("Click on Sign Out button")
	public void click_on_sign_out_button() 
	{
		MA.click_on_sign_out_button();
	}


}
