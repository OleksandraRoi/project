package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;


public class MoreInfoFAQPage {
    public MoreInfoFAQPage(){ PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cookies;
    @FindBy(xpath = "//button[@class='tingle-modal__close']")
    private WebElement popUpWindow;
    @FindBy(id = "main-nav-decoratives")
    private WebElement decorativesSection;
    @FindBy(xpath = "//div[@class='l-plp-aside_content']")
    private WebElement sideBar;
    @FindBy(xpath = "//div[@class='grid-link']//h4[@data-analytics-more-info='FAQs']")
    private WebElement FAQsElement;
    @FindBy(linkText = "Order Status")
    private WebElement orderStatus;
    @FindBy(id = "q")
    private WebElement toClickbleLink;
    @FindBy(xpath = "(//a[@class='b-hc_article-title'])[1]")
    private WebElement orderStatusCheck;
    @FindBy(xpath = "//a[@href='/order-lookup']")
    private WebElement clickHere;
    @FindBy(name = "phoneNbr")
    private WebElement phone;
    @FindBy(name = "orderNbr")
    private WebElement orderN;
    @FindBy(xpath = "//button[@class='b-account-password_form_button']")
    private WebElement checkStatusButton;
    @FindBy(xpath = "//div[@class='orderDetailHeader']")
    private WebElement orderDetails;


    public WebElement getPopUpWindow() {return popUpWindow;}
    public WebElement getDecorativesSection() {return decorativesSection;}
    public WebElement getFAQsElement() {return FAQsElement;}
    public WebElement getToClickbleLink() { return toClickbleLink;}
    public WebElement getOrderDetails() {return orderDetails;}


    public void acceptCookies(){cookies.click(); }
    public void popUpWindowClick(){popUpWindow.click();}
    public void scrollDown(WebElement webelement){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", webelement);
    }
    public void clickOnDecoratives(){ decorativesSection.click();}
    public void clickOnSideBar(){ sideBar.click();}
    public void FAQsClick(){ FAQsElement.click();}
    public void orderStatusClick(){ orderStatus.click();}
    public void orderStatusCheckClick(){ orderStatusCheck.click();}
    public void clickHereLink(){ clickHere.click();}
    public void phoneNumber(){
    Faker faker = new Faker();
        String num = faker.numerify("##########");
    phone.sendKeys(num);
    }
    public void orderNumber(){
        Faker faker = new Faker();
        String num = faker.numerify("########");
        orderN.sendKeys(num);
    }
    public void checkStatusButtonClick(){ checkStatusButton.click(); }
}


