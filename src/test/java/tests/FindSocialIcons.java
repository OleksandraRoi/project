package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FindSocialIconsPage;
import utils.Driver;
import utils.SeleniumUtils;

import java.util.Iterator;
import java.util.Set;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;
import static utils.SeleniumUtils.waitFor;


public class FindSocialIcons extends TestBase {


    @Test
    public void testPinterest() {

        FindSocialIconsPage findSocialIconsPage = new FindSocialIconsPage();

        findSocialIconsPage.pinterest.isDisplayed();

        assertTrue(findSocialIconsPage.pinterest.isDisplayed());
    }

//      @Test
//        public void testPinterestUrl() {
//
//          Driver.getDriver().getCurrentUrl();
//
//
//          FindSocialIconsPage findSocialIconsPage = new FindSocialIconsPage();
//          findSocialIconsPage.pinterest.click();
//          try {
//              Thread.sleep(5000);
//          } catch (InterruptedException e) {
//              e.printStackTrace();
//          }
//          Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.pinterest.com/flooranddecor/");



    @Test
    public void testInstagram() {

        FindSocialIconsPage findSocialIconsPage = new FindSocialIconsPage();

        findSocialIconsPage.instagram.isDisplayed();

      assertTrue(findSocialIconsPage.instagram.isDisplayed());

    }

    @Test
    public void testFacebook() {

        FindSocialIconsPage findSocialIconsPage = new FindSocialIconsPage();

        findSocialIconsPage.facebook.isDisplayed();

        assertTrue(findSocialIconsPage.facebook.isDisplayed());
    }

    @Test
    public void testTwitter() {

        FindSocialIconsPage findSocialIconsPage = new FindSocialIconsPage();

        findSocialIconsPage.twitter.isDisplayed();

        assertTrue(findSocialIconsPage.twitter.isDisplayed());

    }

    @Test
    public void testYouTube() {

        FindSocialIconsPage findSocialIconsPage = new FindSocialIconsPage();

        findSocialIconsPage.youtube.isDisplayed();

        assertTrue(findSocialIconsPage.youtube.isDisplayed());

    }


