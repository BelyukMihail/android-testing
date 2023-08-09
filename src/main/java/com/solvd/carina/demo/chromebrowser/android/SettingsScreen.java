package com.solvd.carina.demo.chromebrowser.android;

import com.solvd.carina.demo.chromebrowser.common.SettingsScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SettingsScreenBase.class)
public class SettingsScreen extends SettingsScreenBase {

    public SettingsScreen(WebDriver driver) {
        super(driver);
    }
}
