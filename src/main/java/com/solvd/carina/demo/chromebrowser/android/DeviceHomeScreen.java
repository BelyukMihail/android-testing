package com.solvd.carina.demo.chromebrowser.android;

import com.solvd.carina.demo.chromebrowser.common.AllAppsScreenBase;
import com.solvd.carina.demo.chromebrowser.common.ChromeHomePageBase;
import com.solvd.carina.demo.chromebrowser.common.DeviceMainScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DeviceMainScreenBase.class)
public class DeviceHomeScreen extends DeviceMainScreenBase {

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Chrome']")
    private ExtendedWebElement chromeApp;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.View")
    private ExtendedWebElement navBarBackground;

    public DeviceHomeScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public ChromeHomePageBase openChrome() {
        chromeApp.click();
        return initPage(getDriver(), ChromeHomePageBase.class);
    }

    @Override
    public void hideApplication() {
        swipe(705, 2514, 705, 1000, 5000);
    }

    @Override
    public AllAppsScreenBase goToAllAppsScreen() {
        swipeUp(50);
        return initPage(getDriver(), AllAppsScreenBase.class);
    }
}
