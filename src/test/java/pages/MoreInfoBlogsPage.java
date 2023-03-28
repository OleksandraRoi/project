package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    private WebElement readArticle;
    @FindBy(id = "view-article-button")
    private WebElement viewAsArticle;
    @FindBy(linkText = "Black marble")
    private WebElement blackMarbleLink;
    @FindBy(id = "refinement-boolean-popular-Black-Color")
    private WebElement checkBoxBlack;
    @FindBy(xpath = "//a[@href='/blogs/shower-tile-trends.html']")
    private WebElement readArticle2;
    @FindBy(xpath = "(//a[@href='https://www.flooranddecor.com/large-format-tile-tile'])[1]")
    private WebElement largeFormatTile;
    @FindBy(xpath = "//div[@class='ss-single-selected']")
    private WebElement dropDown;
    @FindBy(xpath = "//div[@data-id='Price Low to High2']")
    private WebElement priceLowToHigh;


    public WebElement getPopUpWindow() {return popUpWindow;}
    public WebElement getDecorativesSection() {return decorativesSection;}
    public WebElement getBlogsElement() { return blogsElement; }
    public WebElement getReadArticle() { return readArticle; }
    public WebElement getBlackMarbleLink() { return blackMarbleLink; }
    public WebElement getCheckBoxBlack() {return checkBoxBlack; }
    public WebElement getReadArticle2() {return readArticle2;}
    public WebElement getLargeFormatTile() {return largeFormatTile;}


    public void acceptCookies(){cookies.click(); }
    public void popUpWindowClick(){popUpWindow.click();}
    public void scrollDown(WebElement webelement){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", webelement);
    }
    public void clickOnDecoratives(){ decorativesSection.click();}
    public void clickOnSideBar(){ sideBar.click();}
    public void blogsElementClick(){ blogsElement.click();}
    public void readArticleClick(){ readArticle.click();}
    public void viewAsArticleClcik(){viewAsArticle.click();}
    public void blackMarbleLinkClick(){ blackMarbleLink.click();}

    public void readArticleClick2(){readArticle2.click();}
    public void largeFormatTileClick(){largeFormatTile.click();}
    public void dropDownClick(){dropDown.click();}
    public void priceLowToHighClick(){priceLowToHigh.click();}

    public String price(){
    List<WebElement> price = Driver.getDriver().findElements(By.xpath("//span[@data-js-product-price]"));
        List<Integer> priceLowToHigh = new ArrayList<>();

        for(WebElement element : price){
            priceLowToHigh.add(Integer.parseInt(element.getText().replaceAll("[$.]", "")));
        }
        return String.valueOf(priceLowToHigh);
    }
    public String priceCopy() {
        List<WebElement> price = Driver.getDriver().findElements(By.xpath("//span[@data-js-product-price]"));
        List<Integer> priceLowToHigh = new ArrayList<>();

        for(WebElement element : price){
            priceLowToHigh.add(Integer.parseInt(element.getText().replaceAll("[$.]", "")));
        }
        List<Integer> copyPrice = new ArrayList<>(priceLowToHigh);
        Collections.sort(copyPrice);

        return String.valueOf(copyPrice);
    }
}
