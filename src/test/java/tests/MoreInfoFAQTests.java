package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MoreInfoFAQPage;
import utils.Driver;
import utils.SeleniumUtils;

public class MoreInfoFAQTests extends TestBase{

    @Test
    public void FAQs(){
        MoreInfoFAQPage moreInfoPage = new MoreInfoFAQPage();
        moreInfoPage.acceptCookies();
        SeleniumUtils.waitForClickablility(moreInfoPage.getPopUpWindow(), 15);
        moreInfoPage.popUpWindowClick();
        SeleniumUtils.waitForClickablility(moreInfoPage.getDecorativesSection(), 5);
        moreInfoPage.clickOnDecoratives();
        moreInfoPage.clickOnSideBar();
        moreInfoPage.scrollDown(moreInfoPage.getFAQsElement());
        moreInfoPage.FAQsClick();
        moreInfoPage.scrollDown(moreInfoPage.getToClickbleLink());
        moreInfoPage.orderStatusClick();
        SeleniumUtils.scroll(200, 200);
        moreInfoPage.orderStatusCheckClick();
        moreInfoPage.clickHereLink();
        SeleniumUtils.scroll(250, 250);
        moreInfoPage.phoneNumber();
        moreInfoPage.orderNumber();
        moreInfoPage.checkStatusButtonClick();
        SeleniumUtils.waitForVisibility(moreInfoPage.getOrderDetails(), 5);
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains("Sorry. Unable to find retrieve order details for this order."));
    }
}
