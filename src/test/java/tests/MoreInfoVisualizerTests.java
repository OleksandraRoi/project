package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MoreInfoVisualizerPage;
import utils.Driver;
import utils.SeleniumUtils;

public class MoreInfoVisualizerTests extends TestBase{

    @Test(groups = {"regression"})
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
        logger.info("Switch to Iframe");
        SeleniumUtils.switchToIframe(moreInfoVisualizer.getIframe());
        String pageSource = Driver.getDriver().getPageSource();
        String text = moreInfoVisualizer.getText().getText();
        logger.info("Check if it contains the text");
        Assert.assertTrue(pageSource.contains(text));



//        SeleniumUtils.scroll(500, 500);
//        SeleniumUtils.waitForClickablility(moreInfoVisualizer.getBathroomPic(), 5);
//        moreInfoVisualizer.bathroomPicClick();

        //SeleniumUtils.switchToWindow("Visualizer | Floor & Decor");
        //moreInfoVisualizer.iframeSwitch();
        //SeleniumUtils.switchToWindow("GET STARTED NOW");
        //SeleniumUtils.waitForVisibility(moreInfoVisualizer.getUploadButton(),5);
        //moreInfoVisualizer.uploadButtonClick();

    }
}
