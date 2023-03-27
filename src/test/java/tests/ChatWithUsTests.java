package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Driver;

import static utils.SeleniumUtils.*;

public class ChatWithUsTests extends TestBase {
    private final HomePage homePage = HomePage.getHomePage();

    @Test
    public void orderStatusResponse() {
        waitFor(5);
//        click(Driver.getDriver().findElement(B));
        click(homePage.acceptAllCookiesButton,  15);
        click(homePage.chatWithUsButton, 15);
        switchToIframe(homePage.chatFrame);
        click(homePage.chatOrderStatusButton, 15);
        waitForVisibility(homePage.chatOrderStatusResponse, 15);
    }
    @Test
    public void returnsCancellationsResponse() {
        waitFor(5);
        click(homePage.acceptAllCookiesButton, 15);
        click(homePage.chatWithUsButton, 15);
        switchToIframe(new HomePage().chatFrame);
        click(homePage.chatReturnsCancellationsButton, 15);
        waitForVisibility(homePage.chatReturnsCancellationsResponse, 15);
    }
    @Test
    public void designConsultationResponse() {
        waitFor(5);
        click(homePage.acceptAllCookiesButton, 15);
        click(homePage.chatWithUsButton, 15);
        switchToIframe(homePage.chatFrame);
        click(homePage.chatDesignConsultationButton, 15);
        waitForVisibility(homePage.chatDesignConsultationResponse, 15);
    }
    @Test
    public void fAqResponse() {
        waitFor(5);
        click(homePage.acceptAllCookiesButton, 15);
        click(homePage.chatWithUsButton, 15);
        switchToIframe(homePage.chatFrame);
        click(homePage.chatFaQsButton, 15);
        waitForVisibility(homePage.chatFaQsResponse, 15);
    }

}