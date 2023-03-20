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
        applyPage.scrollDown();
        applyPage.cityOverlapping();
        applyPage.sleep();
        Assert.assertTrue(applyPage.numberOfJobs().contains(applyPage.jobsCount()));
    }

    @Test
    public void jobTitle() throws InterruptedException {
        ApplyPage applyPage = new ApplyPage();
        applyPage.clickApplyButton();
        applyPage.alert();
        applyPage.sleep();
        applyPage.nearMeButton();
        applyPage.sleep();
        applyPage.scrollDown();
        applyPage.cityOverlapping();
        applyPage.scrollUp();
        applyPage.sleep2();
        String nameJob = applyPage.jobLink1();
        applyPage.jobsLinksClick();
        applyPage.sleep();
        Assert.assertEquals(nameJob, applyPage.jobLink2());
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
