package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class AcceptFooterCookies {
    public AcceptFooterCookies(){
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(id = "onetrust-accept-btn-handler")
    protected WebElement cookies;

    public void clickOnCookies() {
        cookies.click();
    }
}
