package com.company.lib.ui.factories;

import com.company.lib.Platform;
import com.company.lib.ui.ArticlePageObject;
import com.company.lib.ui.android.AndroidArticlePageObject;
import com.company.lib.ui.ios.iOSArticlePageObject;
import com.company.lib.ui.mobile_web.MWArticlePageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ArticlePageObjectFactory {
    public static ArticlePageObject get(RemoteWebDriver driver){
        if(Platform.getInstance().isAndroid()){
            return new AndroidArticlePageObject(driver);
        } else if (Platform.getInstance().isIOS()){
            return new iOSArticlePageObject(driver);
        } else {
            return new MWArticlePageObject(driver);
        }
    }
}
