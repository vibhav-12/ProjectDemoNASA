package UIAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.ConfigReader;
import helpers.GlobalUtil;
import pageobjects.C78643OR;
import pageobjects.LoginPageOR;

public class C78643Action extends GlobalUtil{
	public static void LogIn(WebDriver driver) throws Exception{
		//clickOnElement(driver, LoginPageOR.submit);
		highlight(C78643OR.userName, driver);
		inputText(C78643OR.userName, ConfigReader.getValue("Username"));//it will enter username on the Login Page
		highlight(C78643OR.password, driver);
		inputText(C78643OR.password, ConfigReader.getValue("Password"));//it will enter password on the Login Page
		clickOnElement(driver, C78643OR.login);//it will click Submit button on the Login Page
		
		
}
	public static String getRandomString(WebElement element,WebDriver driver) throws InterruptedException
	{
		waitForElementToBeClickable(driver, element);
		Thread.sleep(5000);
		String elementValue=element.getText();
		System.out.println("last name is"+elementValue);
		String finalValue=elementValue+generateRandomNumber();
		System.out.println("last name is"+finalValue);
		return finalValue;
	}
	  public static void closePanel(WebDriver driver,String path,WebElement element)
	  {
		  boolean result=isWebElementThere(driver, path);
		  if(result==true)
		  {
			  clickOnElementUsingJS(driver, element);
			  System.out.println("clicked close");
		  }
		  
	  }
	  
	   
	
	
}
