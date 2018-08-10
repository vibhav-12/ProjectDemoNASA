Feature: Verify that user is able to edit value of quantity, price paid, S&H, tax and S&H tax.

  @CCUI
  Scenario Outline: Verifying the editing of quantity,price paid,tax functionality
    Given Login to Customer Care using prerequisite credentials
    Then verify that User should be navigated to Dashboard page.
    When provide prerequisite order id in Find Order text-box
    Then Click Search button
    Given Click Items side-menu link
    And Click on Edit icon visible corresponding to any Ready item
    Then Provide valid values in Quantity as "<Quantity>" & Price Paid as "<Price>" text fields
    And Click Save button
    Then verify Quantity & price paid should get updated and success message should get generated
    And Click on Edit icon visible corresponding to any Ready item
    Then Provide valid value in Unit tax (% or $) as "<Unit Tax>" text field
    And Click Save button
    Then verify Unit tax should get updated and success message should get generated
    Given Click on Edit icon visible corresponding to Subtotal amount
    And Provide valid value in Shipping & Handling as "<Shipping Tax>", S&H tax (% or $) as "<SandH Tax>" and Tax as "<Tax>"text-fields
    Then click on the Save button
    Then verify Provided values should get updated

    Examples: 
      | Quantity | Price | Unit Tax |Shipping Tax|SandH Tax|Tax|
      |        2 |     3 |        5 |2           |1        |1  |
