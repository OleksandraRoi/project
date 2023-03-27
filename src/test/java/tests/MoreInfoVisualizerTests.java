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
        SeleniumUtils.waitFor(8);
        //moreInfoVisualizer.iframeSwitch();
        SeleniumUtils.switchToWindow("GET STARTED NOW");
       // SeleniumUtils.switchToWindow("Visualizer | Floor & Decor");
        //SeleniumUtils.waitForVisibility(moreInfoVisualizer.getUploadButton(),5);
        //moreInfoVisualizer.uploadButtonClick();
        SeleniumUtils.scroll(1000, 1000);
        //moreInfoVisualizer.bathroomPicClick();
    }
}
