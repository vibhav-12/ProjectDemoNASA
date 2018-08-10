package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class C78643OR {
	public final static String Username="//input[@id='username']";
	public final static String Password="//input[@id='password']";
	public final static String Login="//input[@name='submit']";
	public final static String Dashboard="//h2[contains(text(),'Dashboard')]";
	public final static String FirstName="//input[@id='customerFirstName']";
	public final static String SearchButton="//button[@id='customer-search-submit']";
	public final static String SearhResults="//h2[@id='search-title']";
	public final static String DashboardLink="//b[contains(text(),'Dashboard')]";
	public final static String CustomerClose="//a[@onclick=\"GLOBAL.flipCard($(this).closest('.card')); GLOBAL.toggleFrontCardView($(this).closest('.card')); CUSTOMER_CARE.customerCare.injectCustomerOverviewForm(); GLOBAL.trackSimpleEvent('actions', 'Cancel edit customer info', 'click', -1); return false;\"]";
	public final static String CustomerEmail="//input[@id='customerEmail']";
	public final static String Order="//input[@id='searchFormOrderID']";
	public final static String TableBody="//tbody[@id='customer_search_results_table_body']";
	public final static String OrderQueue="//b[contains(text(),'Order queues')]";
	public final static String EditCustomer="(//span[@class='fa fa-edit'])[1]";	
	public final static String LastName="//form[@id='customer_form']//input[@id='lastName']";
	public final static String SaveButton="//form[@id='customer_form']//button[@id='shipping_form_save']";
	public final static String EditPayment="(//span[@class='fa fa-edit'])[2]";
	public final static String EditShippingAddress="(//span[@class='fa fa-edit'])[3]";
	public final static String PaymentsFirstName="//div[@id='billing-column']//input[@id='firstName']";
	
	public final static String PaymentsSaveButton="//div[@class='form_element save_button left clearfix']//button[@type='button'][contains(text(),'Save')]";
	
	public final static String GiftCard="//span[@class='recipient-name']";
	
	public final static String GiftReceipientName="//input[@id='recipient']";
	
	public final static String GiftReceipientNote="//textarea[@id='message']";
	
	public final static String GiftReceipientSaveButton="//button[@class='button'][contains(text(),'Save')]";
	
	public final static String GiftSuccessMessage="//div[@class='message-content']//strong[contains(text(),'Success!')]";
	public final static String ShippingFirstName="//form[@id='shipping_form']//input[@id='firstName']";
	
	public final static String ShippingLastName="//form[@id='shipping_form']//input[@id='lastName']";
	
	public final static String ShippingSaveButton="//form[@id='shipping_form']//button[@id='shipping_form_save']";
	
	public final static String ViewCustomerRecord="//a[contains(text(),'View customer record')]";
	
	public final static String CustomerRecord="//h2[@class='page-title']";
	public final static String CustomerRecordEmailId="(//div[@id='customer_overview_card']//li[1])[1]";
	public final static String CustomerRecordName="(//div[@id='customer_overview_card']//h2)[1]";
	
	@FindBy(how=How.XPATH, using=Username)
	@CacheLookup
	public static WebElement userName;
	
	@FindBy(how=How.XPATH, using=Password)
	@CacheLookup
	public static WebElement password;
	
	@FindBy(how=How.XPATH, using=Login)
	@CacheLookup
	public static WebElement login;
	
	
	@FindBy(how=How.XPATH, using=Dashboard)
	@CacheLookup
	public static List<WebElement> dashboard;
	
	@FindBy(how=How.XPATH, using=FirstName)
	@CacheLookup
	public static WebElement firstName;
	
	@FindBy(how=How.XPATH, using=SearchButton)
	
	public static WebElement searchButton;
	
	
	@FindBy(how=How.XPATH, using=SearhResults)
	@CacheLookup
	public static WebElement searhResults;
	
	@FindBy(how=How.XPATH, using=DashboardLink)
	
	public static WebElement dashboardLink;
	
	@FindBy(how=How.XPATH, using=CustomerEmail)
	@CacheLookup
	public static WebElement customerEmail;
	
	@FindBy(how=How.XPATH, using=Order)
	@CacheLookup
	public static WebElement order;
	
	@FindBy(how=How.XPATH, using=TableBody)
	@CacheLookup
	public static WebElement tableBody;
	
	@FindBy(how=How.XPATH, using=OrderQueue)
	@CacheLookup
	public static WebElement orderQueue;
	
	@FindBy(how=How.XPATH, using=EditCustomer)
	public static WebElement editCustomer;
	
	@FindBy(how=How.XPATH, using=LastName)
	public static WebElement lastName;
	
	@FindBy(how=How.XPATH, using=SaveButton)
	public static WebElement saveButton;
	
	@FindBy(how=How.XPATH, using=EditPayment)
	public static WebElement editPayment;
	
	@FindBy(how=How.XPATH, using=PaymentsFirstName)
	public static WebElement paymentsFirstName;
	
	@FindBy(how=How.XPATH, using=PaymentsSaveButton)
	public static WebElement paymentsSaveButton;
	
	@FindBy(how=How.XPATH, using=GiftCard)
	public static WebElement giftCard;
	
	@FindBy(how=How.XPATH, using=GiftReceipientName)
	public static WebElement giftReceipientName;
	
	@FindBy(how=How.XPATH, using=GiftReceipientNote)
	public static WebElement giftReceipientNote;
	
	@FindBy(how=How.XPATH, using=GiftReceipientSaveButton)
	public static WebElement giftReceipientSaveButton;
	
	@FindBy(how=How.XPATH, using=GiftSuccessMessage)
	public static WebElement giftSuccessMessage;
	
	@FindBy(how=How.XPATH, using=EditShippingAddress)
	public static WebElement editShippingAddress;
	
	@FindBy(how=How.XPATH, using=ShippingFirstName)
	public static WebElement shippingFirstName;
	
	@FindBy(how=How.XPATH, using=ShippingLastName)
	public static WebElement shippingLastName;
	
	@FindBy(how=How.XPATH, using=ShippingSaveButton)
	public static WebElement shippingSaveButton;
	
	@FindBy(how=How.XPATH, using=CustomerClose)
	public static WebElement customerClose;
	
	@FindBy(how=How.XPATH, using=ViewCustomerRecord)
	public static WebElement viewCustomerRecord;
	
	@FindBy(how=How.XPATH, using=CustomerRecord)
	public static WebElement customerRecord;
	
	@FindBy(how=How.XPATH, using=CustomerRecordEmailId)
	@CacheLookup
	public static WebElement customerRecordEmailId;
	
	@FindBy(how=How.XPATH, using=CustomerRecordName)
	@CacheLookup
	public static WebElement customerRecordName;
	
	

}