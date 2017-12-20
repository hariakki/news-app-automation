package com.telegraph.qa.screens;

import com.telegraph.qa.driver.SharedDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageScreen extends SharedDriver{

    @iOSXCUITFindBy(id = "Onboarding/welcome_bg")
    @AndroidFindBy(id = "")
    private MobileElement welcomeScreen;

    @iOSXCUITFindBy(id = "Close")
    @AndroidFindBy(id = "uk.co.telegraph.android.test:id/btn_welcome_close")
    private MobileElement skipButton;

    @iOSXCUITFindBy(id = "The fastest, easiest way to get the news that matters to you")
    @AndroidFindBy(id = "uk.co.telegraph.android.test:id/imageView4")
    private MobileElement welcomeText;

    public LandingPageScreen () { PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);}

    public MobileElement getWelcomeScreen() {return welcomeScreen;}
    public MobileElement getSkipButton() {return skipButton;}
    public MobileElement getWelcomeText() { return welcomeText;}


    public void isWelcomescreenDisplayed () { isElementVisible(welcomeScreen);}
    public void isSkipButtonDisplayed () { isElementVisible(skipButton);}
    public void isWelcomeTextDisplayed () {isElementVisible(welcomeText);}



    public void clickSkipButton () {click(skipButton);}
}