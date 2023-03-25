package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Driver;
import utils.SeleniumUtils;

public class FindSocialIconsPage {

    public FindSocialIconsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='http://www.pinterest.com/flooranddecor/']")
    public WebElement pinterest;

    @FindBy (xpath = "//a[@href='https://www.instagram.com/flooranddecor/']")
    public WebElement instagram;

    @FindBy (xpath = "//a[@href='https://www.facebook.com/flooranddecor']")
    public WebElement facebook;

    @FindBy (xpath = "//a[@href='https://twitter.com/flooranddecor']")
    public WebElement twitter;

    @FindBy (xpath ="//a[@href='http://www.youtube.com/FloorAndDecor']" )
    public WebElement youtube;

    @FindBy (xpath ="//a[@href='https://www.linkedin.com/company/flooranddecor/']" )
    public WebElement linkedin;


public void clickOnPinterest() {
    SeleniumUtils.jsClick(pinterest);
   // pinterest.click();
}
public void clickOnInstagram() {
    SeleniumUtils.jsClick(instagram);
    //instagram.click();
}
public void clickOnFacebook() {
    SeleniumUtils.jsClick(facebook);
    //facebook.click();
}
public void clickOnTwitter() {
    SeleniumUtils.jsClick(twitter);
   // twitter.click();
}
public void clickOnYouTube() {
    SeleniumUtils.jsClick(youtube);
    //youtube.click();

}
public void clickOnLinkedin() {
    SeleniumUtils.jsClick(linkedin);
   // linkedin.click();

}
    // Click on the Pinterest link to open it in a new tab
public void switchToWindows(){

    String currentWindow = Driver.getDriver().getWindowHandle();

    WebElement pinterestLink = Driver.getDriver().findElement(By.cssSelector("a[title='Pinterest']"));
    Actions actions = new Actions(Driver.getDriver());
    actions.keyDown(Keys.CONTROL).click(pinterestLink).keyUp(Keys.CONTROL).build().perform();

// Switch to the new window


    }

}
