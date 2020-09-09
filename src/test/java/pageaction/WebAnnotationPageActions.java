package pageaction;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pagelocators.WebAnnotationPageLocators;
import util.WebDriverHelper;

import java.util.ArrayList;
import java.util.List;


public class WebAnnotationPageActions {

    public WebAnnotationPageLocators webAnnotationPageLocators;



    public void titleValidation(){

        try{

            webAnnotationPageLocators=new WebAnnotationPageLocators();
            Thread.sleep(2000);
            String parentwindow=WebDriverHelper.driver.getWindowHandle();//no value of declaring
            ArrayList<String> list=new ArrayList<String>(WebDriverHelper.driver.getWindowHandles());

            if(list.size()>1){
                WebDriverHelper.driver.switchTo().window(list.get(1));
                Assert.assertEquals("Document view",WebDriverHelper.driver.getTitle());


            }

        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void annotationButtonDisplayed(String str) {

        boolean button=false;
        List<WebElement> list = WebDriverHelper.driver.findElements(By.tagName("iframe"));
        System.out.println("no of iframe" + list.size());
        WebDriverHelper.driver.switchTo().frame("pdfjsFrame");
        WebElement Arrow= WebDriverHelper.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul[2]/li[3]/a/span"));
        WebElement stickyNote=WebDriverHelper.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul[2]/li[1]/a/span"));
        WebElement highlight=WebDriverHelper.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul[2]/li[2]/a/span"));
        if(str.equalsIgnoreCase("Arrow")){
            try {

                button = Arrow.isDisplayed() ;
                Assert.assertTrue(button);
            }
            catch(NoSuchElementException e){
                e.printStackTrace();
            }
        }
        else if(str.equalsIgnoreCase("StickyNote")) {
            try {

                button = stickyNote.isDisplayed() ;

            }
            catch(NoSuchElementException e){
                e.printStackTrace();
            }
        }
        else if(str.equalsIgnoreCase("highlight")){
            try {

                button = highlight.isDisplayed() ;

            }
            catch(NoSuchElementException e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("No Such Button present");
        }
        Assert.assertTrue(button);
        WebDriverHelper.driver.switchTo().defaultContent();

    }

    public void clickCloseButton(){

        try{
            webAnnotationPageLocators.CloseButton.click();
            Thread.sleep(1000);
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }


}
