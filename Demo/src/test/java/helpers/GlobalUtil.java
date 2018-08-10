package helpers;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author vibhav.gupta
 *this file contains all the commonly used functions 
 */
public class GlobalUtil {
	
	
	    
/**
 *it will wait for the element to become invisible
 * @param driver
 * @param path
 */
public static void expliciiWaitWithInvisibleElement(WebDriver driver,String path)
{
	WebDriverWait wait = new WebDriverWait(driver, 40);
	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(path)));
}

/**
 * it will hold the execution for the mentioned time
 * @param time
 * @throws InterruptedException
 */
public static void executionDelay(long time) throws InterruptedException
{

Thread.sleep(time);
}


/**
 * it will input the text.It will first clear the older data and then enter the new data
 * @param element
 * @param value
 */
public static void inputText(WebElement element,String value)
{
  element.clear();
  element.sendKeys(value);
}

/**
 * Checks if is web element enabled.
 *
 * @param driver the driver
 * @param path the path
 */
public static void isWebElementDisplayed(WebDriver driver,String path) 
{
	try
	{
		
		boolean element = driver.findElement(By.xpath(path)).isDisplayed();
		System.out.println("element is displayed");
	}
	catch(Exception e)
	{
		System.out.println("Handling isDisplayed method exception");
		System.out.println(e);
	}
	
}

public static void pressEnterKey(WebElement element)
{
	element.sendKeys(Keys.RETURN);
}


/**
 * it will wait for the element to become visible in DOM and on the web page before getting clicked.
 * @param driver
 * @param element
 * @return
 */
public static WebElement waitForElementToBeClickable(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,ConfigReader.getIntValue("ExplicitWait"));
	WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(element));
	return ele;
}

public static void inputTextUsingJS(WebDriver driver,WebElement element,String value)
{
	int val=Integer.parseInt(value);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[1].value=arguments[0];",val ,element);
}


public  static void clickOnElementUsingJS(WebDriver driver,WebElement element)
{
	
	 
	     
	 
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
}


/**
 * it will click on the element after waiting for certain time.
 * @param driver
 * @param element
 */
public static void clickOnElement(WebDriver driver,WebElement element)
{
	WebElement ele=waitForElementToBeClickable(driver,element);//explicit wait for element to appear and be clickable on the web page
    element.click();
}

/**
 * it will check if Web Element is present or not on the web page.
 * @param driver
 * @param path
 */
public static void isWebElementPresent(WebDriver driver,String path) 
{
	try
	{

	int size=driver.findElements(By.xpath(path)).size();//checks the single or multiple occurences of the web element.
	if(size!=0)
	System.out.println("element is present");
	}
	catch(Exception e)
	{
		System.out.println("fail");
		System.out.println(e);
	}
	
}

public static boolean isWebElementThere(WebDriver driver,String path) 
{
	
	int size=driver.findElements(By.xpath(path)).size();//checks the single or multiple occurences of the web element.
	if(size!=0)
	{
		System.out.println("element is present");
		return true;
	}
	else
	{
		return false;
	}
	
	
	
	
}


public static void isWebElementPresent(WebDriver driver,List<WebElement> element) 
{
	

	int size=element.size();//checks the single or multiple occurences of the web element.
	if(size!=0)
	System.out.println("element present");
	else
	{
		System.out.println("element not present");
		
	}
	
	
}

public static void CompareText(WebElement element,String value)
{
	  if(element.getText().contains(value))
	  {
		  System.out.println("Value Matched for"+value);
	  }
	  else
	  {
		  System.out.println("Value does not Matched for"+value);
	  }
}
		

/**
 * it will return list of multiple occurrence of same web  element
 * @param driver
 * @param path
 * @return list 
 */
public static List<WebElement> mutilpleOccurenceOfElement(WebDriver driver,String path)
{
	List<WebElement>list=driver.findElements(By.xpath(path));//checks the single or multiple occurences of the web element.
	return list;
}
public static void isElementDisplayed(WebDriver driver,WebElement element)

{
	boolean result=element.isDisplayed();
	assertTrue(result);
}

/**
 * Verify UI text.
 *
 * @param driver the driver
 * @param ele1 the ele 1
 * @param ExpectedValue the expected value
 */
public static void verifyUIText(WebDriver driver,WebElement ele1, String ExpectedValue)
{
	System.out.println(ele1.getText());
	String actualValue = ele1.getText();
	assertEquals(ExpectedValue, actualValue, "Text not matched !!");
}

public static void SelectUsingVisibleValue(WebElement element,String visibleValue) throws InterruptedException {
	Select select = new Select(element);
	select.selectByVisibleText(visibleValue);
	
}

public static void  highlight(WebElement element,WebDriver driver) {
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	         js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
	  }
	   public static void unhighlightLast(WebDriver driver,WebElement element) { 
	     JavascriptExecutor js=(JavascriptExecutor) driver;
	     js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 0px;');", element);



}
	   
public static String generateRandomNumber()
{
	Random rand = new Random(); 
	int value = rand.nextInt(100); 
	String num=Integer.toString(value);
	return num;
}

public static void scrollPagedown(WebDriver driver)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,1500)");
}
public static void scrollPageUp(WebDriver driver)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,-100)");
}
public static void switchToNewBrowserTab(WebDriver driver)
{
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
   
}
}
