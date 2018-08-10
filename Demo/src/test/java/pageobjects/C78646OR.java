package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class C78646OR {

	public final static String Items="//a[@href='#items-container']";
	public final static String ShipmentsMenuLink="//a[@id='items-trigger']";
	public final static String EditShipment="//a[@class='keep_shipments']//span[@class='fa fa-edit edit']";
	public final static String PricePaid="//input[@id='price_input']";
	public final static String QuantityInput="//input[@id='qty_input']";
	public final static String SaveButton="//button[@id='parent-save-button']";
	public final static String ShipmentPricePaid="//span[contains(@id,'price_val')]";
	public final static String QuantityValue="//span[@id='qty_val']";
	public final static String TaxPercentage="//input[@id='tax-percent-input']";
	public final static String UnitTax="(//tr[contains(@id,'item-row')]//span[1])[3]";
	
	public final static String TaxEdit="//tr[@class='no-stripe no-border padding-top shipping_info']//span[@class='fa fa-edit edit']";
	
	public final static String ShippingFee="//input[@id='shippingFee']";
	
	public final static String SandTax="//input[@id='shippingTaxRate']";
	public final static String Tax="//input[@id='itemTax']";
	public final static String TaxSave="//button[@class='button save no-margin']";
	
	public final static String ShippingHandlingTax="//span[contains(@id,'shippingFee-price')]";
	                                               
	public final static String VerifyTax="//span[contains(@id,'shipmentItemTax-price')]";
	
	@FindBy(how=How.XPATH, using=Items)
	@CacheLookup
	public static WebElement items;
	
	@FindBy(how=How.XPATH, using=ShipmentsMenuLink)
	@CacheLookup
	public static List<WebElement> shipmentsMenuLink;
	
	@FindBy(how=How.XPATH, using=EditShipment)
	
	public static WebElement editShipment;
	
	@FindBy(how=How.XPATH, using=PricePaid)
	@CacheLookup
	public static WebElement pricePaid;
	
	@FindBy(how=How.XPATH, using=QuantityInput)
	@CacheLookup
	public static WebElement quantityInput;
	
	@FindBy(how=How.XPATH, using=SaveButton)
	
	public static WebElement saveButton;
	
	@FindBy(how=How.XPATH, using=ShipmentPricePaid)
	@CacheLookup
	public static WebElement shipmentPricePaid;
	

	@FindBy(how=How.XPATH, using=QuantityValue)
	@CacheLookup
	public static WebElement quantityValue;
	
	@FindBy(how=How.XPATH, using=TaxPercentage)
	@CacheLookup
	public static WebElement taxPercentage;
	

	@FindBy(how=How.XPATH, using=UnitTax)
	@CacheLookup
	public static WebElement unitTax;
	
	@FindBy(how=How.XPATH, using=TaxEdit)
	
	public static WebElement taxEdit;
	
	@FindBy(how=How.XPATH, using=ShippingFee)
	
	public static WebElement shippingFee;
	
	@FindBy(how=How.XPATH, using=SandTax)
	
	public static WebElement sandTax;
	
	@FindBy(how=How.XPATH, using=Tax)
	
	public static WebElement tax;
	
	@FindBy(how=How.XPATH, using=TaxSave)
	
	public static WebElement taxSave;
	
	@FindBy(how=How.XPATH, using=ShippingHandlingTax)
	
	public static WebElement shippingHandlingTax;
	
	@FindBy(how=How.XPATH, using=VerifyTax)
	
	public static WebElement verifyTax;
	
}
