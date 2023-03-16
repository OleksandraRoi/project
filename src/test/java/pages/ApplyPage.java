package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;
import utils.Driver;

public class ApplyPage{

    public ApplyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//a[@href='https://careers.flooranddecor.com/home']")
    private WebElement applyButton;



    public void clickApplyButton (){
        applyButton.click();
    }
    public String urlActual(){
        return Driver.getDriver().getCurrentUrl();
    }

}
