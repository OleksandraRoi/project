package pages;

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
    public WebElement getPopUpWindow() {return popUpWindow;}

    public void clickOnCookies() {
        SeleniumUtils.waitForClickablility(cookies,10);
        cookies.click();
    }
    public void popUpWindowClick(){
        SeleniumUtils.waitForClickablility(getPopUpWindow(),15);
        popUpWindow.click();}
}
