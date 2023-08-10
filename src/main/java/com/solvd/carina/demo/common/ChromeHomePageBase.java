package com.solvd.carina.demo.common;

import org.openqa.selenium.WebDriver;


public abstract class ChromeHomePageBase extends WebPageScreen {

    public ChromeHomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean checkIfGoogleLogoIsPresent();

    public abstract void hideApplication() throws InterruptedException;

    public abstract void enterSearchData(String searchData) throws InterruptedException;

    public abstract void confirmUrlBarInput();

    public abstract void openChromeMenu();

    public abstract void clickIncognitoMode();

    public abstract void openChromeIncognito();

    public abstract void enterUrl(String url);

    public abstract KarasHomePageBase goToWebsite(String url);

}
