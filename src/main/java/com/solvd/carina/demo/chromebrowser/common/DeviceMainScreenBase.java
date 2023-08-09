package com.solvd.carina.demo.chromebrowser.common;

import org.openqa.selenium.WebDriver;

public abstract class DeviceMainScreenBase extends DeviceScreen {


    public DeviceMainScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract ChromeHomePageBase openChrome();

    public abstract void hideApplication();

    public abstract AllAppsScreenBase goToAllAppsScreen();

}
