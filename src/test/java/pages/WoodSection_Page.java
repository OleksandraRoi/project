package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WoodSection_Page {
    public WoodSection_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"main-nav-wood\"]")
    private WebElement woodSection;

    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[1]/main/div/section/div[4]/div[1]/div[2]/div[1]")
    private WebElement woodColor;

    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[1]/main/div/section[3]/div/main/div[1]/article/div/div/div[7]")
    private WebElement woodItemSample;

    @FindBy(xpath = "//html/body/div[1]/header/div[2]/div[6]/div[1]/div/div[2]/form/input[1]")
    private WebElement searchBox;

    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[1]/main/div/section[2]/div[1]/div[3]/div/div[1]")
    private WebElement sortByButton;

    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[1]/main/div/section[2]/div[1]/div[3]/div/div[2]/div[2]/div/div[4]")
    private WebElement sortByPriceLowToHigh;

    @FindBy(xpath = "/html/body/div[1]/div[9]/div[1]/div[1]/main/div/section[2]/div[1]/div[3]/div/div[2]/div[2]/div/div[5]")
    private WebElement sortByPriceHighToLow;







    public void clickWoodSection() {
        woodSection.click();
    }

    public void clickWoodColor() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
        woodColor.click();
    }

    public void clickWoodItemSample() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        woodItemSample.click();
    }

    public void clickSearchBox() {
        searchBox.click();
        searchBox.sendKeys("wood");
        searchBox.submit();
    }

    public void clickSortByButton() {
        sortByButton.click();
    }

    public void clickSortByPriceLowToHigh() {
        sortByPriceLowToHigh.click();
    }

    public void clickSortByPriceHighToLow() {
        sortByPriceHighToLow.click();
    }



}
