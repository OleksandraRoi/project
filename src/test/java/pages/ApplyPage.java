package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import tests.TestBase;
import utils.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ApplyPage{

    public ApplyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
// c6d42b93d2938f4dc6d98255692abcc1

    @FindBy(xpath="//a[@href='https://careers.flooranddecor.com/home']")
    private WebElement applyButton;
    @FindBy(id="consent_reject")
    private WebElement alertReject;
    @FindBy(id="close_exit_call_to_action")
    private WebElement secondPopUpClose;
    @FindBy(id="near_me_button_1_0")
    private WebElement jobsNearMeButton;
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
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0, 1450)");
    }
    public void cityClick() throws InterruptedException {
        List<WebElement> citys = Driver.getDriver().findElements(By.name("cities[]"));
        for (WebElement city : citys) {
            if (city.getText().equals("Arlington")) ;
            sleep();
            city.click();
        }
    }

    public void cityOverlapping(){
        // Locate the element
        WebElement element = Driver.getDriver().findElement(By.id("label_city_1_0_4"));

// Get the location and size of the element
        Point location = element.getLocation();
        Dimension size = element.getSize();

// Check if there are any overlapping elements
        List<WebElement> overlappingElements = Driver.getDriver().findElements(By.cssSelector("*:hover"));

        if (!overlappingElements.isEmpty()) {
            // There are overlapping elements
            WebElement parentElement = overlappingElements.get(overlappingElements.size() - 1);
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(parentElement).build().perform();
        }
        element.click();
    }
    public String jobsCount(){
        List<WebElement> jobs = Driver.getDriver().findElements(By.xpath("//tr[@data-action='click->jobs--table-results#navigate']"));
        int count = jobs.size();
        String countInText = String.valueOf(count);
        System.out.println(countInText);
        return countInText;
    }
    public String numberOfJobs(){
        String text = jobsNumberText.getText();
        System.out.println(text);
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
