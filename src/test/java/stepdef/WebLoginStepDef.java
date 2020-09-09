package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pageaction.WebLoginPageActions;
import util.LoggerHelper;


public class WebLoginStepDef {

    public WebLoginPageActions webloginpageactions;
    Logger log= LoggerHelper.getLogger(WebLoginStepDef.class);

    public WebLoginStepDef(){

        webloginpageactions=new WebLoginPageActions();


    }
    @Given("^User is on Web Login Page$")
    public void user_is_on_Web_Login_Page() {
        webloginpageactions.clientOpen();
        log.info("Opening the Client");
    }

    @When("^User give credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_give_credentials_and(String uid, String pwd){

        webloginpageactions.enterCreds(uid,pwd);
        log.info("Entering Username and Password");
    }


    @When("^user select appropriate tenant \"([^\"]*)\"$")
    public void user_select_appropriate_tenant(String tenant) {

        webloginpageactions.enterTenant(tenant);
        log.info("Entering tenant");
    }

    @When("^user select usertype as \"([^\"]*)\"$")
    public void user_select_usertype_as(String usertype){

        webloginpageactions.selectUserRole(usertype);
        log.info("Selecting User Role");

    }

    @When("^User click on Login Button$")
    public void user_click_on_Login_Button(){

        webloginpageactions.loginButtonClick();
        log.info("Clicking on Login button");

    }

    @Then("^User will sign on successfully$")
    public void user_will_sign_on_successfully(){
        webloginpageactions.loginSuccessful();
        log.info("Login Successfully");
    }

    @Then("^User will validate the duplicate session$")
    public void user_will_validate_the_duplicate_session(){
        webloginpageactions.duplicateSession();
        log.info("Validate the Duplicate Session");
    }

    @And("^User Check for Duplicate Session$")
    public void user_check_for_duplicate_session(){

        webloginpageactions.checkDuplicateSession();
        log.info("Click on Yes button on Duplicate Session");
    }

    @Then("^User Click on Administrator profile$")
    public void user_click_on_administrator_profile(){
        webloginpageactions.clickUserProfile();
        log.info("Login Successfully");

    }
    @Then("^User will check for error message$")
    public void user_will_check_for_error_message(){
        webloginpageactions.checkWrongPasswordMessage();
        log.info("Wrong Credentials");
    }

    @Then("^User will check for lock user error message$")
    public void user_will_check_for_lock_user_error_message(){
        webloginpageactions.checkLockedUserErrorMessage();
    }

    @When("^User give blank Username  and Password$")
    public void User_give_blank_Username_and_Password(){
        webloginpageactions.blankCredentials();
    }

    @Then("^User will get appropriate error message$")
    public void User_will_get_appropriate_error_message(){
        webloginpageactions.checkBlankErrorMessage();
    }




}
