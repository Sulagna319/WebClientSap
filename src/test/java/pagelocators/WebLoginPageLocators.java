package pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.WebDriverHelper;

public class WebLoginPageLocators extends WebDriverHelper {

    public WebLoginPageLocators() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "hHYR4")
    public WebElement SaperionText;

    @FindBy(how = How.XPATH, using ="//*[starts-with(text(),'Web Client')]")
    public WebElement WebClientText;

    @FindBy(how = How.CSS, using ="input[placeholder=Name]")
    public WebElement UserName;

    @FindBy(how = How.CSS, using = "input[placeholder=Password]")
    public WebElement Password;

    @FindBy(how = How.CSS, using = "input[placeholder=Client]")
    public WebElement Tenant;

    @FindBy(how = How.CSS, using = "input[placeholder=User Type]")
    public WebElement UserType;

    @FindBy(how = How.ID, using = "hHYRg")
    public WebElement LanguageSelection;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'Login')]")
    public WebElement LoginButton;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'Yes')]")
    public WebElement YesButton;

    @FindBy(how=How.XPATH,using="//tr[4]/td/div/span/a[contains(@class,'z-combobox-button')]")
    public WebElement UserType1;

    @FindBy(how=How.XPATH,using="//li/span[2][contains(text(),'Index')]")
    public WebElement Indexuser;

    @FindBy(how=How.XPATH,using="//li/span[2][contains(text(),'Query')]")
    public WebElement QueryUser;

    @FindBy(how=How.XPATH,using="//span[@title='Administrator']")
    public WebElement user;

    @FindBy(how=How.XPATH,using="//span[contains(text(),'Login failed. Please check the entered information.')]")
    public WebElement wrongPasswordError;

    @FindBy(how=How.XPATH,using ="//span[@class='z-label']")
    public WebElement lockUserErrorMessage;

    @FindBy(how=How.XPATH,using ="//div/span[contains(.,'Please enter a user name and a password!')]")
    public WebElement Blankusernamepassword;

}
