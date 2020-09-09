package pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.WebDriverHelper;

public class WebAnnotationPageLocators extends WebDriverHelper {

    public WebAnnotationPageLocators(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(how = How.XPATH, using = "//ul[contains(@id,'ToolbarItems')]/li[@data-button-id='vvAnnStickyNote']")
    public WebElement StickyNote;

    @FindBy(how = How.XPATH, using ="//ul[contains(@id,'vvUncategorizedAnnToolbarItems')]/li[@data-button-id='vvAnnHighlightRect']")
    public WebElement HighLightRect;

    @FindBy(how = How.XPATH, using ="/html/body/div[1]/div[2]/div/div/ul[2]/li[3]/a/span")
    public WebElement Arrow;

    @FindBy(how = How.XPATH, using = "//span[@data-title='Save Document']")
    public WebElement SaveButton;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'bottomFrame')]/div/form/input[1]")
    public WebElement CloseButton;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'bottomFrame')]/div/form/input[2]")
    public WebElement SaveAndCloseButton;


}
