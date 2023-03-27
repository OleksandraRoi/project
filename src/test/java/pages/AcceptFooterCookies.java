package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

public class AcceptFooterCookies {
    public AcceptFooterCookies(){
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(id = "onetrust-accept-btn-handler")
    protected WebElement cookies;

    @FindBy(xpath = "//button[@class='tingle-modal__close']")
    private WebElement popUpWindow;

    public void clickOnCookies() {
        cookies.click();
    }
    public void popUpWindowClose(){
        SeleniumUtils.waitForClickablility(popUpWindow,15);
        popUpWindow.click();
    }
}
