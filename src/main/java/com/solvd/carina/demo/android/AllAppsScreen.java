package com.solvd.carina.demo.android;

import com.solvd.carina.demo.common.AllAppsScreenBase;
import com.solvd.carina.demo.common.CameraScreenBase;
import com.solvd.carina.demo.common.SettingsScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AllAppsScreenBase.class)
public class AllAppsScreen extends AllAppsScreenBase {

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Settings']")
    private ExtendedWebElement settings;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Camera']")
    private ExtendedWebElement camera;

    public AllAppsScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public SettingsScreenBase openSettings() {
        settings.click();
        return initPage(getDriver(), SettingsScreenBase.class);
    }

    @Override
    public CameraScreenBase openCamera() {
        camera.click();
        return initPage(getDriver(), CameraScreenBase.class);
    }

}
