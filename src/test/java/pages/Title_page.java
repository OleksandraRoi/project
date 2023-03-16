package pages;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Title_page {
private List<WebElement>allTitles = Driver.getDriver().findElements(By.className("b-categories_navigation-item_1"));
private String currentLink = "https://www.flooranddecor.com/";
    public void OpenEachTitle(){
        List<String > nameOfAllTitle = new ArrayList<>();
        for(WebElement one:allTitles)
            nameOfAllTitle.add(one.getText());

        for(String one:nameOfAllTitle){
            Driver.getDriver().findElement(By.linkText(one)).click();
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.flooranddecor.com/"));
        }
    }
}


