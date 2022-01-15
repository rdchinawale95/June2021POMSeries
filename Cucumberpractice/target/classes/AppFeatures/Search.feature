
Feature: Amazon Search

@Smoke
Scenario: Search a product
Given I have search field on amazon page
When I search for a product with name "Apple Macbook Air" and price 200
Then Product with name "Apple Macbook Air" should be displayed
Then Order id is 12345 and username is "Naveen"

@Regression
Scenario: Search a product for Pro
Given I have search field on amazon page
When I search for a product with name "Apple Macbook Pro" and price 200
Then Product with name "Apple Macbook Pro" should be displayed
Then Order id is 12345 and username is "Naveen"

@Prod
Scenario: Search a product for Iphone
Given I have search field on amazon page
When I search for a product with name "Apple iPhone 12" and price 200
Then Product with name "Apple iPhone 12" should be displayed
Then Order id is 12345 and username is "Naveen"