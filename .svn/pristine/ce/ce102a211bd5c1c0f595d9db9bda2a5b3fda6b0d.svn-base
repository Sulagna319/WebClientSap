package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pageaction.WebHomePageActions;
import pageaction.WebViewerPageActions;
import pagelocators.WebAnnotationPageLocators;
import util.LoggerHelper;


public class WebViewerStepDef {

    public WebHomePageActions webhomepageactions;
    public WebAnnotationPageLocators webAnnotationPageLocators;
    public WebViewerPageActions webViewerPageActions;

    Logger log = LoggerHelper.getLogger(WebHomePageStepDef.class);


    public WebViewerStepDef() {
        webViewerPageActions = new WebViewerPageActions();
        webhomepageactions = new WebHomePageActions();
    }

    @Then("^User able to see the viewer window of document$")
    public void user_able_to_see_the_viewer_window_of_document() {

        webViewerPageActions.titleValidationViewer();
    }


    @Then("^Click on \"([^\"]*)\" rotation$")
    public void click_on_something_rotation(String rotation) {
        webViewerPageActions.sideRotation(rotation);

    }

    @Then("^check for alert$")
    public void check_for_alert() throws InterruptedException {
        webViewerPageActions.alertPopUp();
    }

    @And("^close file with change$")
    public void close_file_with_change() throws InterruptedException {
        webViewerPageActions.closeViewer();

    }

    @Then("^Click on Print$")
    public void click_on_print() throws Throwable {
        webViewerPageActions.clickPrint();
    }

    @Then("^appearance of the print dialogue box$")
    public void appearance_of_the_print_dialogue_box() {
        webViewerPageActions.printDialogueBox();
    }

    @And("^Printing page appears$")
    public void printing_page_appears(){
        webViewerPageActions.validatePrintingPage();
    }

    @Then("^Click on \"([^\"]*)\" option$")
    public void click_on_something_option(String zoomOption) {

        webViewerPageActions.zoomOptions(zoomOption);
    }

    @Then("^Click on \"([^\"]*)\" document option$")
    public void click_on_something_document_option(String view) {
        webViewerPageActions.dovViewOptions(view);

    }

    @Then("^User applies annotation in document$")
    public void user_applies_annotation_in_document()  {
        webViewerPageActions.applyAnnotation();
    }

    @And("^saves annotation applied$")
    public void saves_annotation_applied()  {
        webViewerPageActions.saveAnnotation();
    }

    @Then("^select  \"([^\"]*)\" option$")
    public void select_something_option(String picturecontrol)  {
        webViewerPageActions.viewerPicControls(picturecontrol);
    }

    @And("^save and close document window$")
    public void save_and_close_document_window() throws Throwable {
        webViewerPageActions.saveCloseDocViewer();
    }

    @And("^Click on show hide annotations option$")
    public void click_on_show_hide_annotations_option()  {
        webViewerPageActions.clickShowHideAnnotation();
    }

    @Then("^return to saperion home page$")
    public void return_to_saperion_home_page() throws Throwable {
        webViewerPageActions.returnToParentWindow();
    }

}


