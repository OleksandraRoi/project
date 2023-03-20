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

    @FindBy(xpath = "(//button[text()='Returns & Cancellations'])[1]")
    public WebElement chatReturnsCancellationsButton;
    @FindBy(xpath = "//*[normalize-space(.)='If you are not completely satisfied with your store or online purchase, simply return the merchandise to any Floor & Decor within 90 days of purchase with a valid sales receipt, and we will refund your purchase. If you do not have a receipt, a valid photo ID is required. Information from the ID will be recorded at the time of the return and retained in a company-wide database of customer return activity that we use to authorize returns and prevent fraud. We reserve the right to limit returns or exchanges without a valid receipt. Click here view our return policy.']")
    public WebElement chatReturnsCancellationsResponse;

    @FindBy(xpath = "(//button[text()='Design Consultation'])[1]")
    public WebElement chatDesignConsultationButton;
    @FindBy(xpath = "//*[normalize-space(.)='Our design experts can help you with this. You can click the button below to schedule a free design consultation.']")
    public WebElement chatDesignConsultationResponse;

    @FindBy(xpath = "(//button[text()='FAQs'])[1]")
    public WebElement chatFaQsButton;
    @FindBy(xpath = "//*[normalize-space(.)='What would you like to know about?']")
    public WebElement chatFaQsResponse;

}
