Feature: Verify that search functionality & the functionality available under Customer section works correctly.

  @CCUI
  Scenario Outline: Verifying the search functionality of CCUI
    Given Login to Customer Care using prerequisite credentials
    Then verify that User should be navigated to Dashboard page.
    When I Provide first name as "<first name>" of customer that has created prerequisite order, in First name text-field.
    Then Click Search button
    Then verify User should be navigated to Search Results page.
    Given Provide email id as "<email>" of customer that has created prerequisite order, in Customer email text-field
    Then Click Search button
    Then verify Results should get filtered out based on provided email
    Given Now provide prerequisite order id as "<order id>" in Find Order text-box.
    Then Click Search button
    Then verify User should be navigated to Order Details page.
    Given Click Edit icon visible corresponding to customer name
    Then Provide valid values in all fields of Customer Details section.
    When Click Save button.
    Then verify that Customer details should get updated showing success message.
    Given Click Edit icon visible for Billing & Payment section
    And Select/provide valid values in all fields
    When Click corresponding Save button
    Then verify that Billing address should get updated showing success message
    Given Click Gift for recipient name link
    And Provide valid values in all fields
    When Click on the Save Button
    Then verify Success message should get generated
    Then Again click on Gift for recipient name link
    Given Click Edit icon visible for Shipping address section
    And provide valid corresponding values in all fields
    When clicking on the Save button
    Then verify that Shipping address should get updated showing success message
    Given Click on View Customer Record link
    Then Customer record page should get opened in new tab
    And Correct customer detail, shipping information, customer history, order history and billing & payment information should be visible

    Examples: 
      | first name | email                      | order id |
      | Bobby      | qa-DDonuts21@shopatron.com | 40089631 |
