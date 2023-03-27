package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SearchBarPage {

    public SearchBarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='q']")
    private WebElement search;

    @FindBy(xpath = "//button[@name='search-button']")
    private WebElement searchB;


    public void searchButton(String name){
        search.sendKeys(name);
        search.sendKeys(Keys.DOWN,Keys.ENTER);

    }
    public void searchButton1(){
        searchB.click();

    }

}
