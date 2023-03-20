package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_cartSamples {
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

        // Add sample #1
        driver.findElement(By.xpath("//button[contains(text(), 'Add Sample')]")).click();
        Thread.sleep(5000);

        // Continue Shopping
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/article/div[5]/a[2]")).click();

        // Add sample #2
        driver.findElement(By.xpath("//button[contains(text(), 'Add Sample')]")).click();
        Thread.sleep(5000);

        // Cart
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/article/div[5]/a[1]")).click();
        Thread.sleep(5000);

        // Calculate Zip Code Shipping
        driver.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/main/div[1]/div/div[3]/div/div[1]/div[1]/form/button")).click();

        // Remove items
        driver.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/main/div[1]/div/div[2]/div/section/article/div/div[10]/div/form/button")).click();




    }
}
