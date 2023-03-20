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

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;


public class FindSocialIcons extends TestBase {


        @Test
    public void testPinterestIcon() throws InterruptedException {


            WebElement pinterestIcon = Driver.getDriver().findElement(By.cssSelector("a[title='Pinterest']"));
           // check if the Pinterest icon is displayed
             assertTrue(pinterestIcon.isDisplayed());
            pinterestIcon.click();

            // Swich pages
            Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid
            Iterator it = handles.iterator();
            String parentid = (String) it.next();
            String childid = (String) it.next();

            Driver.getDriver().switchTo().window( childid );

          String currentUrl = Driver.getDriver().getCurrentUrl();
          String expectedUrl = "https://www.pinterest.com/flooranddecor/";
              Assert.assertEquals(currentUrl, "https://www.pinterest.com/flooranddecor/");
        }



    @Test
    public void testSocialInstagramIcon() throws InterruptedException {


//        // Find the Instagram icon in the footer and click it
        WebElement instagramIcon = Driver.getDriver().findElement(By.cssSelector("a[title='Social Instagram Link']"));
        //  check if the Instagram icon is displayed
        assertTrue(instagramIcon.isDisplayed());

        instagramIcon.click();

     // Swich pages
        Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid
        Iterator it = handles.iterator();
        String parentid = (String) it.next();
        String childid = (String) it.next();

        Driver.getDriver().switchTo().window( childid );

        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.pinterest.com/flooranddecor/";
        Assert.assertEquals(currentUrl, "https://www.instagram.com/flooranddecor/");

    }

    @Test

    public void testFacebookIcon() {

        WebElement facebookIcon = Driver.getDriver().findElement(By.cssSelector("a[title='FaceBook']"));



        //  check if the FaceBook icon is displayed
        assertTrue(facebookIcon.isDisplayed());

        facebookIcon.click();

        // Swich pages
        Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid,subchild
        Iterator it = handles.iterator();
        String parentid = (String) it.next();
        String childid = (String) it.next();

        Driver.getDriver().switchTo().window( childid );
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.pinterest.com/flooranddecor/";
        Assert.assertEquals(currentUrl, "https://www.facebook.com/flooranddecor");


    }

    @Test
    public void testYouTubeIcon() {

        WebElement youtubeIcon = Driver.getDriver().findElement(By.cssSelector("a[title='YouTube']"));
        // check if the YouTube icon is displayed
        assertTrue(youtubeIcon.isDisplayed());
        youtubeIcon.click();
        // Swich pages
        Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid,subchild
        Iterator it = handles.iterator();
        String parentid = (String) it.next();
        String childid = (String) it.next();

        Driver.getDriver().switchTo().window( childid );
       
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.pinterest.com/flooranddecor/";
        Assert.assertEquals(currentUrl, "https://www.youtube.com/FloorAndDecor");

    }

    @Test
    public void testSocialLinkedinIcon() throws InterruptedException {

        // find the Linked In icon
        WebElement socialLinkedinIcon = Driver.getDriver().findElement(By.cssSelector("a[title='Social Linked In Link']"));
        // check if the Linked In icon is displayed
        assertTrue(socialLinkedinIcon.isDisplayed());
        socialLinkedinIcon.click();
        // Swich pages
        Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid,subchild
        Iterator it = handles.iterator();
        String parentid = (String) it.next();
        String childid = (String) it.next();

        Driver.getDriver().switchTo().window( childid );
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.pinterest.com/flooranddecor/";
        Assert.assertEquals(currentUrl, "https://www.linkedin.com/company/flooranddecor/");

    }

    @Test
    public void testTwitterIcon() throws InterruptedException {

        // find the Twitter Icon
        WebElement twitterIcon = Driver.getDriver().findElement(By.cssSelector("a[title='Twitter']"));
        // check if the Twitter icon is displayed
        assertTrue(twitterIcon.isDisplayed());
       twitterIcon.click();
        Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid,subchild
        Iterator it = handles.iterator();
        String parentid = (String) it.next();
        String childid = (String) it.next();

        Driver.getDriver().switchTo().window( childid );
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.pinterest.com/flooranddecor/";
        Assert.assertEquals(currentUrl, "https://twitter.com/flooranddecor");


    }

    @Test
    public void testSocialHouzzLinkIcon() throws InterruptedException {

        // find the Houzz icon
        WebElement socialHouzzLinkIcon= Driver.getDriver().findElement(By.cssSelector("a[title='Social Houzz Link']"));
        // check if the Linked In icon is displayed
        assertTrue(socialHouzzLinkIcon.isDisplayed());
        socialHouzzLinkIcon.click();
        // Swich pages
        Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid,subchild
        Iterator it = handles.iterator();
        String parentid = (String) it.next();
        String childid = (String) it.next();

        Driver.getDriver().switchTo().window( childid );
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.pinterest.com/flooranddecor/";
        Assert.assertEquals(currentUrl, "https://www.houzz.com/professionals/flooring-contractors/floor-and-decor-pfvwus-pf~276889407?");

    }

}


