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
//        SeleniumUtils.waitForClickablility(moreInfoBlogs.getPopUpWindow(), 15);
//        moreInfoBlogs.popUpWindowClick();
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getDecorativesSection(), 5);
        moreInfoBlogs.clickOnDecoratives();
        moreInfoBlogs.clickOnSideBar();
        moreInfoBlogs.scrollDown(moreInfoBlogs.getBlogsElement());
        moreInfoBlogs.blogsElementClick();
        SeleniumUtils.scroll(2000, 2000);
        SeleniumUtils.waitForClickablility(moreInfoBlogs.getMarbleBathroom(), 5);
        moreInfoBlogs.marbleBathroomClick();
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
        assert moreInfoBlogs.getCheckBoxBlackIsSelected().isSelected();
        //moreInfoBlogs.checkBoxBlackIsSelected();




    }
}
