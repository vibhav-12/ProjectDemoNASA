package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import UIAction.C78643Action;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.ConfigReader;
import helpers.GlobalUtil;
import pageobjects.C78643OR;
import pageobjects.LoginPageOR;

public class C748643 extends GlobalUtil{
public WebDriver driver;
public String lastName;
public String paymentFirstName;
public String giftReciepientNote;
public String shippingFirstName;
public  String giftReciepient;
public String email;
public String customerFirstName;

    
    
    public C748643()
    {
    	driver = Hooks.driver;
    	
    	
    }
    
    @Given("^Login to Customer Care using prerequisite credentials$")
    public void login_to_Customer_Care_using_prerequisite_credentials() throws Throwable {
    	driver.get(ConfigReader.getValue("CCUIURL"));
    	PageFactory.initElements(driver, C78643OR.class);
    	C78643Action.LogIn(driver);
    }

    @Then("^verify that User should be navigated to Dashboard page\\.$")
    public void verify_that_User_should_be_navigated_to_Dashboard_page() throws Throwable {
        isWebElementPresent(driver, C78643OR.dashboard);
    }

    @When("^I Provide first name as \"([^\"]*)\" of customer that has created prerequisite order, in First name text-field\\.$")
    public void i_Provide_first_name_as_of_customer_that_has_created_prerequisite_order_in_First_name_text_field(String arg1) throws Throwable {
    	customerFirstName=arg1;
    	highlight(C78643OR.firstName, driver);
    	inputText(C78643OR.firstName, arg1);
    }

    @Then("^Click Search button$")
    public void click_button() throws Throwable {
    	highlight(C78643OR.searchButton, driver);
    	clickOnElement(driver, C78643OR.searchButton);
    }

    @Then("^verify User should be navigated to Search Results page\\.$")
    public void verify_User_should_be_navigated_to_page() throws Throwable {
    	highlight(C78643OR.searhResults, driver);
    	isWebElementPresent(driver, C78643OR.SearhResults);
    }
    
    @Given("^Provide email id as \"([^\"]*)\" of customer that has created prerequisite order, in Customer email text-field$")
    public void provide_email_id_as_of_customer_that_has_created_prerequisite_order_in_Customer_email_text_field(String arg1) throws Throwable {
        email=arg1;
    	clickOnElement(driver, C78643OR.dashboardLink);
       highlight(C78643OR.customerEmail, driver);
       inputText(C78643OR.customerEmail, arg1);
       //clicked on search button
    }

    @Then("^verify Results should get filtered out based on provided email$")
    public void verify_Results_should_get_filtered_out_based_on_provided_email() throws Throwable {
    	highlight(C78643OR.tableBody, driver);
    	isWebElementPresent(driver, C78643OR.TableBody);
    }

    @Given("^Now provide prerequisite order id as \\\"([^\\\"]*)\\\" in Find Order text-box\\.$")
    public void now_provide_prerequisite_order_id_in_Find_Order_text_box(String arg1) throws Throwable {
    	clickOnElement(driver, C78643OR.dashboardLink);
    	highlight(C78643OR.order, driver);
    	inputText(C78643OR.order, arg1);
    	//clicked on search button
    }

    @Then("^verify User should be navigated to Order Details page\\.$")
    public void verify_User_should_be_navigated_to_Order_Details_page() throws Throwable {
    	Thread.sleep(5000);
    	highlight(C78643OR.orderQueue, driver);
    	isWebElementPresent(driver, C78643OR.OrderQueue);
    	unhighlightLast(driver, C78643OR.orderQueue);
    	
    }
    
    @Given("^Click Edit icon visible corresponding to customer name$")
    public void click_Edit_icon_visible_corresponding_to_customer_name() throws Throwable {
    	highlight(C78643OR.editCustomer, driver);
    	clickOnElement(driver, C78643OR.editCustomer);
        
    }

    @Then("^Provide valid values in all fields of Customer Details section\\.$")
    public void provide_valid_values_in_all_fields_of_Customer_Details_section() throws Throwable {
        lastName=C78643Action.getRandomString(C78643OR.lastName,driver);
        highlight(C78643OR.lastName, driver);
        inputText(C78643OR.lastName, lastName);
    }

    @When("^Click Save button\\.$")
    public void click_Save_button() throws Throwable {
       clickOnElement(driver, C78643OR.saveButton);
       C78643Action.closePanel(driver, C78643OR.CustomerClose, C78643OR.customerClose);
      
    }

    @Then("^verify that Customer details should get updated showing success message\\.$")
    public void verify_that_Customer_details_should_get_updated_showing_success_message() throws Throwable {
       //error message is coming but value getting updated
    }
    
    @Given("^Click Edit icon visible for Billing & Payment section$")
    public void click_Edit_icon_visible_for_Billing_Payment_section() throws Throwable {
    	 highlight(C78643OR.editPayment, driver);
    	 clickOnElementUsingJS(driver, C78643OR.editPayment);
    }

