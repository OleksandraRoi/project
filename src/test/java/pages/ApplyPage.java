package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.TestBase;
import utils.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ApplyPage{

    public ApplyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//a[@href='https://careers.flooranddecor.com/home']")
    private WebElement applyButton;
    @FindBy(id="consent_reject")
    private WebElement alertReject;
    @FindBy(id="close_exit_call_to_action")
    private WebElement secondPopUpClose;
    @FindBy(id="near_me_button_1_0")
    private WebElement jobsNearMeButton;
    @FindBy(xpath = "//section[@aria-label='Filter jobs']//li[@data-filter='city']//label[@id='label_city_1_0_4']")
    private WebElement sortJobsCityCheckbox;
    @FindBy(id="label_city_1_0_4")
    private WebElement cityID;
    @FindBy(xpath = "//p[b]")
    private WebElement jobsNumberText;
    @FindBy(xpath = "//h3[@class='job-title']")
    private WebElement jobTitle;
    @FindBy(xpath = "//li[@class='nav-item'][2]")
    private WebElement linkBenefits;
    @FindBy(id="page_block_0_0")
    private WebElement benefitsText;

    public void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }
    public void clickApplyButton (){
        applyButton.click();
    }
    public String urlActual(){
        return Driver.getDriver().getCurrentUrl();
    }
    public void alert(){ alertReject.click(); }
    public void nearMeButton(){ jobsNearMeButton.click(); }

    public void scrollDownToCity(){
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0, 1460)");
    }
    public void cityClick(){
        sortJobsCityCheckbox.click();
    }
//    public void cityClick2(){
//        String windowHandel = Driver.getDriver().getWindowHandle();
//        Set<String> allWindowHandle = Driver.getDriver().getWindowHandles();
//
//        for(String windows : allWindowHandle){
//            Driver.getDriver().switchTo().window(windows);
//
//            List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//li[@data-value='arlington'"));
//          if(elements.size()>0){
//              elements.get(0).click();
//          }
//        }
//    }
    public void cityCheckbox(){
        WebElement field = Driver.getDriver().findElement(By.cssSelector("fieldset"));
        WebElement elementToClick = field.findElement(By.id("label_city_1_0_4"));
        elementToClick.click();
    }

    public String jobsCount(){
        List<WebElement> jobs = Driver.getDriver().findElements(By.xpath("//tr[@data-action='click->jobs--table-results#navigate']"));
        int count = jobs.size();
        String countInText = String.valueOf(count);
        return countInText;
    }
    public String numberOfJobs(){
        String text = jobsNumberText.getText();
        return text; }

    public String title(){
        return jobTitle.getText();
    }
    public String pageTitle(){
        return Driver.getDriver().getCurrentUrl();
    }
    public void benefits(){ linkBenefits.click(); }
    public String benefitsContain(){ return benefitsText.getText(); }



}
