package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageaction.WebAnnotationPageActions;

public class WebAnnotationStepDef {

    public WebAnnotationPageActions webAnnotationPageActions;


    public WebAnnotationStepDef(){
        webAnnotationPageActions=new WebAnnotationPageActions();
    }



    @Then("^User able to see the view Document Window$")
    public void User_able_to_see_the_view_Document_Window(){
        webAnnotationPageActions.titleValidation();
    }

    @Then("^User is able to see all the annotations button \"([^\"]*)\"$")
    public void User_is_able_to_see_all_the_annotations_button(String button){
        webAnnotationPageActions.annotationButtonDisplayed(button);
    }



    @And("^User Close the annotation window$")
    public void User_Close_the_annotation_window(){
        webAnnotationPageActions.clickCloseButton();
    }
}
