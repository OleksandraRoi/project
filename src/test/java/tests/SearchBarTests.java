package tests;
//import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.SearchBarPage;
import utils.Driver;
import utils.SeleniumUtils;

public class SearchBarTests extends TestBase {
    @Test (dataProvider = "getData", groups = {"regression"})
    public void searchBar(String name) {

        //SeleniumUtils.waitFor(2);
        //Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        //SeleniumUtils.waitFor(2);
        logger.info("Navigating to the search bar lane");
        SearchBarPage searchBar = new SearchBarPage ();
        SeleniumUtils.waitFor(2);
        logger.info("Entering the search word in the search bar lane");
        searchBar.searchButton(name);
        searchBar.searchButton1();
        logger.info("Comparing if the search word appears on the new page after search");
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(name));

    }

    @DataProvider()
    public Object[][] getData() {

        return new Object[][]{
                {"glass"},
                {"bathroom"},
                {"porcelain"},
                {"chair"},
                {"desk"},

        };
    }
}
