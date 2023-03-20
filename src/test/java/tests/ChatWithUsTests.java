package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;

import static utils.SeleniumUtils.*;

public class ChatWithUsTests extends TestBase {
    private final HomePage homePage = HomePage.getHomePage();

    @Test
    public void orderStatusResponse() {
        waitFor(5);
        click(homePage.acceptAllCookiesButton, 15);
        click(homePage.chatWithUsButton, 15);
        switchToIframe(homePage.chatFrame);
        click(homePage.chatOrderStatusButton, 15);
        waitForVisibility(homePage.chatOrderStatusResponse, 15);
    }
    }
