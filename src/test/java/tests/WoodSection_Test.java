package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WoodSection_Page;

public class WoodSection_Test extends TestBase {

//    1) Verify that the user can view the different types of wood available on the website
//    - Navigate to the Floor and Decor website
//    - Click on the "Wood" category
//    - Assert that the user can view the different types of wood available
    @Test
    public void viewWoodCategory() throws InterruptedException {
        new WoodSection_Page().clickWoodSection();

    }

//    1) Verify that the user can add wood products to their cart
//   -  Navigate to the Floor and Decor website
//   -  Click on the "Wood" category
//   -  Select a wood product
//   -  Add the product to the cart
//   -  Assert that the product has been added to the cart

    @Test
    public void addWoodToCart() throws InterruptedException {
        new WoodSection_Page().clickWoodSection();
        new WoodSection_Page().clickWoodColor();
        new WoodSection_Page().clickWoodItemSample();

    }

//    3) Verify that the user can search for a specific type of wood
//    - Navigate to the Floor and Decor website
//    - Enter a specific type of wood in the search bar
//    - Assert that the search results show the specific type of wood entered
    @Test
    public void searchForWood() throws InterruptedException {
        new WoodSection_Page().clickSearchBox();

    }

//    4) Verify that the user can filter wood products by price
//    - Navigate to the Floor and Decor website
//    - Click on the "Wood" category
//    - Filter the products by price (low to high)
//    - Assert that the products displayed meet the filter criteria

    @Test
    public void filterWoodByLowPrice() throws InterruptedException {
        new WoodSection_Page().clickWoodSection();
        new WoodSection_Page().clickWoodColor();
        new WoodSection_Page().clickSortByButton();
        new WoodSection_Page().clickSortByPriceLowToHigh();

    }
// 5) Verify that the user can filter wood products by price
//    - Navigate to the Floor and Decor website
//    - Click on the "Wood" category
//    - Filter the products by price (high to low)
//    - Assert that the products displayed meet the filter criteria

    @Test
    public void filterWoodByHighPrice() throws InterruptedException {
        new WoodSection_Page().clickWoodSection();
        new WoodSection_Page().clickWoodColor();
        new WoodSection_Page().clickSortByButton();
        new WoodSection_Page().clickSortByPriceHighToLow();

    }







































}
