package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MoreInfoBlogsPage;
import utils.Driver;
import utils.SeleniumUtils;

public class MoreInfoBlogsTests extends TestBase{

    @Test
    public void Blogs() {
        MoreInfoBlogsPage moreInfoBlogs = new MoreInfoBlogsPage();
        moreInfoBlogs.acceptCookies();
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getPopUpWindow(), 15);
        moreInfoBlogs.popUpWindowClick();
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getDecorativesSection(), 5);
        moreInfoBlogs.clickOnDecoratives();
        moreInfoBlogs.clickOnSideBar();
        moreInfoBlogs.scrollDown(moreInfoBlogs.getBlogsElement());
        moreInfoBlogs.blogsElementClick();
        SeleniumUtils.scroll(2000, 2000);
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getReadArticle(), 5);
        moreInfoBlogs.readArticleClick();
        SeleniumUtils.scroll(300, 300);
        moreInfoBlogs.viewAsArticleClcik();
        SeleniumUtils.scroll(2050, 2050);
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getBlackMarbleLink(), 5);
        moreInfoBlogs.blackMarbleLinkClick();
        moreInfoBlogs.clickOnSideBar();
        moreInfoBlogs.scrollDown(moreInfoBlogs.getCheckBoxBlack());
        SeleniumUtils.waitForVisibility(moreInfoBlogs.getCheckBoxBlack(), 5);
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains("Marble"));
        //assert moreInfoBlogs.getCheckBoxBlackIsSelected().isSelected();
        //moreInfoBlogs.checkBoxBlackIsSelected();
    }

    @Test
    public void Blogs2(){
        MoreInfoBlogsPage moreInfoBlogs = new MoreInfoBlogsPage();
        moreInfoBlogs.acceptCookies();
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getPopUpWindow(), 15);
        moreInfoBlogs.popUpWindowClick();
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getDecorativesSection(), 5);
        moreInfoBlogs.clickOnDecoratives();
        moreInfoBlogs.clickOnSideBar();
        moreInfoBlogs.scrollDown(moreInfoBlogs.getBlogsElement());
        moreInfoBlogs.blogsElementClick();
        SeleniumUtils.scroll(2400, 2400);
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getReadArticle2(), 5);
        moreInfoBlogs.readArticleClick2();
        SeleniumUtils.scroll(300, 300);
        moreInfoBlogs.viewAsArticleClcik();
        SeleniumUtils.scroll(1300, 1300);
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getLargeFormatTile(), 5);
        String text = moreInfoBlogs.getLargeFormatTile().getText();
        moreInfoBlogs.largeFormatTileClick();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(text));
        SeleniumUtils.scroll(100, 100);
        moreInfoBlogs.dropDownClick();
        moreInfoBlogs.priceLowToHighClick();
        SeleniumUtils.scroll(200, 200);
        Assert.assertEquals(moreInfoBlogs.price(), moreInfoBlogs.priceCopy());
    }
}
