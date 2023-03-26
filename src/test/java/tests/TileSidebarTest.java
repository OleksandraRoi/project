package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ApplyPage;
import pages.TileSidebar_Page;
import pages.oneTitlePage;

public class TileSidebarTest extends TestBase {

    @Test
    public void tile(){

        TileSidebar_Page tileSidebar_page = new TileSidebar_Page();
        tileSidebar_page.clickTileButton();
       Assert.assertEquals(tileSidebar_page.urlActual(),"https://www.flooranddecor.com/tile");

    }

    }
