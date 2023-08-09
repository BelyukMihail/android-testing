package com.solvd.carina.demo.chromebrowser.common;

import org.openqa.selenium.WebDriver;

public abstract class KarasUserAccountPageBase extends WebPageScreen {

    public KarasUserAccountPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract KarasHomePageBase goToHomePage();
}
