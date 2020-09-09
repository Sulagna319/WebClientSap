package stepdef;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageaction.WebHomePageActions;
import java.util.NoSuchElementException;

public class WebHomePageStepDef {

    public WebHomePageActions webhomepageactions;

    public WebHomePageStepDef(){

        webhomepageactions=new WebHomePageActions();
    }


    @Given("^User is on Saperion Web Client Home Page$")
    public void user_is_on_Saperion_Web_Client_Home_Page() throws Throwable {
        webhomepageactions.homepageValidation();

    }

    @Then("^User should able to see the Application$")
    public void user_should_able_to_see_the_Application() throws Throwable {
        

        webhomepageactions.ddcValidation();

    }


    @When("^User Click on Application$")
    public void user_Click_on_application() throws Throwable{
       webhomepageactions.applicationClick();
    }

    @Then("^DDC property should be displayed properly$")
    public void DDC_properly_should_be_displayed_properly() throws Throwable{
        webhomepageactions.ddcpropertyDisplayed();
    }

    @When("^User right click on application$")
    public void user_right_click_on_application() throws Throwable {
       webhomepageactions.applicationContextClick();
        
    }

    @When("^User click upload file and Select the file to upload$")
    public void select_the_file_to_upload() throws Throwable {

        webhomepageactions.clickUploadFile();
        
    }

    @Then("^User index the document$")
    public void user_index_the_document() throws Throwable {
        
        webhomepageactions.okButtonClick();
    }

    @Then("^Document Should be archived$")
    public void document_Should_be_archived() {
        try{
            webhomepageactions.archiveDocs();
        }
        catch(Exception e)
        {

            System.out.println("Element not found:");

        }

    }

    @And("^User provide indexing data \"([^\"]*)\" and \"([^\"]*)\"$")
    public void User_provide_indexing_data(String id,String name) throws Throwable{

        webhomepageactions.provideIndexData(id,name);
    }

    @When("^User give index id \"([^\"]*)\" and index data \"([^\"]*)\"$")
    public void user_give_index_id_and_index_data(String id, String name) {

        webhomepageactions.enterIndexInformation(id,name);
        
    }

    @When("^User click on Result button$")
    public void user_click_on_Result_button(){
        
        try {
            webhomepageactions.clickResultButton();
        }
        catch(NoSuchElementException e) {
            System.out.println("Element not found:");
        }
    }

    @Then("^in Query result document should be present$")
    public void in_Query_result_document_should_be_present() {
        
        try {
            webhomepageactions.displayDocument();
        }
        catch(NoSuchElementException e){
            System.out.println("Element not found:");
        }
    }


    @Then("^Document should be displayed in the viewer$")
    public void document_should_be_displayed_in_the_viewer(){

        try{
            webhomepageactions.displayViewer();
        }
        catch(NoSuchElementException e){
            System.out.println("Element not found:");
        }
    }


    @When("^Select Document from resultlist \"([^\"]*)\"$")
    public void select_Document_from_resultlist(String doctype) {

        try{
            webhomepageactions.clickDocuments(doctype);
        }
        catch(NoSuchElementException e){
            System.out.println("Element not found:");
        }

    }
    @And("^User Click on Help Button$")
    public void user_click_on_help_button() {
        webhomepageactions.clickHelpButton();
    }
    @Then("^User Should able to see the Saperion Documentation Page$")
    public void user_should_able_to_see_the_saperion_documentation_Page(){
        webhomepageactions.checkHelpWindow();
    }



}
