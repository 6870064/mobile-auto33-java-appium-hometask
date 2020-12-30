package com.company.lib.ui.mobile_web;

import com.company.lib.ui.SearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWSearchPageObject extends SearchPageObject {
    static {
        SEARCH_INIT_ELEMENT = "css:button#searchIcon";
        SEARCH_INPUT = "css:form>input[type='search']";
        SEARCH_CANCEL_BUTTON = "css:button.cancel";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://div[contains(@class,'wikipedia-description')][contains(text(),'{SUBSTRING}')]";
        SEARCH_RESULT_BY_SUBSTRING2_TPL = "xpath://XCUIElementTypeLink[contains(@name,'German industrial metal band')]";
        SEARCH_RESULT_ELEMENT = "css:ul.page-list>li.page-summary";
        SEARCH_EMPTY_RESULT_ELEMENT = "css:p.without-results";
        SEARCH_RESULT_LOCATOR = "xpath://XCUIElementTypeLink[@name='Java (programming language) Object-oriented programming language']";
    }

    public MWSearchPageObject(RemoteWebDriver driver) {
        super(driver);
    }
}
