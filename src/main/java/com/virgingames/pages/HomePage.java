package com.virgingames.pages;

import com.aventstack.extentreports.Status;
import com.virgingames.browserfactory.ManageBrowser;
import com.virgingames.customlisteners.CustomListeners;
import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"__tealiumGDPRecModal\"]/div/div/div/div[2]/label")
    WebElement necessaryCookies;

    @CacheLookup
    @FindBy(linkText = "Join Now")// find by cache lookup
    WebElement joinNowLink;

    @CacheLookup
    @FindBy(xpath = "//span[@data-tracking='{\"label\":\"Free Games\",\"section\":\"Top Nav\",\"mvtVariant\":\"\",\"mvtCampaign\":\"\"}']")
    WebElement clickOnFreeGames;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"interstitial-body\"]/h1")
    WebElement actualText;


    public void necessaryCookies(){
        Reporter.log("Clicking on necessary Cookies Tab " + necessaryCookies.toString());
        log.info("Click on necessary Cookies Tab" + necessaryCookies);
        CustomListeners.test.log(Status.PASS,"Clicking on necessary Cookies Tab");
        clickOnElement(necessaryCookies);
    }

    public void clickOnJoinNowLink() {
        Reporter.log("Clicking on Join Now link " + joinNowLink.toString());
        CustomListeners.test.log(Status.PASS,"Clicking on Join Now Link");
        clickOnElement(joinNowLink);
    }


    public void clickOnFreeGamesTab(){
        Reporter.log("Clicking on Free Games Tab " + joinNowLink.toString());
        CustomListeners.test.log(Status.PASS,"Clicking on Free Games Tab Link");
        mouseHoverToElementAndClick(clickOnFreeGames);

    }

    public String actualText(){
        String text = getTextFromElement(actualText);
        Reporter.log("Verify Text Pardon Our Interruption" + actualText.toString());
        CustomListeners.test.log(Status.PASS,"Verify Text Pardon Our Interruption");
        return text;
    }

}