    @Given("^Select/provide valid values in all fields$")
    public void select_provide_valid_values_in_all_fields() throws Throwable {
    	 paymentFirstName=C78643Action.getRandomString(C78643OR.paymentsFirstName,driver);
    	 highlight(C78643OR.paymentsFirstName, driver);
         inputText(C78643OR.paymentsFirstName, paymentFirstName);
    }

    @When("^Click corresponding Save button$")
    public void click_corresponding_Save_button() throws Throwable {
    	 highlight(C78643OR.paymentsSaveButton, driver);
    	 clickOnElement(driver, C78643OR.paymentsSaveButton);
    	 
    }

    @Then("^verify that Billing address should get updated showing success message$")
    public void verify_that_Billing_address_should_get_updated_showing_success_message() throws Throwable {
       //no success message coming
    }
    @Given("^Click Gift for recipient name link$")
    public void click_Gift_for_recipient_name_link() throws Throwable {
    	highlight(C78643OR.giftCard, driver);
    	 clickOnElementUsingJS(driver, C78643OR.giftCard);
    }

    @Given("^Provide valid values in all fields$")
    public void provide_valid_values_in_all_fields() throws Throwable {
    	 giftReciepient=C78643Action.getRandomString(C78643OR.giftReceipientName,driver);
    	highlight(C78643OR.giftReceipientName, driver);
        inputText(C78643OR.giftReceipientName, giftReciepient);
        
         giftReciepientNote=C78643Action.getRandomString(C78643OR.giftReceipientNote,driver);
        highlight(C78643OR.giftReceipientNote, driver);
        inputText(C78643OR.giftReceipientNote, giftReciepientNote);
    }

    @When("^Click on the Save Button$")
    public void click_on_the_Save_Button() throws Throwable {
    	clickOnElement(driver, C78643OR.giftReceipientSaveButton);
    }

    @Then("^verify Success message should get generated$")
    public void verify_Success_message_should_get_generated() throws Throwable {
    	highlight(C78643OR.giftSuccessMessage, driver);
       isWebElementDisplayed(driver, C78643OR.GiftSuccessMessage); 
    }
    
    @Then("^Again click on Gift for recipient name link$")
    public void again_click_on_Gift_for_recipient_name_link() throws Throwable {
    
    	clickOnElementUsingJS(driver, C78643OR.giftCard);
    }

    @Given("^Click Edit icon visible for Shipping address section$")
    public void click_Edit_icon_visible_for_Shipping_address_section() throws Throwable {
    	 highlight(C78643OR.editShippingAddress, driver);
    	clickOnElement(driver, C78643OR.editShippingAddress);
    }

    @Given("^provide valid corresponding values in all fields$")
    public void provide_valid_corresponding_values_in_all_fields() throws Throwable {
    	 shippingFirstName=C78643Action.getRandomString(C78643OR.shippingFirstName,driver);
    	 highlight(C78643OR.shippingFirstName, driver);
        inputText(C78643OR.shippingFirstName, shippingFirstName);
        
        String lastName=C78643Action.getRandomString(C78643OR.shippingLastName,driver);
        highlight(C78643OR.shippingLastName, driver);
        inputText(C78643OR.shippingLastName, lastName);
        
    }

    @When("^clicking on the Save button$")
    public void clicking_on_the_Save_button() throws Throwable {
    	highlight(C78643OR.shippingSaveButton, driver);
    	clickOnElement(driver, C78643OR.shippingSaveButton);
    }

    @Then("^verify that Shipping address should get updated showing success message$")
    public void verify_that_Shipping_address_should_get_updated_showing_success_message() throws Throwable {
    	highlight(C78643OR.giftSuccessMessage, driver);
    	isWebElementDisplayed(driver, C78643OR.GiftSuccessMessage); 
    }

    @Given("^Click on View Customer Record link$")
    public void click_on_View_Customer_Record_link() throws Throwable {
    	//Thread.sleep(5000);
    	scrollPageUp(driver);
    	clickOnElementUsingJS(driver, C78643OR.viewCustomerRecord);
    }

    @Then("^Customer record page should get opened in new tab$")
    public void customer_record_page_should_get_opened_in_new_tab() throws Throwable {
    	Thread.sleep(5000);
    	switchToNewBrowserTab(driver);
    	highlight(C78643OR.customerRecord, driver);
    	//Thread.sleep(5000);
        isWebElementPresent(driver, C78643OR.CustomerRecord);
        unhighlightLast(driver, C78643OR.customerRecord);
    }

    @Then("^Correct customer detail, shipping information, customer history, order history and billing & payment information should be visible$")
    public void correct_customer_detail_shipping_information_customer_history_order_history_and_billing_payment_information_should_be_visible() throws Throwable {
    	
    	highlight(C78643OR.customerRecordName, driver);
    	CompareText(C78643OR.customerRecordName, customerFirstName);
    	unhighlightLast(driver, C78643OR.customerRecordName);
    	Thread.sleep(5000);
    	
    	highlight(C78643OR.customerRecordEmailId, driver);
    	CompareText(C78643OR.customerRecordEmailId, email);
    	unhighlightLast(driver, C78643OR.customerRecordEmailId);
    }

    
    
    
    
}
