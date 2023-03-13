package tests;

import org.junit.Test;
import org.openqa.selenium.By;

import utils.Driver;

public class Open {

    @Test
    public void tryOpen(){
      Driver.getDriver().findElement(By.xpath("//div[@class=\"b-cart\"]")).click();

    }
}
