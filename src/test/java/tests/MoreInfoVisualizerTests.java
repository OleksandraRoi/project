package tests;

import org.testng.annotations.Test;
import pages.MoreInfoVisualizerPage;
import utils.SeleniumUtils;

public class MoreInfoVisualizerTests extends TestBase{

    @Test
    public void Visualizer(){
        MoreInfoVisualizerPage moreInfoVisualizer = new MoreInfoVisualizerPage();
        moreInfoVisualizer.acceptCookies();
        SeleniumUtils.waitForClickablility(moreInfoVisualizer.getPopUpWindow(), 15);
        moreInfoVisualizer.popUpWindowClick();
        SeleniumUtils.waitForClickablility(moreInfoVisualizer.getDecorativesSection(), 5);
        moreInfoVisualizer.clickOnDecoratives();
        moreInfoVisualizer.clickOnSideBar();
        moreInfoVisualizer.scrollDown(moreInfoVisualizer.getVisualizerElement());
        moreInfoVisualizer.visualizerElementClick();
        moreInfoVisualizer.getStartedButtonClcik();
    }
}
