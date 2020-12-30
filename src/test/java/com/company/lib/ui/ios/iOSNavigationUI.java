package com.company.lib.ui.ios;

import com.company.lib.ui.NavigationUI;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSNavigationUI extends NavigationUI {

    static {
        BACK_BUTTON = "id:Back";
        EXPLORE_BUTTON = "id:Explore";
    }

   public iOSNavigationUI(RemoteWebDriver driver){
       super(driver);
   }
}
