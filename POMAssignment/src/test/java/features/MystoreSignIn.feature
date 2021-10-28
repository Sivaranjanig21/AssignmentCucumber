Feature: Registering the My Store Application functionality

Scenario: To Create an Account with valid inputs

Given Click on the Signin link
Given Enter the Email address as 'siva11925@gmail.com'
And Click on create an account
Given Click on the Title
And Enter the First name as 'Siva'
And Enter the Last name as 'N'
And Enter the Password as 'siva@123'
And Select the Date as '21'
And Select the Month as '12'
And Select the Year as '2005'
And Enter the Address as 'No.12,First Street'
And Enter the City as 'Chennai'
And Select the State 'Indiana'
And Enter the Postal code as '00001'
And Select the Country as 'United States'
And Enter the Mobile number as '9876789879'
And Enter the Address alias as 'No,23 south road'
When Click on Register button
Then Verify the name as 'Siva' and surname as 'N' to be dispalyed properly
Given Click on Sign Out button
