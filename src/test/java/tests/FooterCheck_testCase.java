package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AcceptFooterCookies;
import pages.FooterPage;
import utils.Driver;
import utils.SeleniumUtils;

import javax.swing.text.Utilities;

public class FooterCheck_testCase extends TestBase{
    @Test(groups = {"regression"})
    public void test1(){
        new AcceptFooterCookies().clickOnCookies();
        new FooterPage().clickOnLinks(new FooterPage().getFirstLink());
        SeleniumUtils.switchToWindow("About Us | Floor & Decor");
        Assert.assertEquals(Driver.getDriver().getTitle(),"About Us | Floor & Decor");
    }
    @Test(groups = {"regression"})
    public void test2(){
        new FooterPage().clickOnLinks(new FooterPage().getSecondLink());
        SeleniumUtils.switchToWindow("Investor Relations :: Floor & Decor Holdings, Inc. (FND)");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Investor Relations :: Floor & Decor Holdings, Inc. (FND)");
    }
    @Test(groups = {"regression"})
    public void test3(){
        new FooterPage().clickOnLinks(new FooterPage().getThirdLink());
        SeleniumUtils.switchToWindow("ESG :: Floor & Decor Holdings, Inc. (FND)");
        Assert.assertEquals(Driver.getDriver().getTitle(),"ESG :: Floor & Decor Holdings, Inc. (FND)");
    }
    @Test(groups = {"regression"})
    public void test4(){
        SeleniumUtils.switchToWindow("Careers Home Page");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Careers Home Page");
        Driver.getDriver().findElement(By.id("consent_agree")).click();
    }
    @Test(groups = {"regression"})
    public void test5(){
        new FooterPage().clickOnLinks(new FooterPage().getFifthLink());
        SeleniumUtils.switchToWindow("Social Responsibility | Floor & Decor");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Social Responsibility | Floor & Decor");
    }
}
