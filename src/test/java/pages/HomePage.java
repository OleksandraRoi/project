package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;
import utils.Driver;

public class HomePage {

    private static HomePage homePage;

    public static HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptAllCookiesButton;
    @FindBy(id = "chat-button")
    public WebElement chatWithUsButton;
    @FindBy(id = "insync-iframe")
    public WebElement chatFrame;
    @FindBy(xpath = "(//button[text()='Order Status'])[1]")
    public WebElement chatOrderStatusButton;
    @FindBy(xpath = "//*[normalize-space(.)='I can help you with that. Do you have your Order Number and Phone Number associated with this order that you are enquiring about?']")
    public WebElement chatOrderStatusResponse;

//    public void something(){
//        acceptAllCookiesButton.click();
// }

}
