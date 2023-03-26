package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class MoreInfoBlogsPage {

    public MoreInfoBlogsPage(){ PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cookies;
    @FindBy(xpath = "//button[@class='tingle-modal__close']")
    private WebElement popUpWindow;
    @FindBy(id = "main-nav-decoratives")
    private WebElement decorativesSection;
    @FindBy(xpath = "//div[@class='l-plp-aside_content']")
    private WebElement sideBar;
    @FindBy(xpath = "//div[@class='grid-link']//h4[@data-analytics-more-info='Blogs']")
    private WebElement blogsElement;
    @FindBy(xpath = "//a[@href='/blogs/marble-bathroom-ideas.html']")
    private WebElement marbleBathroom;
    @FindBy(id = "view-article-button")
    private WebElement viewAsArticle;
    @FindBy(linkText = "Black marble")
    private WebElement blackMarbleLink;
    @FindBy(xpath = "//label[@title='Currently Refined by Color: Black']")
    private WebElement checkBoxBlack;
    @FindBy(xpath = "(//label[@class='f-input_checkbox-label b-plp_variations-label'])[24]")
    private WebElement checkBoxBlackIsSelected;


    public WebElement getPopUpWindow() {return popUpWindow;}
    public WebElement getDecorativesSection() {return decorativesSection;}
    public WebElement getBlogsElement() { return blogsElement; }
    public WebElement getMarbleBathroom() { return marbleBathroom; }
    public WebElement getBlackMarbleLink() { return blackMarbleLink; }
    public WebElement getCheckBoxBlack() {return checkBoxBlack; }
    public WebElement getCheckBoxBlackIsSelected() {return checkBoxBlackIsSelected; }


    public void acceptCookies(){cookies.click(); }
    public void popUpWindowClick(){popUpWindow.click();}
    public void scrollDown(WebElement webelement){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", webelement);
    }
    public void clickOnDecoratives(){ decorativesSection.click();}
    public void clickOnSideBar(){ sideBar.click();}
    public void blogsElementClick(){ blogsElement.click();}
    public void marbleBathroomClick(){ marbleBathroom.click();}
    public void viewAsArticleClcik(){viewAsArticle.click();}
    public void blackMarbleLinkClick(){ blackMarbleLink.click();}
//    public void checkBoxBlackIsSelected(){
//        assert checkBoxBlack.isSelected();
//
//    }

}
