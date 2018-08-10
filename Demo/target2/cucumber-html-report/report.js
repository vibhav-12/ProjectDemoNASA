$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/C748646.feature");
formatter.feature({
  "line": 1,
  "name": "Verify that user is able to edit value of quantity, price paid, S\u0026H, tax and S\u0026H tax.",
  "description": "",
  "id": "verify-that-user-is-able-to-edit-value-of-quantity,-price-paid,-s\u0026h,-tax-and-s\u0026h-tax.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verifying the editing of quantity,price paid,tax functionality",
  "description": "",
  "id": "verify-that-user-is-able-to-edit-value-of-quantity,-price-paid,-s\u0026h,-tax-and-s\u0026h-tax.;verifying-the-editing-of-quantity,price-paid,tax-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@CCUI"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login to Customer Care using prerequisite credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify that User should be navigated to Dashboard page.",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "provide prerequisite order id in Find Order text-box",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click Items side-menu link",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Click on Edit icon visible corresponding to any Ready item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Provide valid values in Quantity as \"\u003cQuantity\u003e\" \u0026 Price Paid as \"\u003cPrice\u003e\" text fields",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click Save button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify Quantity \u0026 price paid should get updated and success message should get generated",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Click on Edit icon visible corresponding to any Ready item",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Provide valid value in Unit tax (% or $) as \"\u003cUnit Tax\u003e\" text field",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click Save button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify Unit tax should get updated and success message should get generated",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Click on Edit icon visible corresponding to Subtotal amount",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Provide valid value in Shipping \u0026 Handling as \"\u003cShipping Tax\u003e\", S\u0026H tax (% or $) as \"\u003cSandH Tax\u003e\" and Tax as \"\u003cTax\u003e\"text-fields",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click on the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "verify Provided values should get updated",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "verify-that-user-is-able-to-edit-value-of-quantity,-price-paid,-s\u0026h,-tax-and-s\u0026h-tax.;verifying-the-editing-of-quantity,price-paid,tax-functionality;",
  "rows": [
    {
      "cells": [
        "Quantity",
        "Price",
        "Unit Tax",
        "Shipping Tax",
        "SandH Tax",
        "Tax"
      ],
      "line": 24,
      "id": "verify-that-user-is-able-to-edit-value-of-quantity,-price-paid,-s\u0026h,-tax-and-s\u0026h-tax.;verifying-the-editing-of-quantity,price-paid,tax-functionality;;1"
    },
    {
      "cells": [
        "2",
        "3",
        "5",
        "2",
        "1",
        "1"
      ],
      "line": 25,
      "id": "verify-that-user-is-able-to-edit-value-of-quantity,-price-paid,-s\u0026h,-tax-and-s\u0026h-tax.;verifying-the-editing-of-quantity,price-paid,tax-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3696389874,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Verifying the editing of quantity,price paid,tax functionality",
  "description": "",
  "id": "verify-that-user-is-able-to-edit-value-of-quantity,-price-paid,-s\u0026h,-tax-and-s\u0026h-tax.;verifying-the-editing-of-quantity,price-paid,tax-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@CCUI"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login to Customer Care using prerequisite credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify that User should be navigated to Dashboard page.",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "provide prerequisite order id in Find Order text-box",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click Items side-menu link",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Click on Edit icon visible corresponding to any Ready item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Provide valid values in Quantity as \"2\" \u0026 Price Paid as \"3\" text fields",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click Save button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify Quantity \u0026 price paid should get updated and success message should get generated",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Click on Edit icon visible corresponding to any Ready item",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Provide valid value in Unit tax (% or $) as \"5\" text field",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click Save button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify Unit tax should get updated and success message should get generated",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Click on Edit icon visible corresponding to Subtotal amount",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Provide valid value in Shipping \u0026 Handling as \"2\", S\u0026H tax (% or $) as \"1\" and Tax as \"1\"text-fields",
  "matchedColumns": [
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click on the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "verify Provided values should get updated",
  "keyword": "Then "
});
formatter.match({
  "location": "C748643.login_to_Customer_Care_using_prerequisite_credentials()"
});
formatter.result({
  "duration": 15372302357,
  "status": "passed"
});
formatter.match({
  "location": "C748643.verify_that_User_should_be_navigated_to_Dashboard_page()"
});
formatter.result({
  "duration": 44268831,
  "status": "passed"
});
formatter.match({
  "location": "C784646.provide_prerequisite_order_id_in_Find_Order_text_box()"
});
formatter.result({
  "duration": 5302289295,
  "error_message": "java.lang.NullPointerException\r\n\tat APIs.CreateOrder.createOrder(CreateOrder.java:63)\r\n\tat step_definitions.C784646.provide_prerequisite_order_id_in_Find_Order_text_box(C784646.java:32)\r\n\tat ✽.When provide prerequisite order id in Find Order text-box(features/C748646.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "C748643.click_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C784646.click_Items_side_menu_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C784646.click_on_Edit_icon_visible_corresponding_to_any_Ready_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 37
    },
    {
      "val": "3",
      "offset": 57
    }
  ],
  "location": "C784646.provide_valid_values_in_Quantity_as_Price_Paid_as_text_fields(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C784646.click_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C784646.verify_Quantity_price_paid_should_get_updated_and_success_message_should_get_generated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C784646.click_on_Edit_icon_visible_corresponding_to_any_Ready_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 45
    }
  ],
  "location": "C784646.provide_valid_value_in_Unit_tax_or_$_as_text_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C784646.click_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C784646.verify_Unit_tax_should_get_updated_and_success_message_should_get_generated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C784646.click_on_Edit_icon_visible_corresponding_to_Subtotal_amount()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 47
    },
    {
      "val": "1",
      "offset": 72
    },
    {
      "val": "1",
      "offset": 87
    }
  ],
  "location": "C784646.provide_valid_value_in_Shipping_Handling_as_S_H_tax_or_$_as_and_Tax_as_text_fields(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C784646.click_on_the_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C784646.verify_Provided_values_should_get_updated()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://future-customer-qa.cloudatron.com/customer/");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 909856317,
  "status": "passed"
});
formatter.uri("features/C78643.feature");
formatter.feature({
  "line": 1,
  "name": "Verify that search functionality \u0026 the functionality available under Customer section works correctly.",
  "description": "",
  "id": "verify-that-search-functionality-\u0026-the-functionality-available-under-customer-section-works-correctly.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verifying the search functionality of CCUI",
  "description": "",
  "id": "verify-that-search-functionality-\u0026-the-functionality-available-under-customer-section-works-correctly.;verifying-the-search-functionality-of-ccui",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@CCUI"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login to Customer Care using prerequisite credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify that User should be navigated to Dashboard page.",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I Provide first name as \"\u003cfirst name\u003e\" of customer that has created prerequisite order, in First name text-field.",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify User should be navigated to Search Results page.",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Provide email id as \"\u003cemail\u003e\" of customer that has created prerequisite order, in Customer email text-field",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Click Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify Results should get filtered out based on provided email",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Now provide prerequisite order id as \"\u003corder id\u003e\" in Find Order text-box.",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "verify User should be navigated to Order Details page.",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click Edit icon visible corresponding to customer name",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Provide valid values in all fields of Customer Details section.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Click Save button.",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "verify that Customer details should get updated showing success message.",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click Edit icon visible for Billing \u0026 Payment section",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Select/provide valid values in all fields",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Click corresponding Save button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "verify that Billing address should get updated showing success message",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Click Gift for recipient name link",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "Provide valid values in all fields",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on the Save Button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "verify Success message should get generated",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Again click on Gift for recipient name link",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Click Edit icon visible for Shipping address section",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "provide valid corresponding values in all fields",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "clicking on the Save button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "verify that Shipping address should get updated showing success message",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Click on View Customer Record link",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "Customer record page should get opened in new tab",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Correct customer detail, shipping information, customer history, order history and billing \u0026 payment information should be visible",
  "keyword": "And "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "verify-that-search-functionality-\u0026-the-functionality-available-under-customer-section-works-correctly.;verifying-the-search-functionality-of-ccui;",
  "rows": [
    {
      "cells": [
        "first name",
        "email",
        "order id"
      ],
      "line": 38,
      "id": "verify-that-search-functionality-\u0026-the-functionality-available-under-customer-section-works-correctly.;verifying-the-search-functionality-of-ccui;;1"
    },
    {
      "cells": [
        "Bobby",
        "qa-DDonuts21@shopatron.com",
        "40089631"
      ],
      "line": 39,
      "id": "verify-that-search-functionality-\u0026-the-functionality-available-under-customer-section-works-correctly.;verifying-the-search-functionality-of-ccui;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2226786402,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Verifying the search functionality of CCUI",
  "description": "",
  "id": "verify-that-search-functionality-\u0026-the-functionality-available-under-customer-section-works-correctly.;verifying-the-search-functionality-of-ccui;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@CCUI"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login to Customer Care using prerequisite credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify that User should be navigated to Dashboard page.",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I Provide first name as \"Bobby\" of customer that has created prerequisite order, in First name text-field.",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify User should be navigated to Search Results page.",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Provide email id as \"qa-DDonuts21@shopatron.com\" of customer that has created prerequisite order, in Customer email text-field",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Click Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify Results should get filtered out based on provided email",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Now provide prerequisite order id as \"40089631\" in Find Order text-box.",
  "matchedColumns": [
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "verify User should be navigated to Order Details page.",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click Edit icon visible corresponding to customer name",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Provide valid values in all fields of Customer Details section.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Click Save button.",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "verify that Customer details should get updated showing success message.",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click Edit icon visible for Billing \u0026 Payment section",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Select/provide valid values in all fields",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Click corresponding Save button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "verify that Billing address should get updated showing success message",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Click Gift for recipient name link",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "Provide valid values in all fields",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on the Save Button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "verify Success message should get generated",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Again click on Gift for recipient name link",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Click Edit icon visible for Shipping address section",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "provide valid corresponding values in all fields",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "clicking on the Save button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "verify that Shipping address should get updated showing success message",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Click on View Customer Record link",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "Customer record page should get opened in new tab",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Correct customer detail, shipping information, customer history, order history and billing \u0026 payment information should be visible",
  "keyword": "And "
});
formatter.match({
  "location": "C748643.login_to_Customer_Care_using_prerequisite_credentials()"
});
formatter.result({
  "duration": 12771661068,
  "status": "passed"
});
formatter.match({
  "location": "C748643.verify_that_User_should_be_navigated_to_Dashboard_page()"
});
formatter.result({
  "duration": 19805312,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bobby",
      "offset": 25
    }
  ],
  "location": "C748643.i_Provide_first_name_as_of_customer_that_has_created_prerequisite_order_in_First_name_text_field(String)"
});
formatter.result({
  "duration": 223743547,
  "status": "passed"
});
formatter.match({
  "location": "C748643.click_button()"
});
formatter.result({
  "duration": 3200860235,
  "status": "passed"
});
formatter.match({
  "location": "C748643.verify_User_should_be_navigated_to_page()"
});
formatter.result({
  "duration": 122092119,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qa-DDonuts21@shopatron.com",
      "offset": 21
    }
  ],
  "location": "C748643.provide_email_id_as_of_customer_that_has_created_prerequisite_order_in_Customer_email_text_field(String)"
});
formatter.result({
  "duration": 3936430615,
  "status": "passed"
});
formatter.match({
  "location": "C748643.click_button()"
});
formatter.result({
  "duration": 11613914287,
  "status": "passed"
});
formatter.match({
  "location": "C748643.verify_Results_should_get_filtered_out_based_on_provided_email()"
});
formatter.result({
  "duration": 54145362,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "40089631",
      "offset": 38
    }
  ],
  "location": "C748643.now_provide_prerequisite_order_id_in_Find_Order_text_box(String)"
});
formatter.result({
  "duration": 5880326242,
  "status": "passed"
});
formatter.match({
  "location": "C748643.click_button()"
});
formatter.result({
  "duration": 8601965851,
  "status": "passed"
});
formatter.match({
  "location": "C748643.verify_User_should_be_navigated_to_Order_Details_page()"
});
formatter.result({
  "duration": 5111115257,
  "status": "passed"
});
formatter.match({
  "location": "C748643.click_Edit_icon_visible_corresponding_to_customer_name()"
});
formatter.result({
  "duration": 224308018,
  "status": "passed"
});
formatter.match({
  "location": "C748643.provide_valid_values_in_all_fields_of_Customer_Details_section()"
});
formatter.result({
  "duration": 5308441562,
  "status": "passed"
});
formatter.match({
  "location": "C748643.click_Save_button()"
});
formatter.result({
  "duration": 372340921,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca onclick\u003d\"GLOBAL.flipCard($(this).closest(\u0027.card\u0027)); GLOBAL.toggleFrontCardView($(this).closest(\u0027.card\u0027)); CUSTOMER_CARE.customerCare.injectCustomerOverviewForm(); GLOBAL.trackSimpleEvent(\u0027actions\u0027, \u0027Cancel edit customer info\u0027, \u0027click\u0027, -1); return false;\" href\u003d\"#\"\u003e...\u003c/a\u003e is not clickable at point (735, 10). Other element would receive the click: \u003cdiv id\u003d\"manufacturer-select-text\" class\u003d\"right\" onclick\u003d\"$(\u0027#manufacturer-catalog-select\u0027).slideToggle(\u0027fast\u0027);\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d68.0.3440.106)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027TRANTOR114\u0027, ip: \u0027172.16.254.173\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\VIBHAV~1.GUP\\AppData\\Local\\Temp\\scoped_dir4292_7563}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d68.0.3440.106, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 7f61878b37c51d3b22c5c98542c79be3\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:275)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\r\n\tat helpers.GlobalUtil.clickOnElement(GlobalUtil.java:129)\r\n\tat UIAction.C78643Action.closePanel(C78643Action.java:37)\r\n\tat step_definitions.C748643.click_Save_button(C748643.java:114)\r\n\tat ✽.When Click Save button.(features/C78643.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "C748643.verify_that_Customer_details_should_get_updated_showing_success_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.click_Edit_icon_visible_for_Billing_Payment_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.select_provide_valid_values_in_all_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.click_corresponding_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.verify_that_Billing_address_should_get_updated_showing_success_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.click_Gift_for_recipient_name_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.provide_valid_values_in_all_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.click_on_the_Save_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.verify_Success_message_should_get_generated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.again_click_on_Gift_for_recipient_name_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.click_Edit_icon_visible_for_Shipping_address_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.provide_valid_corresponding_values_in_all_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.clicking_on_the_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.verify_that_Shipping_address_should_get_updated_showing_success_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.click_on_View_Customer_Record_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.customer_record_page_should_get_opened_in_new_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "C748643.correct_customer_detail_shipping_information_customer_history_order_history_and_billing_payment_information_should_be_visible()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://future-customer-qa.cloudatron.com/customer/order/40089631");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1005501648,
  "status": "passed"
});
});