package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TileSidebarTest;
import utils.Driver;
import utils.SeleniumUtils;

import java.util.List;

import static org.openqa.selenium.By.className;

public class TileSidebar_Page {

    public TileSidebar_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id = "main-nav-tile")
    private WebElement tilebotton;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptAllCookiesButton;

    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[1]/main/div/aside/div/div/div[2]/div[1]/div[1]")
    private WebElement coloTab;


    public void clickTileButton () {
        tilebotton.click();
    }
        public String urlActual () {
        return Driver.getDriver().getCurrentUrl();
        }
        public void clickColorTab () {
            coloTab.click();
        }



            }

