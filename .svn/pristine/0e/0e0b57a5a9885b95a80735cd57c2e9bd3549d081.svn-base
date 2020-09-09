package pageaction;

import com.google.common.base.Function;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagelocators.WebLoginPageLocators;
import util.WebDriverHelper;



public class WebLoginPageActions {

    public WebLoginPageLocators webloginpagelocator;

    public void clientOpen() throws NoSuchElementException{

        webloginpagelocator=new WebLoginPageLocators();
        Assert.assertTrue(webloginpagelocator.WebClientText.isDisplayed());

    }

    public void enterCreds(String uid,String pwd) throws NoSuchElementException,InterruptedException{

        webloginpagelocator.UserName.clear();
        webloginpagelocator.UserName.sendKeys(uid);
        Thread.sleep(8000);
        webloginpagelocator.Password.sendKeys(pwd);
    }

    public void enterTenant(String tenant) throws NoSuchElementException,InterruptedException{
        webloginpagelocator.Tenant.sendKeys(tenant);
        Thread.sleep(8000);
    }

    public void selectUserRole(String type) throws NoSuchElementException{

        webloginpagelocator.UserType1.click();
        WebDriverHelper.implicitwait(3000);

        if(type.equalsIgnoreCase("index")){
            webloginpagelocator.Indexuser.click();
        }

        else{
            webloginpagelocator.QueryUser.click();
        }

        WebDriverHelper.implicitwait(5000);

    }

    public void loginButtonText() throws NoSuchElementException{

        Assert.assertEquals(webloginpagelocator.LoginButton.getText(),"Login");
    }

    public void loginButtonClick() throws NoSuchElementException,InterruptedException{

        webloginpagelocator.LoginButton.click();
        WebDriverHelper.implicitwait(7000);

    }

    public void loginSuccessful() throws NoSuchElementException, InterruptedException {
        Assert.assertEquals("SAPERION Web Client", WebDriverHelper.driver.getTitle());
        WebDriverHelper.takeScreenshot("LoginSuccessful");
    }

    public void duplicateSession() throws NoSuchElementException{


        if(webloginpagelocator.YesButton.isDisplayed()){
            System.out.println("Duplicate Session Detected");
        }

    }

    public void checkDuplicateSessionPopup() throws NoSuchElementException, InterruptedException {
        if(webloginpagelocator.YesButton.isDisplayed()) {
            webloginpagelocator.YesButton.click();
        }
        Thread.sleep(3000);
    }

    public void clickUserProfile() throws NoSuchElementException{

        webloginpagelocator.user.click();
    }

    public void checkUserTyeAccess(String user) throws NoSuchElementException, InterruptedException {
        webloginpagelocator.UserProfileButton.click();
        Thread.sleep(3000);

        if(user.equalsIgnoreCase("index")) {
            Assert.assertTrue(webloginpagelocator.Substitutefield.isDisplayed());
            System.out.println("Index User Login Successful");
        }
        else {
            WebDriverHelper.fluentWait(webloginpagelocator.Substitutefield);
            Function<WebDriver,Boolean> function = new Function<WebDriver, Boolean>() {
                public Boolean apply(WebDriver driver) {
                    boolean field =webloginpagelocator.Substitutefield.isDisplayed();
                    Assert.assertEquals(field,false);
                    return field;
                }
            };
        }
    }

    public void clickAdministratorButton(){

        WebDriverHelper.elementClick(webloginpagelocator.user);
    }

    public void checkLoginButtonClick(){
        try{
            webloginpagelocator.LogOutButton.click();
        }
        catch(NoSuchElementException e){
            e.printStackTrace();
        }
    }

    public void checkLogMessage() {
        try{
            webloginpagelocator.LogMessage.isDisplayed();

        }
        catch(NoSuchElementException e){
            e.printStackTrace();
        }
    }

    public void clickLogButton(){
        try{
            webloginpagelocator.logbutton.click();
        }
        catch(NoSuchElementException e){
            e.printStackTrace();
        }
    }



}
