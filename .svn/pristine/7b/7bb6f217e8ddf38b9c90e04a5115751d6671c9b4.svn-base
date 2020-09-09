package pageaction;


import com.google.common.base.Function;
import gherkin.lexer.Th;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import pagelocators.WebHomePageLocators;
import util.LoggerHelper;
import util.WebDriverHelper;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;


public class WebHomePageActions {

    public WebHomePageLocators homepagelocators;
    Logger log = LoggerHelper.getLogger(WebViewerPageActions.class);

    public void homepageValidation() throws NoSuchElementException {

        homepagelocators=new WebHomePageLocators();
        Assert.assertTrue(homepagelocators.saperionLogo.isDisplayed());

    }

    public void ddcValidation() throws NoSuchElementException{
        homepagelocators=new WebHomePageLocators();
        Assert.assertTrue(homepagelocators.application.isDisplayed());

    }

    public void applicationClick() throws NoSuchElementException{
        WebDriverHelper.implicitwait(5000);
        homepagelocators=new WebHomePageLocators();
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

    public void clickUploadFile() throws NoSuchElementException, AWTException,InterruptedException{
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

        homepagelocators.indexingid.sendKeys(id);
        homepagelocators.indexingname.sendKeys(name);
    }

    public void clickResultButton() {
        homepagelocators=new WebHomePageLocators();
        try {
            Thread.sleep(2000);
            homepagelocators.Resultbutton.click();
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
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

    public void clickProfileButton(){
        homepagelocators=new WebHomePageLocators();

        try{
            Thread.sleep(1000);
            homepagelocators.UserProfileButton.click();
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkSubstitueField(String user) {
        try {
            Thread.sleep(1000);
            if (user.equalsIgnoreCase("Index")) {
                Assert.assertTrue(homepagelocators.SubstituteText.isDisplayed());

            }
            else {
                FluentWait<WebDriver> wait = new FluentWait<WebDriver>(WebDriverHelper.driver);
                wait.pollingEvery(250, TimeUnit.MILLISECONDS);
                wait.withTimeout(2, TimeUnit.SECONDS);
                wait.ignoring(NoSuchElementException.class);
                Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
                    public Boolean apply(WebDriver driver) {

                        if (homepagelocators.SubstituteText.isDisplayed()) {
                            return true;
                        }
                        return false;
                    }
                };

                //wait.until(function);

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public void clickLogOutButton(){
        try{
            homepagelocators=new WebHomePageLocators();
            homepagelocators.LogOutButton.click();
            WebDriverHelper.implicitwait(7);
        }
        catch(NoSuchElementException e){
            e.printStackTrace();
        }


    }

    public void clickLogButton(){
        try{
            homepagelocators=new WebHomePageLocators();
            homepagelocators.OpenLogWindowButton.click();
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }

    }

    public void checkLogWindow(){
        try{
            Assert.assertTrue(homepagelocators.LoggingText.isDisplayed());
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    public void clickHelpButton(){
        try{
            homepagelocators=new WebHomePageLocators();
            homepagelocators.HelpButton.click();
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    public void checkHelpWindow(){
        try{
            Thread.sleep(1000);
            ArrayList<String> list=new ArrayList<String>(WebDriverHelper.driver.getWindowHandles());
            if(list.size()>1){
                WebDriverHelper.driver.switchTo().window(list.get(1));
                Assert.assertEquals("Working with Saperion Web Client",WebDriverHelper.driver.getTitle());
            }
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void contextClickFile(){
        try{
            homepagelocators=new WebHomePageLocators();
            WebDriverHelper.contextClick(homepagelocators.ResultlistBmp);
            Thread.sleep(1000);


        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void editAnnotationsDisplay(){
        try{

            Assert.assertTrue(homepagelocators.EditAnnotationsButton.isDisplayed());

        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }

    }

    public void editAnnotationsClick(){
        try {
            homepagelocators.EditAnnotationsButton.click();
            Thread.sleep(1000);
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//sulagna
    public void viewClick(){
        homepagelocators=new WebHomePageLocators();
        try {

            homepagelocators.View.click();
            log.info("Click on View option");
            Thread.sleep(3000);
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }
