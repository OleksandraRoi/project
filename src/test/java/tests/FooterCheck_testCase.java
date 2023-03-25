package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FooterPage;
import utils.Driver;
import utils.SeleniumUtils;

import javax.swing.text.Utilities;

public class FooterCheck_testCase extends TestBase{
    @Test
    public void test1(){
//        SeleniumUtils.scrollToElement(FooterPage.getFirstLink());
        new FooterPage().clickOnLinks(FooterPage.getFirstLink());
        Assert.assertTrue(Driver.getDriver().getTitle().contains(FooterPage.getFirstLink().getText()));
    }
    @Test
    public void test2() throws InterruptedException {
//        SeleniumUtils.scrollToElement(FooterPage.getSecondLink());
        new FooterPage().clickOnLinks(FooterPage.getSecondLink());
        Assert.assertTrue(Driver.getDriver().getTitle().contains(FooterPage.getSecondLink().getText()));
    }
    @Test
    public void test3(){
//        SeleniumUtils.scrollToElement(FooterPage.getThirdLink());
        new FooterPage().clickOnLinks(FooterPage.getThirdLink());
        Assert.assertTrue(Driver.getDriver().getTitle().contains(FooterPage.getThirdLink().getText()));
    }
    @Test
    public void test4(){
//        SeleniumUtils.scrollToElement(FooterPage.getFourthLink());
        new FooterPage().clickOnLinks(FooterPage.getFourthLink());
        Assert.assertTrue(Driver.getDriver().getTitle().contains(FooterPage.getFourthLink().getText()));
    }
    @Test
    public void test5(){
//        SeleniumUtils.scrollToElement(FooterPage.getFifthLink());
        new FooterPage().clickOnLinks(FooterPage.getFifthLink());
        Assert.assertTrue(Driver.getDriver().getTitle().contains(FooterPage.getFifthLink().getText()));
    }
}
