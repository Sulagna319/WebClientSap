package pageaction;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import pagelocators.WebLoginPageLocators;
import util.WebDriverHelper;

public class WebLoginPageActions {

    public WebLoginPageLocators webloginpagelocator;

    public void clientOpen() {
        try{
            webloginpagelocator=new WebLoginPageLocators();
            Assert.assertTrue(webloginpagelocator.WebClientText.isDisplayed());
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }


    }

    public void enterCreds(String uid,String pwd) {

        try {
            webloginpagelocator.UserName.clear();
            webloginpagelocator.UserName.sendKeys(uid);
            Thread.sleep(2000);
            webloginpagelocator.Password.sendKeys(pwd);
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void enterTenant(String tenant) {
        try {
            webloginpagelocator.Tenant.sendKeys(tenant);
            Thread.sleep(2000);
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    public void selectUserRole(String type)  {

        try{
            webloginpagelocator.UserType1.click();
            Thread.sleep(1000);

            if(type.equalsIgnoreCase("index")){
                webloginpagelocator.Indexuser.click();
            }

            else{
                webloginpagelocator.QueryUser.click();
            }

            WebDriverHelper.implicitwait(5000);

        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }


    }

    public void loginButtonText() {

        try {
            Assert.assertEquals(webloginpagelocator.LoginButton.getText(), "Login");
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    public void loginButtonClick() {

        try {
            webloginpagelocator.LoginButton.click();
            WebDriverHelper.implicitwait(7000);
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }



    }



    public void loginSuccessful()  {

        try {
            Assert.assertEquals("SAPERION Web Client", WebDriverHelper.driver.getTitle());

        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }


    }

    public void duplicateSession() {

        try{

            if(webloginpagelocator.YesButton.isDisplayed()){
                System.out.println("Duplicate Session Detected");
            }
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }

    }

    public void checkDuplicateSession(){
        try{

            if(webloginpagelocator.YesButton.isDisplayed()) {
                webloginpagelocator.YesButton.click();
            }
        }
        catch(NoSuchElementException e){

        }
    }

    public void clickUserProfile(){

        try{
            Thread.sleep(3000);
            WebDriverHelper.actionClick(webloginpagelocator.user);
        }
        catch(NoSuchElementException e){
            e.printStackTrace();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkWrongPasswordMessage(){
        try{
            Assert.assertTrue(webloginpagelocator.wrongPasswordError.isDisplayed());
        }
        catch(NoSuchElementException e){
            e.printStackTrace();
        }
    }

    public void checkLockedUserErrorMessage(){
        try{
            Thread.sleep(500);
            Assert.assertTrue(webloginpagelocator.lockUserErrorMessage.isDisplayed());
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void blankCredentials(){
        try{
            webloginpagelocator.UserName.clear();
            webloginpagelocator.UserName.sendKeys("Administrator");
        }
        catch(NoSuchElementException e){
            e.printStackTrace();
        }

    }

    public void checkBlankErrorMessage(){

        try{
            Assert.assertTrue(webloginpagelocator.Blankusernamepassword.isDisplayed());
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }





}
