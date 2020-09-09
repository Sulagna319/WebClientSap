Feature: Saperion Web Client Login Page Tests

  @WebloginFeature
  @weblogin
  Scenario: Validate the login functionality of Saperion Web Client
    Given User is on Web Login Page
    When User give credentials "administrator" and "qa"
    And user select appropriate tenant "system"
    And User click on Login Button
    And User Check for Duplicate Session
    Then User will sign on successfully

  @WebloginFeature
  @webloginfailure
  Scenario Outline: Validate the login functionality of Saperion Web Client
    Given User is on Web Login Page
    When User give credentials "<username>" and "<password>"
    And user select appropriate tenant "<tenant>"
    And User click on Login Button
    Then User will check for error message

    Examples:
     |username|password|tenant|
     |Administrator|wx| system|
     |        abc  |qa| system|
     |Administrator|qa| sys1  |

  @WebloginFeature
  @weblockuserverification
  Scenario Outline: Validate the login functionality of Saperion Web Client
    Given User is on Web Login Page
    When User give credentials "<username>" and "<password>"
    And user select appropriate tenant "<tenant>"
    And User click on Login Button
    Then User will check for lock user error message

    Examples:
      |username|password|tenant|
      |saperionlockuser|qa| system|

  @WebloginFeature
   @blankuserpasswordverification
   Scenario: Validate the login functionality of Saperion Web Client
     Given User is on Web Login Page
     When User give blank Username  and Password
     And user select appropriate tenant "system"
     And User click on Login Button
     Then User will get appropriate error message



  @WebloginFeature
  @webdeleteduserverification
  Scenario Outline: Validate the login functionality of Saperion Web Client
    Given User is on Web Login Page
    When User give credentials "<username>" and "<password>"
    And user select appropriate tenant "<tenant>"
    And User click on Login Button
    Then User will check for lock user error message

    Examples:
      |username|password|tenant|
      |saperiondeleteduser|qa| system|


  @WebloginFeature
  @multiplesession
  Scenario: Validate the duplicate session validation in web Client
    Given User is on Web Login Page
    When User give credentials "administrator" and "qa"
    And user select appropriate tenant "system"
    And User click on Login Button
    Then User will validate the duplicate session

  @WebloginFeature
  @indexuserlogin
  Scenario: Validate the indexuser login validation in web Client
    Given User is on Web Login Page
    When User give credentials "administrator" and "qa"
    And user select appropriate tenant "system"
    And user select usertype as "index"
    And User click on Login Button
    And User Check for Duplicate Session
    Then User Click on Administrator profile
    And User Click on User Profile button
    Then User Check For Substitute Field "index"

  @WebloginFeature
  @Queryuserlogin
  Scenario: Validate the queryuser login validation in web Client
    Given User is on Web Login Page
    When User give credentials "administrator" and "qa"
    And user select appropriate tenant "system"
    And user select usertype as "query"
    And User click on Login Button
    And User Check for Duplicate Session
    Then User Click on Administrator profile
    And User Click on User Profile button
    Then User Check For Substitute Field "Query"

  @WebloginFeature
  @LogOutFuntionality
  Scenario: Validate the queryuser login validation in web Client
    Given User is on Web Login Page
    When User give credentials "administrator" and "qa"
    And user select appropriate tenant "system"
    And user select usertype as "query"
    And User click on Login Button
    And User Check for Duplicate Session
    Then User Click on Administrator profile
    And User Click on LogOut Button
    Then User is on Web Login Page










