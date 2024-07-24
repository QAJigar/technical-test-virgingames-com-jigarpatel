package com.virgingames.testsuite;

import com.virgingames.customlisteners.CustomListeners;
import com.virgingames.pages.HomePage;
import com.virgingames.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
    }

    @Test
    public void clickOnFreeGames(){
        homePage.necessaryCookies();
        homePage.clickOnFreeGamesTab();
    }

    @Test
    public void clickOnJoinNowAndVerifyMassage(){
        homePage.necessaryCookies();
        homePage.clickOnJoinNowLink();
        Assert.assertEquals(homePage.actualText(), "Pardon Our Interruption","Massage Text not Match");
    }



}
