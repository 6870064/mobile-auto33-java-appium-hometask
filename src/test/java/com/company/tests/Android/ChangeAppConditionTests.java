package com.company.tests.Android;

import com.company.lib.CoreTestCase;
import com.company.lib.Platform;
import com.company.lib.ui.ArticlePageObject;
import com.company.lib.ui.SearchPageObject;
import com.company.lib.ui.factories.ArticlePageObjectFactory;
import com.company.lib.ui.factories.SearchPageObjectFactory;
import io.appium.java_client.AppiumDriver;
import org.junit.Test;

import java.time.Duration;

public class ChangeAppConditionTests extends CoreTestCase {

    String articles_list_title = "1-st articles list for reading";
    String articles_list_description = "1-st articles list for reading description";
    String first_word_for_search = "Java";
    String first_word_for_search_description = "Object-oriented programming language";
    String second_word_for_search = "Rammstein";
    String second_word_for_search_description = "German industrial metal band";
    String word_for_empty_search = "zedqazss pewwqsd frtd zzz";

    @Test
    public void testChangeScreenOrientationOnSearchResults() {
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);

        if (driver instanceof AppiumDriver) {
            AppiumDriver driver = (AppiumDriver) this.driver;
            SearchPageObject.typeSkipElement();
        } else {
            System.out.println("Method SearchPageObject() does nothing for platform " + Platform.getInstance().getPlatformVar());
        }
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine(first_word_for_search);
        SearchPageObject.clickByArticleWithSubstring(first_word_for_search_description);

        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);
        String title_before_rotation = ArticlePageObject.getArticleTitle();
        this.rotateScreenLandscape();
        String title_after_rotation = ArticlePageObject.getArticleTitle();

        assertEquals(
                "Article title has been changed after screen rotation",
                title_before_rotation,
                title_after_rotation
        );

        this.rotateScreenPortrait();
        String title_after_second_rotation = ArticlePageObject.getArticleTitle();

        assertEquals(
                "Article title has been changed after screen rotation",
                title_before_rotation,
                title_after_second_rotation
        );
    }

    @Test
    public void testCheckSearchArticleInBackground(){

        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);

        if (driver instanceof AppiumDriver) {
            AppiumDriver driver = (AppiumDriver) this.driver;
            SearchPageObject.typeSkipElement();
        } else {
            System.out.println("Method SearchPageObject() does nothing for platform " + Platform.getInstance().getPlatformVar());
        }
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine(first_word_for_search);
        SearchPageObject.clickByArticleWithSubstring(first_word_for_search_description);
        this.backgroundApp(Duration.ofSeconds(3));;
        SearchPageObject.clickByArticleWithSubstring(first_word_for_search_description);
    }
}
