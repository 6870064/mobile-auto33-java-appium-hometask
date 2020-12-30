package com.company.lib.ui.mobile_web;

import com.company.lib.ui.MyListsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWListMyPageObject extends MyListsPageObject {

    static {
        DELETE_FIRST_ARTICLE_TITLE = "xpath://XCUIElementTypeLink[contains(@name='{TITLE}')]";
        SECOND_ARTICLE_TITLE =  "id:Rammstein";
        REMOVE_FROM_SAVED_BUTTON = "xpath://ul[contains(@class,'watchlist')]//h3[contains(text(),'{TITLE}')]/../../div[contains(@class,'watched')]";
        SAVED_BUTTON = "id:Saved";
    }

    public MWListMyPageObject(RemoteWebDriver driver){
        super(driver);
    }
}
