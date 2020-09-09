package util;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class WebDriverHelper {




    public static WebDriver driver;
    public static String driverPath = "src/Driver";
    private static String downloadPath = "D:\\New_WC_TestNG\\FileDownload\\";



    public static void launchBrowser() throws ClassNotFoundException{
        getBrowser("chrome");
        driver.manage().window().maximize();
        driver.get("http://localhost:9090/scr-webclient/ ");
    }

    public static void tearDown() throws Throwable{
        driver.quit();
    }

    public static void explicitwait(WebElement element) throws NoSuchElementException {

        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public static void implicitwait(int timeout) throws NoSuchElementException{
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }

    public static WebDriver getBrowser(String browsername) {


        if(browsername.equalsIgnoreCase("firefox")) {
            FirefoxProfile profile = new FirefoxProfile();
            profile.setAssumeUntrustedCertificateIssuer(false);
            profile.setPreference("network.proxy.type", 1);
            profile.setPreference("network.proxy.http", "localHost");
            profile.setPreference("newtwork.proxy.http_port", 3128);

            //Download setting
            profile.setPreference("browser.download.folderlist", 2);
            profile.setPreference("browser.helperapps.neverAsk.saveToDisk", "text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
            profile.setPreference("browser.download.dir", downloadPath);
            System.setProperty("webdriver.gecko.driver", driverPath + File.separator + "geckodriver.exe");
            return driver = new FirefoxDriver();

        }
        else if(browsername.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", driverPath + File.separator + "chromedriver.exe");
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("profile.default_content_settings.popups", 0);
            chromePrefs.put("download.default_directory", downloadPath);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", chromePrefs);
            DesiredCapabilities cap = DesiredCapabilities.chrome();
            cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            cap.setCapability(ChromeOptions.CAPABILITY, options);
            return driver = new ChromeDriver(cap);
        }

        else if (browsername.equalsIgnoreCase("IE")){
            System.setProperty("webdriver.ie.driver", driverPath + File.separator + "IEDriverServer.exe");
            return driver = new InternetExplorerDriver();
        }
        else{
            File file=new File("src/Driver/phantomjs.exe");
            System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
            DesiredCapabilities caps = new DesiredCapabilities().phantomjs();
            return driver=new PhantomJSDriver(caps);

        }


    }

    public static void takeScreenshot(String tcName) throws InterruptedException {
        Thread.sleep(1000);
        Random random = new Random();
        File file = new File("Screenshot" +File.separator+ tcName);
        if (!file.exists()) {
            file.mkdir();
        }
        if (file != null) {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(scrFile,
                        new File(file + File.separator + tcName + random.nextInt() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void uploadFile(String filename) throws AWTException, InterruptedException{
        // Specify the file location with extension
        StringSelection sel = new StringSelection(filename);
        // Copy to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
        System.out.println("selection" +sel);
        // Create object of Robot class
        Robot robot = new Robot();
        Thread.sleep(1000);
        // Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        // Release Enter
        robot.keyRelease(KeyEvent.VK_ENTER);
        // Press CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        // Release CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);
        //Press Enter 
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void actionClick(WebElement element) {
        Actions action=new Actions(driver);
        action.moveToElement(element).click().build().perform();

    }

    public static void contextClick(WebElement element){
        Actions actions=new Actions(driver);
        actions.contextClick(element).perform();
    }

    public static void fluentWait(WebElement element){

        Wait<WebDriver> wait = new FluentWait<WebDriver>(WebDriverHelper.driver)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(2, TimeUnit.SECONDS)
                .ignoring(java.util.NoSuchElementException.class);


      /*  final element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement ele1=element;
                if(element==null){
                    // Assert.assertFalse(element.isDisplayed());
                    System.out.println("123");
                    return element;
                }
                else {
                    return null;
                }

            }
        });*/

    }




}
