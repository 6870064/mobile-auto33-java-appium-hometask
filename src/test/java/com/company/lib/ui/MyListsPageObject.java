package com.company.lib.ui;

import com.company.lib.Platform;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class MyListsPageObject extends MainPageObject {

     public MyListsPageObject(RemoteWebDriver driver){
        super(driver);
    }

    protected static String
    ADD_TO_LIST_BUTTON,
    ARTICLE_LIST_TITLE,
    DELETE_FIRST_ARTICLE_TITLE,
    SECOND_ARTICLE_TITLE,
    ARTICLE_BY_TITLE_TPL,
    REMOVE_FROM_SAVED_BUTTON,
    SAVED_BUTTON;

    public void myListOpening(String articles_list_title){
        waitForElementAndClick( // Нажатие на [VIEW LIST] и открытие переченя списков статей
                ADD_TO_LIST_BUTTON,
                "Cannot open My lists screen",
                5
        );
    }

    public void swipeArticleToDelete(String article_title){
        swipeElementToTheLeft( // Удаление первой статьи
                DELETE_FIRST_ARTICLE_TITLE,
                "Cannot find saved article"
        );

        if (Platform.getInstance().isIOS() || Platform.getInstance().isAndroid()){
            this.clickElementToTheRightUpperCorner(DELETE_FIRST_ARTICLE_TITLE,"Cannot find saved article for swipe");
        } else {
            String remove_locator = getRemoveButtonByTitle(article_title);
            this.waitForElementAndClick(
                    remove_locator,
                    "Cannot click button to remove article from saved",
                    10);
        }
        if(Platform.getInstance().isMW()){
            driver.navigate().refresh();
        }

        waitForElementNotPresent(DELETE_FIRST_ARTICLE_TITLE, "Cannot delete saved article", 5);
    }

    private static String getRemoveButtonByTitle(String article_title){
        return REMOVE_FROM_SAVED_BUTTON.replace("{TITLE}", article_title);
    }

    public void articleAvailabilityCheck(String second_word_for_search){
        waitForElementPresent( // Убеждаемся, что вторая статься осталась
                SECOND_ARTICLE_TITLE,
                "Cannot find saved article titled " + second_word_for_search + "",
                10
        );

        waitForElementAndClick(  //Открытие статьи. по сути и есть верификация по тайтлу.
                SECOND_ARTICLE_TITLE,
                "Cannot open the article titled " + second_word_for_search + "",
                10
        );
    }
    public void mySavedArticlesFolderOpening(){
        waitForElementAndClick(
              SAVED_BUTTON,
                "Cannot find saved articles list",
              5);


    }
}
