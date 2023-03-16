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

//    @Test
//    public void jobsNearMe(){
//        ApplyPage applyPage = new ApplyPage();
//    }
}
