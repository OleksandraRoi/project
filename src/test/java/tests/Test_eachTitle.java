package tests;

import org.testng.annotations.Test;
import pages.oneTitlePage;
import utils.SeleniumUtils;

import javax.swing.text.Utilities;

public class Test_eachTitle extends TestBase{
    @Test
    public void test1(){
        new oneTitlePage().test("TILE","Porcelain");
    }
    @Test
    public void test2(){
        new oneTitlePage().test("STONE","Marble");
    }
    @Test
    public void test3(){
        new oneTitlePage().test("WOOD","Oak");
    }
    @Test
    public void test4(){
        new oneTitlePage().test("LAMINATE","Waterproof");
    }
    @Test
    public void test5(){
        new oneTitlePage().test("VINYL","Vinyl");
    }
    @Test
    public void test6(){
        new oneTitlePage().test("DECORATIVES","Pebble");
    }
    @Test
    public void test7(){
        new oneTitlePage().test("FIXTURES","Mirror");
    }
    @Test
    public void test8(){
        new oneTitlePage().test("INSTALLATION MATERIALS","Mapei");
    }
}