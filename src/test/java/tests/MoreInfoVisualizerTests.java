package tests;

import org.testng.annotations.Test;
import pages.MoreInfoVisualizerPage;
import utils.SeleniumUtils;

public class MoreInfoVisualizerTests extends TestBase{

    @Test
    public void Visualizer(){
        logger.info("Navigating to 'Floor & Decor' Home Page");
        MoreInfoVisualizerPage moreInfoVisualizer = new MoreInfoVisualizerPage();
        logger.info("Accept cookies");
        moreInfoVisualizer.acceptCookies();
        SeleniumUtils.waitForClickablility(moreInfoVisualizer.getPopUpWindow(), 15);
        logger.info("Close pop up window");
        moreInfoVisualizer.popUpWindowClick();
        SeleniumUtils.waitForClickablility(moreInfoVisualizer.getDecorativesSection(), 5);
        logger.info("Navigate to Decoratives section");
        moreInfoVisualizer.clickOnDecoratives();
        moreInfoVisualizer.clickOnSideBar();
        moreInfoVisualizer.scrollDown(moreInfoVisualizer.getVisualizerElement());
        logger.info("Navigate to Visualizer");
        moreInfoVisualizer.visualizerElementClick();
        logger.info("Get Started button click");
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
