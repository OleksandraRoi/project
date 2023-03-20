package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;


public class FindSocialIcons extends TestBase {

    @Test
    public void pinterestIcon() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        // Navigate to the website
        driver.get("https://www.flooranddecor.com/");
        // find the Pinterest icon
        WebElement pinterestIcon = driver.findElement(By.cssSelector("a[title='Pinterest']"));
        // check if the Pinterest icon is displayed
        assertTrue(pinterestIcon.isDisplayed());

    }

    @Test
    public void socialInstagramIcon() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // Navigate to the website
        driver.get("https://www.flooranddecor.com/");

        // Find the Instagram icon in the footer and click it
        WebElement instagramIcon = driver.findElement(By.cssSelector("a[title='Social Instagram Link']"));

        //  check if the Instagram icon is displayed
        assertTrue(instagramIcon.isDisplayed());


    }

    @Test

    public void facebookIcon() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // Navigate to the website
        driver.get("https://www.flooranddecor.com/");
        // Find the FaceBook icon
        WebElement facebookIcon = driver.findElement(By.cssSelector("a[title='FaceBook']"));
        //  check if the FaceBook icon is displayed
        assertTrue(facebookIcon.isDisplayed());

    }

    @Test
    public void youTubeIcon() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        // Navigate to the website
        driver.get("https://www.flooranddecor.com/");
        // find the YouTube icon
        WebElement youtubeIcon = driver.findElement(By.cssSelector("a[title='YouTube']"));
        // find the YouTube icon
        // check if the YouTube icon is displayed
        assertTrue(youtubeIcon.isDisplayed());
    }

    @Test
    public void socialLinkedinIcon() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        // Navigate to the website
        driver.get("https://www.flooranddecor.com/");

        // find the Linked In icon
        WebElement socialLinkedinIcon = driver.findElement(By.cssSelector("a[title='Social Linked In Link']"));

        // find the Linked In icon
        // check if the Linked In icon is displayed
        assertTrue(socialLinkedinIcon.isDisplayed());
    }

    @Test
    public void twitterIcon() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        // Navigate to the website
        driver.get("https://www.flooranddecor.com/");

        // find the Twitter Ic
         WebElement twitterIcon = driver.findElement(By.cssSelector("a[title='Twitter']"));
//        twitterIcon.click();

        // check if the Twitter icon is displayed
        assertTrue(twitterIcon.isDisplayed());
        // Assert that the URL is correct
        //assertEquals("https://twitter.com/flooranddecor", driver.getCurrentUrl());

    }

    @Test
    public void socialHouzzLinkIcon() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        // Navigate to the website
        driver.get("https://www.flooranddecor.com/");

        // find the Houzz icon
        WebElement socialHouzzLinkIcon= driver.findElement(By.cssSelector("a[title='Social Houzz Link']"));

        // check if the Linked In icon is displayed
        assertTrue(socialHouzzLinkIcon.isDisplayed());
    }

}

