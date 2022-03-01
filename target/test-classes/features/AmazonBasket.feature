Feature: Amazon Web Application

Background:

Given User initialised the browser
When User triggred the browser
Then User make sure that bowser is invoking succesfully



Scenario: Amazon Basket Validation for Valid User
Given User Landed on Amazon home Page
And Click on Signin Option
When Signin page is displayed User enter email "priyankpatel48@yahoo.com" and password "shankerji48"
And Click on Signin button
Then Amazon account is displayed for the user
And Search iteam box is also displayed
When User enter Airpods in the search box
And click on search icon
Then Aipods list displayed for the user 
When User choose the Airpods and add to the basket 
Then iteam is added in to the basket
But User choosed the wrong iteam so he delete the iteam from the basket
When User enter MacBook in to the search box
And click on search icon
Then Macbook list is displayed on the page
And User choose his Macbook from the list
When User click add iteam to basket button
Then MacBook is added in to the basket
But User choosed the wrong MacBook so he delete the iteam from the basket
And User validate basket is empty 
And User click alloption for signout and close the browser 