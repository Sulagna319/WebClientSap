package pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.WebDriverHelper;

public class WebHomePageLocators extends WebDriverHelper {

    public WebHomePageLocators(){
        PageFactory.initElements(driver,this
        );
    }

    @FindBy(how= How.XPATH,using = "//span[contains(.,'SeleniumTest')]")
    public WebElement application;

    @FindBy(how= How.XPATH,using = "//span[contains(.,'Upload new document')]")
    public WebElement UploadNewDocument;

    @FindBy(how= How.XPATH,using = "//button[contains(.,'Result')]")
    public WebElement Resultbutton;

    @FindBy(how= How.XPATH,using = "//tr[9]/td/input")
    public WebElement IndexID;

    @FindBy(how= How.XPATH,using = "//tr[13]/td/input")
    public WebElement IndexName;

    @FindBy(how=How.XPATH,using="//td/div[@class='toolbar-icon z-div']")
    public WebElement saperionLogo;

    @FindBy(how=How.XPATH,using ="//*[@class='z-south-header']")
    public WebElement FastAccess;

    @FindBy(how=How.XPATH,using ="//td/span[contains(.,'Workspace')]")
    public WebElement Workspace;

    @FindBy(how=How.XPATH,using ="//td/span[contains(.,'Tasks')]")
    public WebElement Tasks;

    @FindBy(how=How.XPATH,using ="//td/span[contains(.,'Personal Folders')]")
    public WebElement PersonalFolders;

    @FindBy(how=How.XPATH,using ="//td/span[contains(.,'Personal Files')]")
    public WebElement PersonalFiles;

    @FindBy(how=How.XPATH,using ="//td/span[contains(.,'Favorites')]")
    public WebElement Favorites;

    @FindBy(how=How.XPATH,using ="//button[contains(.,'OK')]")
    public WebElement okButton;

    @FindBy(how=How.XPATH,using ="//div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/table/tbody/tr/td/table/tbody/tr[9]/td/input")
    public WebElement indexingid;

    @FindBy(how=How.XPATH,using ="//div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/table/tbody/tr/td/table/tbody/tr[11]/td/input")
    public WebElement indexingname;

    @FindBy(how=How.XPATH,using ="//div/div[contains(@class,'z-window-header z-window-header-move')]")
    public WebElement uploadwindowtext;

    @FindBy(how=How.XPATH,using ="//div[contains(text(),'1')]")
    public WebElement docid;

    @FindBy(how=How.XPATH,using ="//div[contains(text(),'doc')]")
    public WebElement docname;

    @FindBy(how=How.XPATH,using ="//div[contains(text(),'image')]")
    public WebElement image;

    @FindBy(how=How.XPATH,using="//a[contains(.,'BMP.bmp')]")
    public WebElement BmpImage;

    @FindBy(how=How.XPATH,using="//a[contains(.,'file.docx')]")
    public WebElement docx;

    @FindBy(how=How.XPATH,using="//a[contains(.,'file.doc')]")
    public WebElement doc;

    @FindBy(how=How.XPATH,using="//a[contains(.,'file.pdf')]")
    public WebElement pdf;

    @FindBy(how=How.XPATH,using="//a[contains(.,'file.ppt')]")
    public WebElement ppt;

    @FindBy(how=How.XPATH,using = "//button[@title='User profile']")
    public WebElement UserProfileButton;

    @FindBy(how=How.XPATH,using = "//button[@title='Open log window']")
    public WebElement OpenLogWindowButton;

    @FindBy(how=How.XPATH,using = "//button[@title='Help']")
    public WebElement HelpButton;

    @FindBy(how=How.XPATH,using = "//button[@title='Log Out']")
    public WebElement LogOutButton;

    @FindBy(how=How.XPATH,using="//div/span[contains(.,'Please wait while your image is loaded')]")
    public WebElement NotLoadingText;

    @FindBy(how=How.XPATH,using="//div/span[(text()='Substitute')]")
    public WebElement SubstituteText;

    @FindBy(how=How.XPATH,using="//div[(text()='Logged on as administrator.')]")
    public WebElement LoggingText;

    @FindBy(how=How.XPATH,using="//div[text()='pdf']")
    public WebElement ResultlistBmp;

    @FindBy(how=How.XPATH,using="//span[text()='Edit annotations']")
    public WebElement EditAnnotationsButton;

    //sulagna
    @FindBy(how=How.XPATH,using="//span[@class='z-menuitem-text'][text()='View']")
    public WebElement View;


















}
