package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import tests.TestBase;
import utils.Driver;
import utils.SeleniumUtils;

import javax.swing.text.Utilities;
import java.util.List;
import java.util.Map;

public class oneTitlePage{
    public void test(String nameOfTitle,String findElement){
        SeleniumUtils.hover(Driver.getDriver().findElement(By.linkText(nameOfTitle)));
        try {
            Thread.sleep(1000);
            Driver.getDriver().findElement(By.partialLinkText(findElement)).click();
        }catch (Exception e){
            e.getMessage();
        }
        List<WebElement>pages = Driver.getDriver().findElements(By.xpath("//*[@class=\"b-product_tile-title\"]"));
        for(WebElement onePage :pages){
            System.out.println(onePage.getText());
            Assert.assertTrue(onePage.getText().contains(findElement));
        }
    }

}
