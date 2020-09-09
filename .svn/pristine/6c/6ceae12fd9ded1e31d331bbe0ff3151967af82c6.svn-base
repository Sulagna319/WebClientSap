package pageaction;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pagelocators.WebViewerPageLocators;;
import util.LoggerHelper;
import util.WebDriverHelper;
import java.util.Iterator;
import java.util.Set;

public class WebViewerPageActions {

    public WebViewerPageLocators webViewerPageLocators;
    Logger log = LoggerHelper.getLogger(WebViewerPageActions.class);


    public void titleValidationViewer() {

        try {

            Thread.sleep(2000);
            Set<String> handler = WebDriverHelper.driver.getWindowHandles();
            Iterator<String> it = handler.iterator();
            String parentWindow = it.next();

            if (it.hasNext()) {

                String childWindow = it.next();
                WebDriverHelper.driver.switchTo().window(childWindow);
                Assert.assertEquals("Document view", WebDriverHelper.driver.getTitle());

            } else log.info("No view Tab");


        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sideRotation(String sideRotation) {

        webViewerPageLocators = new WebViewerPageLocators();
        String pageTitle = WebDriverHelper.driver.getTitle();
        log.info("The current page title is " + pageTitle);
        WebDriverHelper.driver.switchTo().frame("pdfjsFrame");

        if (sideRotation.equalsIgnoreCase("Right")) {

            try {
                Thread.sleep(2000);
                webViewerPageLocators.RotateRight.click();
                Thread.sleep(5000);
                log.info("Document rotated right!!");

            } catch (NoSuchElementException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (sideRotation.equalsIgnoreCase("Left")) {

            try {
                Thread.sleep(2000);
                log.info("Document rotated left!!");
                Thread.sleep(5000);
                webViewerPageLocators.RotateLeft.click();
            } catch (NoSuchElementException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


    public void closeViewer() throws InterruptedException {
        WebDriverHelper.driver.switchTo().defaultContent();

        try {
            webViewerPageLocators.CloseViewerButton.click();
            log.info("Closing the viewer tab!!");
            Thread.sleep(3000);
        } catch (NoSuchWindowException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public void clickPrint() {

        webViewerPageLocators = new WebViewerPageLocators();

        try {
            String pagetitle = WebDriverHelper.driver.getTitle();
            log.info("The current page title is " + pagetitle);
            WebDriverHelper.driver.switchTo().frame("pdfjsFrame");
            Thread.sleep(2000);
            webViewerPageLocators.ViewerPrint.click();
            Thread.sleep(5000);
            log.info("Print Document!!");

        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void zoomOptions(String zoom) {

        webViewerPageLocators = new WebViewerPageLocators();
        String pageTitle = WebDriverHelper.driver.getTitle();
        log.info("The current page title is " + pageTitle);
        WebDriverHelper.driver.switchTo().frame("pdfjsFrame");

        if (zoom.equalsIgnoreCase("Plus")) {

            try {
                Thread.sleep(2000);
                webViewerPageLocators.ZoomIn.click();
                webViewerPageLocators.ZoomIn.click();
                webViewerPageLocators.ZoomIn.click();
                Thread.sleep(5000);
                log.info("Document zoomed in!!");

            } catch (NoSuchElementException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (zoom.equalsIgnoreCase("Minus")) {

            try {
                Thread.sleep(2000);
                webViewerPageLocators.ZoomOut.click();
                webViewerPageLocators.ZoomOut.click();
                webViewerPageLocators.ZoomOut.click();
                Thread.sleep(5000);
                log.info("Document zoomed out!!");

            } catch (NoSuchElementException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (zoom.equalsIgnoreCase("RubberBand")) {

            try {
                Thread.sleep(2000);
                webViewerPageLocators.RubberbandZoom.click();
                Thread.sleep(2000);
                Actions a = new Actions(WebDriverHelper.driver);
                a.moveToElement(webViewerPageLocators.ZoomPageViewer).clickAndHold().moveByOffset(20, 70).release().build().perform();
                Thread.sleep(5000);
                log.info("RubberBand zoomed document!!");

            } catch (NoSuchElementException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (zoom.equalsIgnoreCase("MagnifingGlass")) {

            try {
                Thread.sleep(2000);
                webViewerPageLocators.MagnifyZoom.click();
                Thread.sleep(5000);
                log.info("Magnifing document!!");

            } catch (NoSuchElementException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else log.info("Wrong option selected!!");
    }

    public void dovViewOptions(String view) {

        webViewerPageLocators = new WebViewerPageLocators();
        String pageTitle = WebDriverHelper.driver.getTitle();
        log.info("The current page title is " + pageTitle);
        WebDriverHelper.driver.switchTo().frame("pdfjsFrame");

        if (view.equalsIgnoreCase("Fit To Window ")) {
            try {
                Thread.sleep(2000);
                webViewerPageLocators.FitToWindow.click();
                Thread.sleep(5000);
                log.info("Document Fitted To Window!!");

            } catch (NoSuchElementException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (view.equalsIgnoreCase("Fit To Height")) {

            try {
                Thread.sleep(2000);
                webViewerPageLocators.FitToHeight.click();
                Thread.sleep(5000);
                log.info("Document Fitted To Height!!");

            } catch (NoSuchElementException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (view.equalsIgnoreCase("Fit To Width")) {

            try {
                Thread.sleep(2000);
                webViewerPageLocators.FitToWidth.click();
                Thread.sleep(5000);
                log.info("Document Fitted To Width!!");

            } catch (NoSuchElementException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void printDialogueBox() {

        try {
            Thread.sleep(2000);
            boolean printBoxAppear = webViewerPageLocators.PrintBox.isDisplayed();
            if (printBoxAppear == true) {
                log.info("Print dialogue box appears!!");
                Thread.sleep(5000);
            }

        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void validatePrintingPage() {


    }


    public boolean alertPopUp() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(WebDriverHelper.driver, 2);
        boolean foundAlert = false;
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            foundAlert = true;
            WebDriverHelper.driver.switchTo().alert().accept();
            log.info("Leave viewer tab!!");
            Thread.sleep(3000);
        } catch (TimeoutException eTO) {
            foundAlert = false;
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
        return foundAlert;

    }

    public void applyAnnotation() {
        webViewerPageLocators = new WebViewerPageLocators();
        String pageTitle = WebDriverHelper.driver.getTitle();
        log.info("The current page title is " + pageTitle);
        WebDriverHelper.driver.switchTo().frame("pdfjsFrame");

        try {
            webViewerPageLocators.StickyNote.click();
            Thread.sleep(2000);
            Actions a = new Actions(WebDriverHelper.driver);
            a.moveToElement(webViewerPageLocators.ZoomPageViewer).clickAndHold().moveByOffset(50, 70).release().build().perform();
            Thread.sleep(2000);

            log.info(" Sticky note attached.");

        } catch (NoSuchElementException e) {
            e.getCause().printStackTrace();
        } catch (InterruptedException e) {
            e.getCause().printStackTrace();
        }


    }

    public void saveAnnotation() {

        try {

            webViewerPageLocators.StickyNoteText.clear();
            webViewerPageLocators.StickyNoteText.sendKeys("Hello from Saperion");
            Thread.sleep(5000);
            webViewerPageLocators.StickyNoteTextSave.click();
            Thread.sleep(5000);
            log.info(" Document saved with annotation change.");

        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickShowHideAnnotation() {
        webViewerPageLocators = new WebViewerPageLocators();
        String pageTitle = WebDriverHelper.driver.getTitle();
        log.info("The current page title is " + pageTitle);
        WebDriverHelper.driver.switchTo().frame("pdfjsFrame");

        try {

            webViewerPageLocators.ShowHideOption.click();
            Thread.sleep(5000);
            log.info("Show hide option clicked.");
            log.info("Annotation has been hiddden.");
            webViewerPageLocators.ShowHideOption.click();
            Thread.sleep(3000);
            log.info("Annotation is shown.");


        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void saveCloseDocViewer() {

        try {
            WebDriverHelper.driver.switchTo().defaultContent();
            webViewerPageLocators.SaveCloseViewerButton.click();
            log.info(" Document viewer saved and closed.");

            Thread.sleep(5000);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (NoSuchWindowException e) {
            e.printStackTrace();

        }
    }

    public void returnToParentWindow() {

        try {

            Thread.sleep(2000);
            Set<String> handler = WebDriverHelper.driver.getWindowHandles();
            Iterator<String> it = handler.iterator();
            String parentWindow = it.next();

            WebDriverHelper.driver.switchTo().window(parentWindow);
            Assert.assertEquals("SAPERION Web Client", WebDriverHelper.driver.getTitle());
            log.info(" Back to saperion homepage.");


        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void viewerPicControls(String picturecontrol) {

        webViewerPageLocators = new WebViewerPageLocators();
        String pageTitle = WebDriverHelper.driver.getTitle();
        log.info("The current page title is " + pageTitle);
        WebDriverHelper.driver.switchTo().frame("pdfjsFrame");

        if (picturecontrol.equalsIgnoreCase("Brightness")) {

            try {
                webViewerPageLocators.PictureControls.click();
                Actions a = new Actions(WebDriverHelper.driver);
                a.click(webViewerPageLocators.BrightnessSlider);
                a.dragAndDropBy(webViewerPageLocators.BrightnessSlider,30,50).release().build().perform();
                webViewerPageLocators.BrightnessSlider.click();
                Thread.sleep(10000);
                webViewerPageLocators.PictureControlsOkButton.click();
                log.info("Document Brightened!!");

            } catch (NoSuchElementException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (picturecontrol.equalsIgnoreCase("Contrast")) {

            try {
                webViewerPageLocators.PictureControls.click();
                Actions a = new Actions(WebDriverHelper.driver);
                a.click(webViewerPageLocators.ContrastSlider);
                a.dragAndDropBy(webViewerPageLocators.ContrastSlider,30,50).release().build().perform();
                webViewerPageLocators.ContrastSlider.click();
                Thread.sleep(10000);
                webViewerPageLocators.PictureControlsOkButton.click();
                log.info("Document Contrast is up!!");

            } catch (NoSuchElementException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (picturecontrol.equalsIgnoreCase("Gamma")) {

            try {
                webViewerPageLocators.PictureControls.click();
                Actions a = new Actions(WebDriverHelper.driver);
                a.click(webViewerPageLocators.GammaSlider);
                a.dragAndDropBy(webViewerPageLocators.GammaSlider,60,100).release().build().perform();
                webViewerPageLocators.GammaSlider.click();
                Thread.sleep(10000);
                webViewerPageLocators.PictureControlsOkButton.click();
                log.info("Document Gamma is up!!");

            } catch (NoSuchElementException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}






