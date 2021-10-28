package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class BaseClass 
{
	public static ChromeDriver driver; 
	public  String fname;
	public  String lname;
	public String text;
	public ExtentReports extent;
	public ExtentTest test;
	public String testName,testDescription,testCategory,testAuthor;
	  
  
}
