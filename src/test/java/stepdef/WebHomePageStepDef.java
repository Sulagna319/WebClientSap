package stepdef;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pageaction.WebHomePageActions;
import util.LoggerHelper;

import java.util.NoSuchElementException;

public class WebHomePageStepDef {

    public WebHomePageActions webhomepageactions;
    Logger log = LoggerHelper.getLogger(WebHomePageStepDef.class);

    public WebHomePageStepDef() {

        webhomepageactions = new WebHomePageActions();
    }


    @Given("^User is on Saperion Web Client Home Page$")
    public void user_is_on_Saperion_Web_Client_Home_Page() throws Throwable {
        webhomepageactions.homepageValidation();
        log.info("Validate the homepage");

    }

    @Then("^User should able to see the Application$")
    public void user_should_able_to_see_the_Application() throws Throwable {
        webhomepageactions.ddcValidation();
        log.info("Check the DDC");
    }


    @When("^User Click on Application$")
    public void user_Click_on_application() throws Throwable {
        webhomepageactions.applicationClick();
        log.info("Click on DDC");
    }

    @Then("^DDC property should be displayed properly$")
    public void DDC_properly_should_be_displayed_properly() throws Throwable {
        webhomepageactions.ddcpropertyDisplayed();
        log.info("Property of DDC displayed");
    }

    @When("^User right click on application$")
    public void user_right_click_on_application() throws Throwable {
        webhomepageactions.applicationContextClick();
        log.info("context click on Application");

    }

    @When("^User click upload file and Select the file to upload$")
    public void select_the_file_to_upload() throws Throwable {

        webhomepageactions.clickUploadFile();
        log.info("Upload the File");

    }

    @Then("^User index the document$")
    public void user_index_the_document() throws Throwable {

        webhomepageactions.okButtonClick();
        log.info("Index the Documents");
    }

    @Then("^Document Should be archived$")
    public void document_Should_be_archived() {
        try {
            webhomepageactions.archiveDocs();
            log.info("Document Archived");
        } catch (Exception e) {

            System.out.println("Element not found:");

        }

    }

    @And("^User provide indexing data \"([^\"]*)\" and \"([^\"]*)\"$")
    public void User_provide_indexing_data(String id, String name) throws Throwable {

        webhomepageactions.provideIndexData(id, name);
        log.info("User Provide indexing data");
    }

    @When("^User give index id \"([^\"]*)\" and index data \"([^\"]*)\"$")
    public void user_give_index_id_and_index_data(String id, String name) {

        webhomepageactions.enterIndexInformation(id, name);
        log.info("Enter Index information");

    }

    @When("^User click on Result button$")
    public void user_click_on_Result_button() {

        try {
            webhomepageactions.clickResultButton();
            log.info("Click on Result button");
        } catch (NoSuchElementException e) {
            System.out.println("Element not found:");
        }
    }

    @Then("^in Query result document should be present$")
    public void in_Query_result_document_should_be_present() {

        try {
            webhomepageactions.displayDocument();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found:");
        }
    }


    @Then("^Document should be displayed in the viewer$")
    public void document_should_be_displayed_in_the_viewer() {

        try {
            webhomepageactions.displayViewer();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found:");
        }
    }


    @When("^Select Document from resultlist \"([^\"]*)\"$")
    public void select_Document_from_resultlist(String doctype) {

        try {
            webhomepageactions.clickDocuments(doctype);
        } catch (NoSuchElementException e) {
            System.out.println("Element not found:");
        }

    }


    @And("^User Click on User Profile button$")
    public void user_click_on_user_profile_button() {
        webhomepageactions.clickProfileButton();
    }

    @Then("^User Check For Substitute Field \"([^\"]*)\"$")
    public void user_check_for_substitute_field(String usertype) {

        webhomepageactions.checkSubstitueField(usertype);

    }

    @And("^User Click on LogOut Button$")
    public void user_click_on_LogOut_button() {

        webhomepageactions.clickLogOutButton();
    }

    @And("^User Click on Log Button$")
    public void user_click_on_log_button() {

        webhomepageactions.clickLogButton();
    }

    @Then("^User will validate the Log Window$")
    public void user_will_validate_the_log_window() {

        webhomepageactions.checkLogWindow();
    }

    @And("^User Click on Help Button$")
    public void user_click_on_help_button() {


        webhomepageactions.clickHelpButton();
    }

    @Then("^User Should able to see the Saperion Web Client Help window$")
    public void user_should_able_to_see_the_saperion_web_client_help_window() {

        webhomepageactions.checkHelpWindow();
    }

    @When("^User right Click on the file in resultlist$")
    public void User_right_Click_on_the_file_in_resultlist() {
        webhomepageactions.contextClickFile();
    }

    @Then("^User is able to see the Edit Annotations button$")
    public void User_is_able_to_see_the_Edit_Annotations_button() {
        webhomepageactions.editAnnotationsDisplay();
    }

    @And("^User click on Edit Annotations button$")
    public void User_click_on_Edit_Annotations_button() {
        webhomepageactions.editAnnotationsClick();
    }
//sulagna
    @And("^User click on View button$")
    public void user_click_on_view_button() {
        webhomepageactions.viewClick();
    }
}

