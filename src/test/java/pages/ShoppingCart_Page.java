package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;


public class ShoppingCart_Page {
    public ShoppingCart_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"main-nav-tile\"]") // Tile button
    private WebElement tileButton;

    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[1]/main/div/section/div[4]/div[1]/div[2]/div[1]/a/div/p")  // Tile item
    private WebElement whiteTileItem;

    @FindBy(xpath = "//button[contains(text(), 'Add Sample')]")
    private WebElement addSampleButton;

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/article/div[5]/a[1]")
    private WebElement cartButton;

    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/main/div[1]/div/div[3]/div/div[1]/div[1]/form/label/div/div[1]")
    private WebElement zipCodeButton;

    @FindBy(id = "dwfrm_shippingcalculator_zipcode")
    private WebElement zipCodeInput;

    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/main/div[1]/div/div[3]/div/div[1]/div[1]/form/button")
    private WebElement calculateShippingButton;

    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/main/div[1]/div/div[3]/div/div[1]/div[4]")
    private WebElement checkoutButton;

    @FindBy(id = "dwfrm_loginGuest_guest")
    private WebElement continueAsGuestButton;

    @FindBy(id = "dwfrm_addressForm_firstName")
    private WebElement firstNameInput;

    @FindBy(id = "dwfrm_addressForm_lastName")
    private WebElement lastNameInput;

    @FindBy(id = "dwfrm_addressForm_address1")
    private WebElement addressInput;

    @FindBy(id = "dwfrm_addressForm_city")
    private WebElement cityInput;

    @FindBy(xpath = "//*[@id=\"dwfrm_addressOptions\"]/article[1]/div/div/div/div[6]/div/div[1]/div/div[1]")
    private WebElement stateDropdown;

    @FindBy(xpath = "//*[@id=\"dwfrm_addressOptions\"]/article[1]/div/div/div/div[6]/div/div[1]/div/div[2]/div[2]/div[2]")
    private WebElement stateDropdownSelect;

    @FindBy(id = "dwfrm_addressForm_postalCode")
    private WebElement zipCodeInput2;

    @FindBy(id = "dwfrm_addressForm_phone")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "//*[@id=\"dwfrm_addressOptions_next\"]")
    private WebElement continueButton;

    @FindBy(xpath = "/html/body/div[6]/div/div/div[4]/button")
    private WebElement useThisAddressButton;




    public void  clickTileButton() {
        tileButton.click();
    }

    public void clickTileItem() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
        whiteTileItem.click();
    }

    public void clickAddSampleButton() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        addSampleButton.click();
    }

    public void clickCartButton() throws InterruptedException {
        cartButton.click();
        Thread.sleep(5000);
    }

    public void clickZipCodeButton() {
        zipCodeButton.click();
    }

    public void enterZipCode(String zipCode) {
        zipCodeInput.sendKeys(zipCode);
    }

    public void clickCalculateShippingButton() {
        calculateShippingButton.click();
    }

    public void clickCheckoutButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)", "");
        Thread.sleep(5000);
        checkoutButton.click();
    }

    public void clickContinueAsGuestButton() {
        continueAsGuestButton.click();
    }

    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void enterAddress(String address) {
        addressInput.sendKeys(address);
    }

    public void enterCity(String city) {
        cityInput.sendKeys(city);
    }

    public void clickStateDropdown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,700)", "");
        stateDropdown.click();
        Thread.sleep(2000);
    }

    public void clickStateDropdownSelect() {
        stateDropdownSelect.click();
    }

    public void enterZipCode2(String zipCode) {
        zipCodeInput2.sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        phoneNumberInput.sendKeys(phoneNumber);
    }

    public void clickContinueButton() throws InterruptedException {
        continueButton.click();
        Thread.sleep(3000);
    }

    public void clickUseThisAddressButton() {
        useThisAddressButton.click();
    }

}