    @Test
    public void testLinkedin() {

        FindSocialIconsPage findSocialIconsPage = new FindSocialIconsPage();

        findSocialIconsPage.linkedin.isDisplayed();

        assertTrue(findSocialIconsPage.linkedin.isDisplayed());

    }

}
//
//        @Test
//    public void testPinterestIcon() throws InterruptedException {
//
//
//
//            WebElement pinterestIcon = Driver.getDriver().findElement(By.cssSelector("a[title='Pinterest']"));
//
//           // check if the Pinterest icon is displayed
//            assertTrue(pinterestIcon.isDisplayed());
//            pinterestIcon.click();
//
//            // Switch pages
//            Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid
//            Iterator it = handles.iterator();
//            String parentid = (String) it.next();
//            String childid = (String) it.next();
//
//            Driver.getDriver().switchTo().window( childid );
//
//          String currentUrl = Driver.getDriver().getCurrentUrl();
//          String expectedUrl = "https://www.pinterest.com/flooranddecor/";
//          Assert.assertEquals(currentUrl, "https://www.pinterest.com/flooranddecor/");
//
//        }
//
//
//    @Test
//    public void testSocialInstagramIcon() throws InterruptedException {
//
////        // Find the Instagram icon in the footer and click it
//        WebElement instagramIcon = Driver.getDriver().findElement(By.cssSelector("a[title='Social Instagram Link']"));
//
//        //  check if the Instagram icon is displayed
//        assertTrue(instagramIcon.isDisplayed());
//
//        instagramIcon.click();
//
//     // Switch pages
//        Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid
//        Iterator it = handles.iterator();
//        String parentid = (String) it.next();
//        String childid = (String) it.next();
//
//        Driver.getDriver().switchTo().window( childid );
//
//        String currentUrl = Driver.getDriver().getCurrentUrl();
//        String expectedUrl = "https://www.instagram.com/flooranddecor/";
//        Assert.assertEquals(currentUrl, "https://www.instagram.com/flooranddecor/");
//
//    }
//
//    @Test
//
//    public void testFacebookIcon() throws InterruptedException {
//
//        WebElement facebookIcon = Driver.getDriver().findElement(By.cssSelector("a[title='FaceBook']"));
//
//        //  check if the FaceBook icon is displayed
//        assertTrue(facebookIcon.isDisplayed());
//        facebookIcon.click();
//
//        // Switch pages
//        Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid,subchild
//        Iterator it = handles.iterator();
//        String parentid = (String) it.next();
//        String childid = (String) it.next();
//
//        Driver.getDriver().switchTo().window( childid );
//
//        String currentUrl = Driver.getDriver().getCurrentUrl();
//        String expectedUrl = "https://www.facebook.com/flooranddecor";
//        Assert.assertEquals(currentUrl, "https://www.facebook.com/flooranddecor");
//
//    }
//
//    @Test
//    public void testYouTubeIcon() throws InterruptedException {
//
//        WebElement youtubeIcon = Driver.getDriver().findElement(By.cssSelector("a[title='YouTube']"));
//
//        // check if the YouTube icon is displayed
//        assertTrue(youtubeIcon.isDisplayed());
//        youtubeIcon.click();
//
//        // Switch pages
//        Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid,subchild
//        Iterator it = handles.iterator();
//        String parentid = (String) it.next();
//        String childid = (String) it.next();
//
//        Driver.getDriver().switchTo().window( childid );
//
//        String currentUrl = Driver.getDriver().getCurrentUrl();
//        String expectedUrl = "https://www.youtube.com/FloorAndDecor";
//        Assert.assertEquals(currentUrl, "https://www.youtube.com/FloorAndDecor");
//
//    }
//
//    @Test
//    public void testSocialLinkedinIcon() throws InterruptedException {
//
//        // find the Linked In icon
//        WebElement socialLinkedinIcon = Driver.getDriver().findElement(By.cssSelector("a[title='Social Linked In Link']"));
//
//        // check if the Linked In icon is displayed
//        assertTrue(socialLinkedinIcon.isDisplayed());
//        socialLinkedinIcon.click();
//
//        // Switch pages
//        Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid,subchild
//        Iterator it = handles.iterator();
//        String parentid = (String) it.next();
//        String childid = (String) it.next();
//
//        Driver.getDriver().switchTo().window( childid );
//
//        String currentUrl = Driver.getDriver().getCurrentUrl();
//        String expectedUrl = "https://www.linkedin.com/company/flooranddecor/";
//        Assert.assertEquals(currentUrl, "https://www.linkedin.com/company/flooranddecor/");
//
//    }
//
//    @Test
//    public void testTwitterIcon() throws InterruptedException {
//
//        // find the Twitter Icon
//        WebElement twitterIcon = Driver.getDriver().findElement(By.cssSelector("a[title='Twitter']"));
//
//        // check if the Twitter icon is displayed
//        assertTrue(twitterIcon.isDisplayed());
//       twitterIcon.click();
//
//        // Switch pages
//        Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid,subchild
//        Iterator it = handles.iterator();
//        String parentid = (String) it.next();
//        String childid = (String) it.next();
//
//        Driver.getDriver().switchTo().window( childid );
//
//        String currentUrl = Driver.getDriver().getCurrentUrl();
//        String expectedUrl = "https://twitter.com/flooranddecor";
//        Assert.assertEquals(currentUrl, "https://twitter.com/flooranddecor");
//
//    }
//
//    @Test
//    public void testSocialHouzzLinkIcon() throws InterruptedException {
//
//        // find the Houzz icon
//        WebElement socialHouzzLinkIcon= Driver.getDriver().findElement(By.cssSelector("a[title='Social Houzz Link']"));
//
//        // check if the Linked In icon is displayed
//        assertTrue(socialHouzzLinkIcon.isDisplayed());
//        socialHouzzLinkIcon.click();
//
//        // Switch pages
//        Set<String> handles =  Driver.getDriver().getWindowHandles();//parentid,childid,subchild
//        Iterator it = handles.iterator();
//        String parentid = (String) it.next();
//        String childid = (String) it.next();
//
//        Driver.getDriver().switchTo().window( childid );
//
//        String currentUrl = Driver.getDriver().getCurrentUrl();
//        String expectedUrl = "https://www.houzz.com/professionals/flooring-contractors/floor-and-decor-pfvwus-pf~276889407?";
//        Assert.assertEquals(currentUrl, "https://www.houzz.com/professionals/flooring-contractors/floor-and-decor-pfvwus-pf~276889407?");
//
//    }
//
//}
//
//
