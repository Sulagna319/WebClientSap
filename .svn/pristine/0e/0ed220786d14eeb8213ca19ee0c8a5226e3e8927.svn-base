Feature: This feature file contains all the test related to saprion Web Client homepage test

  Background: User should Login
    Given User is on Web Login Page
    When User give credentials "administrator" and "qa"
    And user select appropriate tenant "system"
    And User click on Login Button
    And User Check for Duplicate Session
    Then User will sign on successfully


  @WebDDCValidation
  Scenario: Validate the Application is shown in the homepage
    Given User is on Saperion Web Client Home Page
    Then User should able to see the Application


  @WebApplicationValidation
  Scenario: Validate the indexing functionality in Webclient
    Given User is on Saperion Web Client Home Page
    When User Click on Application
    Then DDC property should be displayed properly


  @WebUploadData
  Scenario:Validate the loading of document functionality
    Given User is on Saperion Web Client Home Page
    When User right click on application
    And User click upload file and Select the file to upload
    And User provide indexing data "1" and "doc"
    Then User index the document
    Then Document Should be archived


  @WebResultFunctionality
  Scenario: Validate search in ddc functionality
    Given User is on Saperion Web Client Home Page
    When User give index id "1" and index data "doc"
    And User click on Result button
    Then in Query result document should be present

  @WebViewerTest
  Scenario Outline:Validate documents is displayed correctly in WebViewer
    Given User is on Saperion Web Client Home Page
    When User Click on Application
    When User click on Result button
    And Select Document from resultlist "<doctype>"
    Then Document should be displayed in the viewer
  Examples:
    |doctype|
    |    bmp|

  @LoggingFunctionalityCheck
  Scenario: Validate Logging Functionality of Saperion
    Given User is on Saperion Web Client Home Page
    When User Click on Administrator profile
    And User Click on Log Button
    Then User will validate the Log Window

  @HelpButtonClickFunctionality
  Scenario:Validate HelpButton Click Functionality
    Given User is on Saperion Web Client Home Page
    When User Click on Administrator profile
    And User Click on Help Button
    Then User Should able to see the Saperion Web Client Help window












