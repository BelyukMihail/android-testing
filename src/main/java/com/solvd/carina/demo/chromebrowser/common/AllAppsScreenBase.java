package com.solvd.carina.demo.chromebrowser.common;

import org.openqa.selenium.WebDriver;

public abstract class AllAppsScreenBase extends DeviceScreen {

    public AllAppsScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract SettingsScreenBase openSettings();

    public abstract CameraScreenBase openCamera();

}
