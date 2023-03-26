package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShoppingCart_Page;


public class ShoppingCart_Test extends TestBase {

    @Test
    public void addSampleToCart() throws InterruptedException {
        new ShoppingCart_Page().clickTileButton();
        new ShoppingCart_Page().clickTileItem();
        new ShoppingCart_Page().clickAddSampleButton();
        new ShoppingCart_Page().clickCartButton();
        new ShoppingCart_Page().clickZipCodeButton();
        new ShoppingCart_Page().enterZipCode("33637");
        new ShoppingCart_Page().clickCalculateShippingButton();
        new ShoppingCart_Page().clickCheckoutButton();
        new ShoppingCart_Page().clickContinueAsGuestButton();
        new ShoppingCart_Page().enterFirstName("John");
        new ShoppingCart_Page().enterLastName("Smith");
        new ShoppingCart_Page().enterAddress("123 Main St");
        new ShoppingCart_Page().enterCity("Tampa");
        new ShoppingCart_Page().clickStateDropdown();
        new ShoppingCart_Page().clickStateDropdownSelect();
        new ShoppingCart_Page().enterZipCode2("33637");
        new ShoppingCart_Page().enterPhoneNumber("813-555-5555");
        new ShoppingCart_Page().clickContinueButton();
        String expectedText = "John Smith, 123 Main St, Tampa, AL 33637, United States, 8135555555";
        Assert.assertEquals(expectedText, "John Smith, 123 Main St, Tampa, AL 33637, United States, 8135555555" );
    }

























    }

