package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ApplyPage;
import utils.Driver;

public class ApplyTest extends TestBase {


    @Test(groups = {"smoke"})
    public void apply() {
        ApplyPage applyPage = new ApplyPage();
        logger.info("Navigate to Apply page");
        applyPage.clickApplyButton();
        logger.info("Check if it takes you to correct link");
        Assert.assertEquals(applyPage.urlActual(), "https://careers.flooranddecor.com/home");
    }

    @Test(groups = {"smoke"})
    public void jobsNearMe() throws InterruptedException {
        ApplyPage applyPage = new ApplyPage();
        logger.info("Navigate to Apply page");
        applyPage.clickApplyButton();
        applyPage.alert();
        logger.info("Select near me jobs");
        applyPage.nearMeButton();
        applyPage.sleep();
        applyPage.scrollDown();
        logger.info("Select city Arlington");
        applyPage.cityOverlapping();
        applyPage.sleep();
        logger.info("Check if the number of available jobs is same as the jobs shown");
        Assert.assertTrue(applyPage.numberOfJobs().contains(applyPage.jobsCount()));
    }

    @Test(groups = {"smoke"})
    public void jobTitle() throws InterruptedException {
        ApplyPage applyPage = new ApplyPage();
        logger.info("Navigate to Apply page");
        applyPage.clickApplyButton();
        applyPage.alert();
        applyPage.sleep();
        logger.info("Select near me jobs");
        applyPage.nearMeButton();
        applyPage.sleep();
        applyPage.scrollDown();
        logger.info("Select city Arlington");
        applyPage.cityOverlapping();
        applyPage.scrollUp();
        applyPage.sleep2();
        String nameJob = applyPage.jobLink1();
        logger.info("Click on a job available");
        applyPage.jobsLinksClick();
        applyPage.sleep();
        logger.info("Check if the name on the job is the same as the one that was clicked");
        Assert.assertEquals(nameJob, applyPage.jobLink2());
    }

    @Test(groups = {"smoke"})
    public void benefits() {
        ApplyPage applyPage = new ApplyPage();
        logger.info("Navigate to Apply page");
        applyPage.clickApplyButton();
        applyPage.alert();
        logger.info("Navigate to Benefits page");
        applyPage.benefits();
        logger.info("Check if it is on correct page");
        Assert.assertTrue(applyPage.benefitsContain().contains("Our Benefits"));
    }
}
