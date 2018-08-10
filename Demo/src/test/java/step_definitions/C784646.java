package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import APIs.CreateOrder;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.GlobalUtil;
import pageobjects.C78643OR;
import pageobjects.C78646OR;

public class C784646 extends GlobalUtil{
public WebDriver driver;
private String price;
private String quantity;
private String taxPercenatge;
private String shippingTax;
private String tax;
public C784646()
  {
   driver = Hooks.driver;
    	
    	
  }

@When("^provide prerequisite order id in Find Order text-box$")
public void provide_prerequisite_order_id_in_Find_Order_text_box() throws Throwable {
   PageFactory.initElements(driver, C78643OR.class);
   PageFactory.initElements(driver, C78646OR.class);
   int orderId=CreateOrder.createOrder();
   String value=""+orderId;
   highlight(C78643OR.order, driver);
   inputText(C78643OR.order, value);
   Thread.sleep(14000);
}
@Given("^Click Items side-menu link$")
public void click_Items_side_menu_link() throws Throwable {
    clickOnElementUsingJS(driver, C78646OR.items);
    isWebElementPresent(driver,C78646OR.shipmentsMenuLink);
}

@Given("^Click on Edit icon visible corresponding to any Ready item$")
public void click_on_Edit_icon_visible_corresponding_to_any_Ready_item() throws Throwable {
	Thread.sleep(5000);
	clickOnElement(driver, C78646OR.editShipment);
}

@Then("^Provide valid values in Quantity as \"([^\"]*)\" & Price Paid as \"([^\"]*)\" text fields$")
public void provide_valid_values_in_Quantity_as_Price_Paid_as_text_fields(String arg1, String arg2) throws Throwable {
     price=arg1;
     quantity=arg2;
	highlight(C78646OR.pricePaid, driver);
	inputText(C78646OR.pricePaid, arg1);
	Thread.sleep(5000);
	 highlight(C78646OR.quantityInput, driver);
	 Thread.sleep(5000);
    inputText(C78646OR.quantityInput, arg2);
}

@Then("^Click Save button$")
public void click_Save_button() throws Throwable {
    highlight(C78646OR.saveButton, driver);
	clickOnElement(driver, C78646OR.saveButton);
}

@Then("^verify Quantity & price paid should get updated and success message should get generated$")
public void verify_Quantity_price_paid_should_get_updated_and_success_message_should_get_generated() throws Throwable {
   Thread.sleep(7000);
	CompareText(C78646OR.shipmentPricePaid, price);
   CompareText(C78646OR.quantityValue, quantity);
}


@Then("^Provide valid value in Unit tax \\(% or \\$\\) as \"([^\"]*)\" text field$")
public void provide_valid_value_in_Unit_tax_or_$_as_text_field(String arg1) throws Throwable {
   //clicked on edit
	Thread.sleep(7000);
	taxPercenatge=arg1;
	 highlight(C78646OR.taxPercentage, driver);
	inputText(C78646OR.taxPercentage, arg1);
	//clicked on save
}

@Then("^verify Unit tax should get updated and success message should get generated$")
public void verify_Unit_tax_should_get_updated_and_success_message_should_get_generated() throws Throwable {
    Thread.sleep(10000);
	CompareText(C78646OR.unitTax, taxPercenatge+"%");
}

@Given("^Click on Edit icon visible corresponding to Subtotal amount$")
public void click_on_Edit_icon_visible_corresponding_to_Subtotal_amount() throws Throwable {
	 highlight(C78646OR.taxEdit, driver);
	clickOnElement(driver, C78646OR.taxEdit);
}

@Given("^Provide valid value in Shipping & Handling as \"([^\"]*)\", S&H tax \\(% or \\$\\) as \"([^\"]*)\" and Tax as \"([^\"]*)\"text-fields$")
public void provide_valid_value_in_Shipping_Handling_as_S_H_tax_or_$_as_and_Tax_as_text_fields(String arg1, String arg2, String arg3) throws Throwable {
    shippingTax=arg1;
    tax=arg3;
   highlight(C78646OR.shippingFee, driver);
   inputText(C78646OR.shippingFee, arg1);
   highlight(C78646OR.sandTax, driver);
   inputText(C78646OR.sandTax, arg2);
   highlight(C78646OR.tax, driver);
   inputText(C78646OR.tax, arg3);
}

@Then("^click on the Save button$")
public void click_on_the_Save_button() throws Throwable {
	highlight(C78646OR.taxSave, driver);
	clickOnElement(driver, C78646OR.taxSave);
}

@Then("^verify Provided values should get updated$")
public void verify_Provided_values_should_get_updated() throws Throwable {
	Thread.sleep(7000);
	CompareText(C78646OR.shippingHandlingTax, shippingTax);
    CompareText(C78646OR.verifyTax,tax);
    Thread.sleep(5000);
}




}
