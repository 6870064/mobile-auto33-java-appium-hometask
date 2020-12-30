package com.company.lib.ui.factories;

import com.company.lib.Platform;
import com.company.lib.ui.SearchPageObject;
import com.company.lib.ui.android.AndroidSearchPageObject;
import com.company.lib.ui.ios.iOSSearchPageObject;
import com.company.lib.ui.mobile_web.MWSearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchPageObjectFactory {
    public static SearchPageObject get(RemoteWebDriver driver){

        if(Platform.getInstance().isAndroid()) {
            return new AndroidSearchPageObject(driver);
        } else if (Platform.getInstance().isIOS()){
            return new iOSSearchPageObject(driver);
        } else {
            return new MWSearchPageObject(driver);
        }
    }
}
