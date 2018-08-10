package UIAction;

import helpers.ConfigReader;
import helpers.GlobalUtil;

import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;
import pageobjects.LoginPageOR;
/**
 * this file has actions happening on the Login Page by entering valid credentials 
 * @author vibhav.gupta
 *
 */
public class LoginAction extends GlobalUtil {

	
	/**
	 * will login into the application with valid credentials 
	 * @param driver
	 * @throws Exception
	 */
	public static void LogIn(WebDriver driver) throws Exception{
		//clickOnElement(driver, LoginPageOR.submit);
		highlight(LoginPageOR.userName, driver);
		inputText(LoginPageOR.userName, ConfigReader.getValue("Username"));//it will enter username on the Login Page
		highlight(LoginPageOR.password, driver);
		inputText(LoginPageOR.password, ConfigReader.getValue("Password"));//it will enter password on the Login Page
		clickOnElement(driver, LoginPageOR.login);//it will click Submit button on the Login Page
		int size=mutilpleOccurenceOfElement(driver, LoginPageOR.DontShowButton).size();
		executionDelay(3000);
		if(size!=0)
		{
			highlight(LoginPageOR.dontShowButton, driver);
			clickOnElement(driver, LoginPageOR.dontShowButton);
		}
		//expliciiWaitWithInvisibleElement(driver, LoginPageOR.HomePageLoader);//it will wait for the 'Loading Topologies..' loader to disappear
	
	}
	public static void ValidateLogin(WebDriver driver)
	{
		String URL=driver.getCurrentUrl();
    	String URL2=URL.substring(0, URL.indexOf("?"));
    	
    	System.out.println("URL is"+URL2);
    	if(!(ConfigReader.getValue("HomePageUrl").contains(URL2)))
    	{
    		fail();
    	}
    	else
    	{
    		System.out.println("Logged In Successfully");
    	}
        
	}
	
}
