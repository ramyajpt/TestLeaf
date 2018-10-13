Feature: Create Lead in LeafTaps

Scenario Outline: Create lead with mandatory fields
And Enter the username as DemoSalesManager
And Enter the password as crmsfa
And Click Login Button
And Click CRMSFA link
And Click Create Leads Link
And Enter First Name as <fName>
And Enter Last Name as <lName>
And Enter Company Name as <cName>
When Click Create Lead Button
Then Verify lead is created successfully with first name as <fName>
Examples:
|fName|lName|cName|
|Ramya|Janagarajan|GE|
|Ramya|Taanvikaa|CISCO|
#@sanity 
#Scenario: Create lead with mandatory fields
##And Enter the username
##And Enter the password
##And Click Login Button
##And Click CRMSFA link
##And Click Create Leads Link
#And Enter First Name as Ramya
#And Enter Last Name as Jana
#And Enter Company Name as GE
#When Click Create Lead Button
#Then Verify lead is created successfully
#@smoke
#Scenario: Create lead with mandatory fields
##And Enter the username
##And Enter the password
##And Click Login Button
##And Click CRMSFA link
##And Click Create Leads Link
#And Enter First Name as Ramya
#And Enter Last Name as Taanvi
#And Enter Company Name as CISCO
#When Click Create Lead Button
#Then Verify lead is created successfully