package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

import java.util.List;

public class FooterPage {
    public FooterPage(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath = "(//a[@class=\"b-footer_accordeon-link\"])[1]")
    protected static WebElement FirstLink;
    @FindBy(xpath = "(//a[@class=\"b-footer_accordeon-link\"])[2]")
    protected static WebElement SecondLink;
    @FindBy(xpath = "(//a[@class=\"b-footer_accordeon-link\"])[3]")
    protected static WebElement ThirdLink;
    @FindBy(xpath = "(//a[@class=\"b-footer_accordeon-link\"])[4]")
    protected static WebElement FourthLink;
    @FindBy(xpath = "(//a[@class=\"b-footer_accordeon-link\"])[5]")
    protected static WebElement FifthLink;
    public void clickOnLinks(WebElement nameOfLink){
            Driver.getDriver().findElement(By.linkText(nameOfLink.getText())).click();
            switchWindow(nameOfLink.getText());
            SeleniumUtils.waitForTitleContains(Driver.getDriver().getTitle(),5);
        }
    public void switchWindow(String newTitle){
        String currentPage = Driver.getDriver().getWindowHandle();
        for (String oneHandle:Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(oneHandle);
            if(oneHandle.contains(newTitle)){
                return;
            }
        }
        Driver.getDriver().switchTo().window(currentPage);
    }

    public static WebElement getFirstLink() {
        return FirstLink;
    }

    public static WebElement getSecondLink() {
        return SecondLink;
    }

    public static WebElement getThirdLink() {
        return ThirdLink;
    }

    public static WebElement getFourthLink() {
        return FourthLink;
    }

    public static WebElement getFifthLink() {
        return FifthLink;
    }
}


