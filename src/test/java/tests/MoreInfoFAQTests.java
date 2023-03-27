package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MoreInfoFAQPage;
import utils.Driver;
import utils.SeleniumUtils;

public class MoreInfoFAQTests extends TestBase{

    @Test(groups = {"regression"})
    public void FAQs(){
        logger.info("Navigating to 'Floor & Decor' Home Page");
        MoreInfoFAQPage moreInfoPage = new MoreInfoFAQPage();
        logger.info("Accept cookies");
        moreInfoPage.acceptCookies();
        SeleniumUtils.waitForClickablility(moreInfoPage.getPopUpWindow(), 15);
        logger.info("Close pop up window");
        moreInfoPage.popUpWindowClick();
        SeleniumUtils.waitForClickablility(moreInfoPage.getDecorativesSection(), 5);
        logger.info("Navigate to Decoratives section");
        moreInfoPage.clickOnDecoratives();
        moreInfoPage.clickOnSideBar();
        moreInfoPage.scrollDown(moreInfoPage.getFAQsElement());
        logger.info("Navigate to FAQs");
        moreInfoPage.FAQsClick();
        moreInfoPage.scrollDown(moreInfoPage.getToClickbleLink());
        logger.info("Select Order Status option");
        moreInfoPage.orderStatusClick();
        SeleniumUtils.scroll(200, 200);
        logger.info("Navigate to order status check");
        moreInfoPage.orderStatusCheckClick();
        moreInfoPage.clickHereLink();
        SeleniumUtils.scroll(250, 250);
        logger.info("Enter phone number");
        moreInfoPage.phoneNumber();
        logger.info("Enter order number");
        moreInfoPage.orderNumber();
        logger.info("Click on status button");
        moreInfoPage.checkStatusButtonClick();
        SeleniumUtils.waitForVisibility(moreInfoPage.getOrderDetails(), 5);
        String pageSource = Driver.getDriver().getPageSource();
        logger.info("Get the message");
        Assert.assertTrue(pageSource.contains("Sorry. Unable to find retrieve order details for this order."));
    }
}
