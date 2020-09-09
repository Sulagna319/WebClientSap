package pageaction;

import gherkin.lexer.No;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pagelocators.WebHomePageLocators;
import util.WebDriverHelper;

import java.awt.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class WebHomePageActions {

    public WebHomePageLocators homepagelocators;

    public void homepageValidation() throws NoSuchElementException{

        homepagelocators=new WebHomePageLocators();
        Assert.assertTrue(homepagelocators.saperionLogo.isDisplayed());

    }

    public void ddcValidation() throws NoSuchElementException{
        WebDriverHelper.fluentWait(homepagelocators.application);
        Assert.assertTrue(homepagelocators.application.isDisplayed());

    }

    public void applicationClick() throws NoSuchElementException{
        WebDriverHelper.implicitwait(5000);
        homepagelocators.application.click();
    }

    public void ddcpropertyDisplayed() throws NoSuchElementException {

        Assert.assertTrue(homepagelocators.IndexID.isDisplayed()&&homepagelocators.IndexName.isDisplayed());
        Assert.assertTrue(homepagelocators.Resultbutton.isEnabled());
    }



    public void applicationContextClick() throws NoSuchElementException{
        homepagelocators.application.click();
        System.out.println("Click");
        Actions action=new Actions(WebDriverHelper.driver);
        action.contextClick(homepagelocators.application).perform();
        System.out.println("Click");
    }

    public void clickUploadFile() throws NoSuchElementException,AWTException,InterruptedException{
        homepagelocators.UploadNewDocument.click();
        WebDriverHelper.uploadFile("C:\\SaperionWebAutomation\\src\\test\\resource\\Files\\file.docx");



    }

    public void okButtonClick() throws NoSuchElementException{
        homepagelocators.okButton.click();
    }

    public void archiveDocs() throws NoSuchElementException,InterruptedException{
        Thread.sleep(3000);
        Assert.assertFalse(homepagelocators.uploadwindowtext.isDisplayed());
    }

    public void provideIndexData(String id,String name) throws NoSuchElementException{
        homepagelocators.indexingid.sendKeys(id);
        homepagelocators.indexingname.sendKeys(name);
        homepagelocators.okButton.click();
    }

    public void enterIndexInformation(String id,String name) throws NoSuchElementException{

        homepagelocators.IndexID.sendKeys(id);
        homepagelocators.IndexName.sendKeys(name);
    }

    public void clickResultButton() throws NoSuchElementException{
        homepagelocators.Resultbutton.click();
    }

    public void displayDocument() throws NoSuchElementException{
        WebDriverHelper.implicitwait(5000);
        Assert.assertTrue(homepagelocators.docid.isDisplayed());
        Assert.assertTrue(homepagelocators.docname.isDisplayed());
    }

    public void clickDocuments(String doctype) throws NoSuchElementException{

        homepagelocators.image.click();

    }

    public void displayViewer() throws NoSuchElementException{
        Assert.assertTrue(homepagelocators.BmpImage.isDisplayed());
    }

    public void clickHelpButton(){
        try{
            homepagelocators.HelpButton.click();
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    public void checkHelpWindow(){
        try {
            Thread.sleep(3000);
            ArrayList<String> browsertabs=new ArrayList<String>(WebDriverHelper.driver.getWindowHandles());

            if(browsertabs.size()>1){
                WebDriverHelper.driver.switchTo().window(browsertabs.get(1));
                Assert.assertEquals("Working with Saperion Web Client",WebDriverHelper.driver.getTitle());
            }
            else {
                System.out.println("No Help Window Opened");
            }
            WebDriverHelper.driver.close();
            WebDriverHelper.driver.switchTo().window(browsertabs.get(0));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }

    }


}
