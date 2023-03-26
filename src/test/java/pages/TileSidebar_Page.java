package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TileSidebarTest;
import utils.Driver;
import utils.SeleniumUtils;

import static org.openqa.selenium.By.className;

public class TileSidebar_Page {

    public TileSidebar_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
       @FindBy (id = "main-nav-tile")
       private WebElement tilebotton;



    public void clickTileButton () {
        tilebotton.click();
    }
        public String urlActual () {
            return Driver.getDriver().getCurrentUrl();
        }
    }