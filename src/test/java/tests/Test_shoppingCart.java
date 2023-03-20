package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Test_shoppingCart {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        // Main page
        driver.get("https://www.flooranddecor.com/");
        Thread.sleep(5000);

        //Select tile
        driver.findElement(By.xpath("//*[@id=\"main-nav-tile\"]")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div[1]/main/div/section/div[4]/div[1]/div[2]/div[1]/a/div/p")).click();
        js.executeScript("window.scrollBy(0,500)", "");

        // Add sample
        driver.findElement(By.xpath("//button[contains(text(), 'Add Sample')]")).click();
        Thread.sleep(2000);

        // Cart
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/article/div[5]/a[1]")).click();



        //Zip Code
        driver.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/main/div[1]/div/div[3]/div/div[1]/div[1]/form/label/div/div[1]")).click();
        driver.findElement(By.id("dwfrm_shippingcalculator_zipcode")).sendKeys("33637");

        //Calculate shipping
        driver.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/main/div[1]/div/div[3]/div/div[1]/div[1]/form/button")).click();

        js.executeScript("window.scrollBy(0,200)", "");
        Thread.sleep(5000);

        // Checkout
        driver.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/main/div[1]/div/div[3]/div/div[1]/div[4]")).click();

        //Continue as guest
        driver.findElement(By.id("dwfrm_loginGuest_guest")).click();

        //First Name
        driver.findElement(By.id("dwfrm_addressForm_firstName")).sendKeys("Alex");

        //Last Name
        driver.findElement(By.id("dwfrm_addressForm_lastName")).sendKeys("Smith");

        //Address
        driver.findElement(By.id("dwfrm_addressForm_address1")).sendKeys("2099 Gallows Rd");

        //City
        driver.findElement(By.id("dwfrm_addressForm_city")).sendKeys("Vienna");
        js.executeScript("window.scrollBy(0,500)", "");

        //State
        js.executeScript("window.scrollBy(0,200)", "");
        driver.findElement(By.className("ss-single-selected")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"dwfrm_addressOptions\"]/article[1]/div/div/div/div[6]/div/div[1]/div/div[2]/div[2]/div[2]")).click();

        //Zip Code
        driver.findElement(By.id("dwfrm_addressForm_postalCode")).sendKeys("22182");

        //Phone Number
        driver.findElement(By.id("dwfrm_addressForm_phone")).sendKeys("571-456-7890");

        //Continue
        driver.findElement(By.id("dwfrm_addressOptions_next")).click();
        Thread.sleep(5000);

        //use this address
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[4]/button")).click();

    }
}
