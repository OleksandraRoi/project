package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Title_page;
import utils.Driver;

import javax.net.ssl.KeyManager;
import java.awt.*;

public class Title_testCase1 extends TestBase{
    @Test
public void test1()  {
    new Title_page().OpenEachTitle();
}
}
