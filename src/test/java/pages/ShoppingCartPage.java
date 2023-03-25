package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ShoppingCartPage {
    public ShoppingCartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"main-nav-tile\"]")
    private WebElement tileButton;
    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[1]/main/div/section/div[4]/div[1]/div[2]/div[1]/a/div/p")
    private WebElement tileItem;
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
    @FindBy(xpath = "//*[@id=\"dwfrm_lShoginGuest_guest\"]")
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
    private WebElement stateOption;
    @FindBy(id = "dwfrm_addressForm_postalCode")
    private WebElement postalCodeInput;
    @FindBy(id = "dwfrm_addressForm_phone")
    private WebElement phoneNumberInput;
    @FindBy(id = "dwfrm_addressOptions_next")
    private WebElement continueButton;
    @FindBy(xpath = "/html/body/div[6]/div/div/div[4]/button")
    private WebElement useThisAddressButton;

    public void selectTile() {
        tileButton.click();
    }

    public void selectTileItem() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
        tileItem.click();
        js.executeScript("window.scrollBy(0,500)", "");
    }

    public void addSample() {
        addSampleButton.click();
    }

    public void goToCart() {
        cartButton.click();
    }

    public void enterZipCode(String code) {
        zipCodeButton.click();
        zipCodeInput.sendKeys(code);
    }

    public void calculateShipping() {
        calculateShippingButton.click();
    }

    public void goToCheckout() {
        checkoutButton.click();
    }

    public void continueAsGuest() {
        continueAsGuestButton.click();
    }

    public void enterFirstName(String name) {
        firstNameInput.sendKeys(name);
    }

    public void enterLastName(String name) {
        lastNameInput.sendKeys(name);
    }

    public void enterAddress(String address) {
        addressInput.sendKeys(address);
    }

    public void enterCity(String city) {
        cityInput.sendKeys(city);
    }

    public void selectState() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)", "");
    }

        public void navigateBack() {
            Driver.getDriver().navigate().back();
        }

        public String getCurrentUrl() {
            return Driver.getDriver().getCurrentUrl();
        }

        public void scrollStateDropdown() {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].scrollIntoView(true);", stateDropdown);
        }

        public void selectStateOption() {
            stateOption.click();
        }

        public void enterPostalCode(String postalCode) {
            postalCodeInput.sendKeys(postalCode);
        }

        public void enterPhoneNumber(String phoneNumber) {
            phoneNumberInput.sendKeys(phoneNumber);
        }

        public void continueToNextStep() {
            continueButton.click();
        }

        public void useThisAddress() {
            useThisAddressButton.click();
        }

        public String getErrorMessage() {
            WebElement errorElement = Driver.getDriver().findElement(By.className("form-row-error"));
            return errorElement.getText();
        }

        public void clickContinue() {
            continueButton.click();
        }

        // Main page
//        driver.get("https://www.flooranddecor.com/");
//        Thread.sleep(5000);
//
//        //Select tile
//        Driver.getDriver()(By.xpath("//*[@id=\"main-nav-tile\"]")).click();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,300)", "");
//        driver.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div[1]/main/div/section/div[4]/div[1]/div[2]/div[1]/a/div/p")).click();
//        js.executeScript("window.scrollBy(0,500)", "");
//
//        // Add sample
//        driver.findElement(By.xpath("//button[contains(text(), 'Add Sample')]")).click();
//        Thread.sleep(2000);
//
//        // Cart
//        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/article/div[5]/a[1]")).click();
//
//
//
//        //Zip Code
//        driver.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/main/div[1]/div/div[3]/div/div[1]/div[1]/form/label/div/div[1]")).click();
//        driver.findElement(By.id("dwfrm_shippingcalculator_zipcode")).sendKeys("33637");
//
//        //Calculate shipping
//        driver.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/main/div[1]/div/div[3]/div/div[1]/div[1]/form/button")).click();
//
//        js.executeScript("window.scrollBy(0,200)", "");
//        Thread.sleep(5000);
//
//        // Checkout
//        driver.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/main/div[1]/div/div[3]/div/div[1]/div[4]")).click();
//
//        //Continue as guest
//        driver.findElement(By.id("dwfrm_loginGuest_guest")).click();
//
//        //First Name
//        driver.findElement(By.id("dwfrm_addressForm_firstName")).sendKeys("Alex");
//
//        //Last Name
//        driver.findElement(By.id("dwfrm_addressForm_lastName")).sendKeys("Smith");
//
//        //Address
//        driver.findElement(By.id("dwfrm_addressForm_address1")).sendKeys("2099 Gallows Rd");
//
//        //City
//        driver.findElement(By.id("dwfrm_addressForm_city")).sendKeys("Vienna");
//        js.executeScript("window.scrollBy(0,500)", "");
//
//        //State
//        js.executeScript("window.scrollBy(0,200)", "");
//        driver.findElement(By.className("ss-single-selected")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"dwfrm_addressOptions\"]/article[1]/div/div/div/div[6]/div/div[1]/div/div[2]/div[2]/div[2]")).click();
//
//        //Zip Code
//        driver.findElement(By.id("dwfrm_addressForm_postalCode")).sendKeys("22182");
//
//        //Phone Number
//        driver.findElement(By.id("dwfrm_addressForm_phone")).sendKeys("571-456-7890");
//
//        //Continue
//        driver.findElement(By.id("dwfrm_addressOptions_next")).click();
//        Thread.sleep(5000);
//
//        //use this address
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[4]/button")).click();


    }

