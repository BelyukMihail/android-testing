package com.solvd.carina.demo.common;

import org.openqa.selenium.WebDriver;

public abstract class KarasHomePageBase extends WebPageScreen {

    public KarasHomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void closeLangChoicePopup();

    public abstract KarasLoginPageBase scrollToUserAccountLinkAndClick();
}
