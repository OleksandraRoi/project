package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

import javax.print.attribute.HashPrintServiceAttributeSet;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;


public class FindSocialIcons extends TestBase {

        @Test
    public void testPinterestIcon() throws InterruptedException {

            WebElement pinterestIcon = Driver.getDriver().findElement(By.cssSelector("a[title='Pinterest']"));
            pinterestIcon.click();

           // Driver.getDriver().findElement(By.cssSelector("a[title='Pinterest']")).sendKeys(Keys.CONTROL+"\t");

            Driver.getDriver().switchTo().window("https://www.pinterest.com/flooranddecor/");
            // check if the Pinterest icon is displayed
             assertTrue(pinterestIcon.isDisplayed());
//            String currentUrl = Driver.getDriver().getCurrentUrl();
//            String expectedUrl = "https://www.pinterest.com/flooranddecor/";
//            Assert.assertEquals(currentUrl, "https://www.pinterest.com/flooranddecor/");
        }



    @Test
    public void testSocialInstagramIcon() throws InterruptedException {
//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//
//        // Navigate to the website
//        driver.get("https://www.flooranddecor.com/");
//
//        // Find the Instagram icon in the footer and click it
        WebElement instagramIcon = Driver.getDriver().findElement(By.cssSelector("a[title='Social Instagram Link']"));

        instagramIcon.click();
        //  check if the Instagram icon is displayed
        assertTrue(instagramIcon.isDisplayed());


    }

    @Test

    public void testFacebookIcon() {
//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//
//        // Navigate to the website
//        driver.get("https://www.flooranddecor.com/");
//        // Find the FaceBook icon
        WebElement facebookIcon = Driver.getDriver().findElement(By.cssSelector("a[title='FaceBook']"));
        facebookIcon.click();
        //  check if the FaceBook icon is displayed
        assertTrue(facebookIcon.isDisplayed());

    }

    @Test
    public void testYouTubeIcon() {

//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        // Navigate to the website
//        driver.get("https://www.flooranddecor.com/");
//        // find the YouTube icon
        WebElement youtubeIcon = Driver.getDriver().findElement(By.cssSelector("a[title='YouTube']"));
        youtubeIcon.click();
        // find the YouTube icon
        // check if the YouTube icon is displayed
        assertTrue(youtubeIcon.isDisplayed());
    }

    @Test
    public void testSocialLinkedinIcon() throws InterruptedException {

//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        // Navigate to the website
//        driver.get("https://www.flooranddecor.com/");

        // find the Linked In icon
        WebElement socialLinkedinIcon = Driver.getDriver().findElement(By.cssSelector("a[title='Social Linked In Link']"));
        socialLinkedinIcon.click();
        // find the Linked In icon
        // check if the Linked In icon is displayed
        assertTrue(socialLinkedinIcon.isDisplayed());
    }

    @Test
    public void testTwitterIcon() throws InterruptedException {
//
//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        // Navigate to the website
//        driver.get("https://www.flooranddecor.com/");

        // find the Twitter Icon
        WebElement twitterIcon = Driver.getDriver().findElement(By.cssSelector("a[title='Twitter']"));
       twitterIcon.click();

        // check if the Twitter icon is displayed
        assertTrue(twitterIcon.isDisplayed());

        // Assert that the URL is correct
     //  assertEquals("https://twitter.com/flooranddecor", Driver );

    }

    @Test
    public void testSocialHouzzLinkIcon() throws InterruptedException {
//
//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        // Navigate to the website
//        driver.get("https://www.flooranddecor.com/");

        // find the Houzz icon
        WebElement socialHouzzLinkIcon= Driver.getDriver().findElement(By.cssSelector("a[title='Social Houzz Link']"));
        socialHouzzLinkIcon.click();
        // check if the Linked In icon is displayed
        assertTrue(socialHouzzLinkIcon.isDisplayed());
    }

}


