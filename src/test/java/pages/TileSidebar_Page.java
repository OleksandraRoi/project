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

    @FindBy(id = "main-nav-tile")
    private WebElement tilebotton;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptAllCookiesButton;


    @FindBy(xpath = "(//div[ contains(text(), 'Color' )])[1]")
//    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[1]/main/div/aside/div/div/div[2]/div[1]/div[1]")
    private WebElement coloTab;

   @FindBy (xpath ="/html/body/div[1]/div[9]/div[1]/div[1]/main/div/aside/div/div/div[2]/div[2]/div[1]")
        private WebElement approximateSize;

   @FindBy (xpath = "/html/body/div[1]/div[9]/div[1]/div[1]/main/div/aside/div/div/" +
           "div[2]/div[1]/div[3]/div[3]/label")
   private WebElement whiteColor;

   @FindBy (xpath = "/html/body/div[1]/div[9]/div[1]/div[1]/main/div/" +
           "section[2]/div[1]/div[3]/div/div[1]/span[1]")
   private WebElement sortBy;

   @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[1]/main/div/section[2]/ div[1]/div[3]/div/div[2]/div[2]/div/div[3]" )
           private WebElement trending;



  @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[1]/main/div/section[3]/div/main/div[4]/article/div/div/div[7]/form/button")
       private WebElement submitSampleButton;

  @FindBy(xpath = "a[title='View Cart']")
  private WebElement vewCart;


    public void clickTileButton() {
        tilebotton.click();
    }

    public String urlActual() {
        return Driver.getDriver().getCurrentUrl();
    }

    public void clickColorTab() {
        coloTab.click();
    }
    public void clickApproximateSize(){approximateSize.click(); }

    public void clickWhiteColor() {
        whiteColor.click();
    }
        public void clickSortBy() {
            sortBy.click();
        }
            public void clickTrending(){
                trending.click();
            }

            public void clickAddSampleButton() {
                submitSampleButton.submit();

            }
            public void clickVewCart(){
             vewCart.click();

            }
        }






