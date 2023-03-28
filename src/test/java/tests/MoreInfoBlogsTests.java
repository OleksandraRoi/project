package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MoreInfoBlogsPage;
import utils.Driver;
import utils.SeleniumUtils;

public class MoreInfoBlogsTests extends TestBase{

    @Test(groups = {"regression"})
    public void Blogs() {
        logger.info("Navigating to 'Floor & Decor' Home Page");
        MoreInfoBlogsPage moreInfoBlogs = new MoreInfoBlogsPage();
        logger.info("Accept cookies");
        moreInfoBlogs.acceptCookies();
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getPopUpWindow(), 15);
        logger.info("Close pop up window");
        moreInfoBlogs.popUpWindowClick();
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getDecorativesSection(), 5);
        logger.info("Navigate to Decoratives section");
        moreInfoBlogs.clickOnDecoratives();
        moreInfoBlogs.clickOnSideBar();
        moreInfoBlogs.scrollDown(moreInfoBlogs.getBlogsElement());
        logger.info("Navigate to Blogs");
        moreInfoBlogs.blogsElementClick();
        SeleniumUtils.scroll(2000, 2000);
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getReadArticle(), 5);
        logger.info("Read Article");
        moreInfoBlogs.readArticleClick();
        SeleniumUtils.scroll(300, 300);
        logger.info("View as article");
        moreInfoBlogs.viewAsArticleClcik();
        SeleniumUtils.scroll(2050, 2050);
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getBlackMarbleLink(), 5);
        logger.info("Click on Black Marble link");
        moreInfoBlogs.blackMarbleLinkClick();
        moreInfoBlogs.clickOnSideBar();
        moreInfoBlogs.scrollDown(moreInfoBlogs.getCheckBoxBlack());
        SeleniumUtils.waitForVisibility(moreInfoBlogs.getCheckBoxBlack(), 5);
        String pageSource = Driver.getDriver().getPageSource();
        logger.info("Check if page contains 'Marble'");
        Assert.assertTrue(pageSource.contains("Marble"));
        logger.info("Check if 'Black' check box is selected");
        Assert.assertTrue(moreInfoBlogs.getCheckBoxBlack().isSelected());
    }

    @Test(groups = {"regression"})
    public void Blogs2(){
        logger.info("Navigating to 'Floor & Decor' Home Page");
        MoreInfoBlogsPage moreInfoBlogs = new MoreInfoBlogsPage();
        logger.info("Accept cookies");
        moreInfoBlogs.acceptCookies();
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getPopUpWindow(), 15);
        logger.info("Close pop up window");
        moreInfoBlogs.popUpWindowClick();
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getDecorativesSection(), 5);
        logger.info("Navigate to Decoratives section");
        moreInfoBlogs.clickOnDecoratives();
        moreInfoBlogs.clickOnSideBar();
        moreInfoBlogs.scrollDown(moreInfoBlogs.getBlogsElement());
        logger.info("Navigate to Blogs");
        moreInfoBlogs.blogsElementClick();
        SeleniumUtils.scroll(2400, 2400);
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getReadArticle2(), 5);
        logger.info("Read Article");
        moreInfoBlogs.readArticleClick2();
        SeleniumUtils.scroll(300, 300);
        logger.info("View as article");
        moreInfoBlogs.viewAsArticleClcik();
        SeleniumUtils.scroll(1300, 1300);
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getLargeFormatTile(), 5);
        String text = moreInfoBlogs.getLargeFormatTile().getText();
        logger.info("Select 'Large Format Tile'");
        moreInfoBlogs.largeFormatTileClick();
        String pageSource = Driver.getDriver().getPageSource();
        logger.info("Check is page contains 'Large Format Tile'");
        Assert.assertTrue(pageSource.contains(text));
        SeleniumUtils.scroll(100, 100);
        logger.info("In drop down bar filter by 'Price Low To High'");
        moreInfoBlogs.dropDownClick();
        moreInfoBlogs.priceLowToHighClick();
        SeleniumUtils.scroll(200, 200);
        logger.info("Check if it filtered prices correctly");
        Assert.assertEquals(moreInfoBlogs.price(), moreInfoBlogs.priceCopy());
    }
}
