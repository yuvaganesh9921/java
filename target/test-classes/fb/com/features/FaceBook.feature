Feature: Facebook Login function-Testcase Automation

Scenario: FB Login with valid details
Given User Launch "edge" Browser
And User naviagte Url "https://www.facebook.com/"
And User Verify page land on login page
And User Enter Valid Username "Tester"
And User Enter Valid Password "tester"
And User Click Login Button
Then User Verify loged in Successfull
