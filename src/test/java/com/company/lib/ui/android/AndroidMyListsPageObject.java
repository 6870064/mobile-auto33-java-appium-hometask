package com.company.lib.ui.android;
import com.company.lib.ui.MyListsPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidMyListsPageObject extends MyListsPageObject {

    static {
    ADD_TO_LIST_BUTTON = "id:org.wikipedia:id/snackbar_action";
    ARTICLE_LIST_TITLE = "xpath://android.widget.TextView[@text='1-st articles list for reading']";
    DELETE_FIRST_ARTICLE_TITLE = "xpath://*[@text='Object-oriented programming language']";
    SECOND_ARTICLE_TITLE =  "xpath://*[@resource-id='org.wikipedia:id/page_list_item_title'][@text='Rammstein']";
    }

    public AndroidMyListsPageObject(RemoteWebDriver driver){
        super(driver);
    }
}
