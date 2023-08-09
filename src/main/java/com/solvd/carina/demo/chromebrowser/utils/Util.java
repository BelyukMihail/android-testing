package com.solvd.carina.demo.chromebrowser.utils;

import com.solvd.carina.demo.chromebrowser.common.ChromeHomePageBase;
import com.solvd.carina.demo.chromebrowser.common.KarasHomePageBase;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Util implements ICustomTypePageFactory {

    public KarasHomePageBase openWebSiteAndLogin(String siteUrl, String email, String password) {
        ChromeHomePageBase chromeHomePageBase = initPage(getDriver(), ChromeHomePageBase.class);
        chromeHomePageBase
                .goToWebsite(siteUrl)
                .scrollToUserAccountLinkAndClick()
                .login(email, password)
                .goToHomePage();
        return initPage(getDriver(), KarasHomePageBase.class);
    }

    public void toHomeScreen() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setPlatform(Platform.ANDROID);
        capabilities.setCapability("automationName", "uiautomator2");
        AndroidDriver androidDriver = new AndroidDriver(capabilities);
        androidDriver.pressKey(new KeyEvent(AndroidKey.HOME));
    }
}
