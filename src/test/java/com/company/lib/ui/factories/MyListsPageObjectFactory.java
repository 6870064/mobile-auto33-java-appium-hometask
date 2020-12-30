package com.company.lib.ui.factories;

import com.company.lib.Platform;
import com.company.lib.ui.MyListsPageObject;
import com.company.lib.ui.android.AndroidMyListsPageObject;
import com.company.lib.ui.ios.iOSMyListsPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyListsPageObjectFactory {
    public static MyListsPageObject get(RemoteWebDriver driver){
        if(Platform.getInstance().isAndroid()){
            return new AndroidMyListsPageObject(driver);
        } else {
            return new iOSMyListsPageObject(driver);
        }
    }
}
