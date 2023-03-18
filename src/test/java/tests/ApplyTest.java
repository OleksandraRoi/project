package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ApplyPage;
import utils.Driver;

public class ApplyTest extends TestBase {


    @Test
    public void apply() {
        ApplyPage applyPage = new ApplyPage();
        applyPage.clickApplyButton();
        Assert.assertEquals(applyPage.urlActual(), "https://careers.flooranddecor.com/home");
    }

    @Test
    public void jobsNearMe() throws InterruptedException {
        ApplyPage applyPage = new ApplyPage();
        applyPage.clickApplyButton();
        applyPage.alert();
        applyPage.nearMeButton();
        applyPage.sleep();
        applyPage.scrollDownToCity();
        // applyPage.cityCheckbox();
//        applyPage.cityClick();
//        Assert.assertTrue(applyPage.jobsCount().contains(applyPage.numberOfJobs()));
    }

    @Test
    public void jobTitle(){
        ApplyPage applyPage = new ApplyPage();
        applyPage.clickApplyButton();
        applyPage.alert();
        applyPage.nearMeButton();

        Assert.assertTrue(applyPage.pageTitle().contains(applyPage.title()));
    }

    @Test
    public void benefits() {
        ApplyPage applyPage = new ApplyPage();
        applyPage.clickApplyButton();
        applyPage.alert();
        applyPage.benefits();
        Assert.assertTrue(applyPage.benefitsContain().contains("Our Benefits"));
    }
}
