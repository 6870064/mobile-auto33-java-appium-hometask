package com.company.lib.ui;
import com.company.lib.Platform;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class NavigationUI extends MainPageObject{

    protected static String
    SEARCH_CANCEL_BUTTON,
    BACK_BUTTON,
    OPEN_NAVIGATION,
    MY_LISTS_LINK,
    EXPLORE_BUTTON;

    public NavigationUI(RemoteWebDriver driver){
        super(driver);
    }

    public void backNavigation(){

        if (driver instanceof AppiumDriver) {
            AppiumDriver driver = (AppiumDriver) this.driver;

            if (Platform.getInstance().isAndroid()) {
                driver.hideKeyboard();
                this.waitForElementAndClick(SEARCH_CANCEL_BUTTON, "Cannot find and click '[x] button'", 5);
            } else {
                this.waitForElementAndClick(
                        BACK_BUTTON,
                        "Cannot tap [<] Back button to close pop up",
                        12);
            }
        }
    }
    public void openNavigation() {
        if (Platform.getInstance().isMW()){
            this.waitForElementAndClick(OPEN_NAVIGATION, "Cannot find and clicl open navigation button", 5);
        } else {
            System.out.println("Method openNavigation() does nothing for platform " +Platform.getInstance().getPlatformVar());
        }
    }

    public void clickMyLists(){
        if (Platform.getInstance().isMW()){
            this.tryClickElementWithFewAttempts(MY_LISTS_LINK, "Cannot find navigation button to my list", 5);
        }
    }
}
