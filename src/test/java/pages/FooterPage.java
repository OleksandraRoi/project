package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.Driver;
import utils.SeleniumUtils;

import javax.swing.text.Utilities;
import java.util.List;

public class FooterPage {
    public FooterPage(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath = "(//a[@class=\"b-footer_accordeon-link\"])[1]")
    protected WebElement FirstLink;
    @FindBy(xpath = "(//a[@class=\"b-footer_accordeon-link\"])[2]")
    protected WebElement SecondLink;
    @FindBy(xpath = "(//a[@class=\"b-footer_accordeon-link\"])[3]")
    protected WebElement ThirdLink;
    @FindBy(xpath = "(//a[@class=\"b-footer_accordeon-link\"])[4]")
    protected WebElement FourthLink;
    @FindBy(xpath = "(//a[@class=\"b-footer_accordeon-link\"])[5]")
    protected WebElement FifthLink;
    public void clickOnLinks(WebElement nameOfLink){
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.getMessage();
        }
        nameOfLink.click();
    }
    public WebElement getFirstLink() {
        return FirstLink;
    }

    public WebElement getSecondLink() {
        return SecondLink;
    }

    public WebElement getThirdLink() {
        return ThirdLink;
    }

    public WebElement getFourthLink() {
        return FourthLink;
    }

    public WebElement getFifthLink() {
        return FifthLink;
    }
}


