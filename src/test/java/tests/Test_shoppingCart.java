package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShoppingCartPage;
import utils.Driver;


public class Test_shoppingCart extends TestBase {

        @Test
        public void addTileSampleToCart() throws InterruptedException {
            ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
            shoppingCartPage.selectTile();
            shoppingCartPage.selectTileItem();
            shoppingCartPage.addSample();
            shoppingCartPage.goToCart();
            shoppingCartPage.enterZipCode("33637");
            shoppingCartPage.calculateShipping();
            shoppingCartPage.goToCheckout();
            shoppingCartPage.continueAsGuest();
            shoppingCartPage.enterFirstName("Alex");
            shoppingCartPage.enterLastName("Smith");
            shoppingCartPage.enterAddress("2099 Gallows Rd");
            shoppingCartPage.enterCity("Vienna");
            shoppingCartPage.selectState();
            shoppingCartPage.scrollStateDropdown();
            shoppingCartPage.selectStateOption();
            shoppingCartPage.enterPostalCode("22182");
            shoppingCartPage.enterPhoneNumber("571-456-7890");
            shoppingCartPage.continueToNextStep();
            shoppingCartPage.useThisAddress();
            Assert.assertTrue(shoppingCartPage.getErrorMessage().contains("Please enter a valid ZIP code"));
        }
            @Test
        public void enterInvalidZipCode() throws InterruptedException {
            ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
            shoppingCartPage.selectTile();
            shoppingCartPage.selectTileItem();
            shoppingCartPage.addSample();
            shoppingCartPage.goToCart();
            shoppingCartPage.enterZipCode("invalid");
            shoppingCartPage.calculateShipping();
            Assert.assertTrue(shoppingCartPage.getErrorMessage().contains("Please enter a valid ZIP code"));
        }

        @Test
        public void navigateBackToHomePage() throws InterruptedException {
            ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
            shoppingCartPage.selectTile();
            shoppingCartPage.selectTileItem();
            shoppingCartPage.addSample();
            shoppingCartPage.goToCart();
            shoppingCartPage.navigateBack();
            Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.flooranddecor.com/");

        }

        @Test
        public void continueToNextStepWithoutEnteringDetails() throws InterruptedException {
            ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
            shoppingCartPage.selectTile();
            shoppingCartPage.selectTileItem();
            shoppingCartPage.addSample();
            shoppingCartPage.goToCart();
            shoppingCartPage.enterZipCode("33637");
            shoppingCartPage.calculateShipping();
            shoppingCartPage.goToCheckout();
            shoppingCartPage.continueAsGuest();
            shoppingCartPage.clickContinue();
            Assert.assertTrue(shoppingCartPage.getErrorMessage().contains("Please enter your first name"));
//    @Test
//    public void MainPage() {






    }
}
