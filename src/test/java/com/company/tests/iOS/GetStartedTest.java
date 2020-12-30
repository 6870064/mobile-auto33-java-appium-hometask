package com.company.tests.iOS;

import com.company.lib.CoreTestCase;
import com.company.lib.Platform;
import com.company.lib.ui.WelcomePageObject;
import org.junit.Test;

public class GetStartedTest extends CoreTestCase {

    @Test
    public void testPassThroughWelcome() {

        if (Platform.getInstance().isAndroid()){
            return;
        }

    WelcomePageObject WelcomePage = new WelcomePageObject(driver);
    WelcomePage.waitForLearnMoreLink();
    WelcomePage.clickNextButton();
    WelcomePage.waitForNewWayToExploreText();
    WelcomePage.clickNextButton();
    WelcomePage.waitForAddOrEditPreferredLangText();
    WelcomePage.clickNextButton();
    WelcomePage.waitForLearnMoreAboutDataCollectedLink();
    WelcomePage.clickGetStartedButton();
    }
}
