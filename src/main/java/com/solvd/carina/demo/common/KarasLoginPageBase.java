package com.solvd.carina.demo.common;

import org.openqa.selenium.WebDriver;

public abstract class KarasLoginPageBase extends WebPageScreen {

    public KarasLoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void scrollToEnterCredentialsBlock();

    public abstract void enterEmail(String email);

    public abstract void enterPassword(String password);

    public abstract void clickLoginBtn();

    public abstract KarasUserAccountPageBase login(String email, String password);

}
