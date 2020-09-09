package pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.WebDriverHelper;

public class WebViewerPageLocators extends WebDriverHelper {

    public WebViewerPageLocators(){
        PageFactory.initElements(driver,this);
    }

    //sulagna
    @FindBy(how = How.XPATH, using = "//span[@data-title='Rotate Right']")
    public WebElement RotateRight;

    @FindBy(how = How.XPATH, using = "//span[@data-title='Rotate Left']")
    public WebElement RotateLeft;

    @FindBy(how = How.XPATH, using = "//span[@data-title='Zoom In']")
    public WebElement ZoomIn;

    @FindBy(how = How.XPATH, using = "//span[@data-title='Zoom Out']")
    public WebElement ZoomOut;

    @FindBy(how = How.XPATH, using = "//span[@data-title='Rubberband Zoom']")
    public WebElement RubberbandZoom;

    @FindBy(how = How.XPATH, using = "//span[@data-title='Magnifier']")
    public WebElement MagnifyZoom;

    @FindBy(how = How.XPATH, using = "//span[@data-title='Print']")
    public WebElement ViewerPrint;

    @FindBy(how = How.CLASS_NAME, using = "action-button")
    public WebElement Printing;

    @FindBy(how = How.CLASS_NAME, using = "preview-area-plugin")
    public WebElement previewIframe;

    @FindBy(how = How.XPATH, using = "//cr-button[@class='cancel-button']")
    public WebElement PrintingCancel;

    @FindBy(how = How.XPATH, using = "//button[text()='Print']")
    public WebElement PrintBox;

    @FindBy(how = How.ID, using = "vvDummyScroller")
    public WebElement ZoomPageViewer;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div/form/input")
    public WebElement CloseViewerButton;

    @FindBy(how = How.XPATH, using = "//span[@data-title='Fit to Window']")
    public WebElement FitToWindow;

    @FindBy(how = How.XPATH, using = "//span[@data-title='Fit to Height']")
    public WebElement FitToHeight;

    @FindBy(how = How.XPATH, using = "//span[@data-title='Fit to Width']")
    public WebElement FitToWidth;

    @FindBy(how = How.XPATH, using = "//span[@data-title='Picture Controls']")
    public WebElement PictureControls;

    @FindBy(how = How.XPATH, using = "//div[@id='vvBrightness']/div/div[1]/div[4]")
    public WebElement BrightnessSlider;

    @FindBy(how = How.XPATH, using = "//div[@id='vvContrast']/div/div[1]/div[4]")
    public WebElement ContrastSlider;

    @FindBy(how = How.XPATH, using = "//div[@id='vvGamma']/div/div[1]/div[4]")
    public WebElement GammaSlider;


    @FindBy(how = How.ID, using ="vvPictureControlsDialogOKButton")
    public WebElement PictureControlsOkButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/ul[2]/li[1]/a/span")
    public WebElement StickyNote;

    @FindBy(how = How.ID, using = "vvAnnPopUpEditTextArea")
    public WebElement StickyNoteText;

    @FindBy(how = How.ID, using = "vvAnnPopUpEditTextSaveBtn")
    public WebElement StickyNoteTextSave;

    @FindBy(how = How.XPATH, using = "//input[@value='Save and Close']")
    public WebElement SaveCloseViewerButton;


    @FindBy(how = How.XPATH, using = "//div[@data-title='Show or hide text annotations']")
    public WebElement ShowHideOption;

}
