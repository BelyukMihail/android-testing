package com.solvd.carina.demo.chromebrowser;

import com.solvd.carina.demo.chromebrowser.common.AllAppsScreenBase;
import com.solvd.carina.demo.chromebrowser.common.CameraScreenBase;
import com.solvd.carina.demo.chromebrowser.common.DeviceMainScreenBase;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.time.Duration;

public class ChromeTest extends ChromeBaseTest {
//
//    @Test
//    public void openChromeTest() {
//        ChromeHomePageBase chromeHomePageBase = initPage(getDriver(), ChromeHomePageBase.class);
//        chromeHomePageBase.openChromeMenu();
//    }
//
//    @Test
//    public void testSearch() throws InterruptedException {
//        String email = "swat60@yandex.ru";
//        String password = "5cece780d4";
//        ChromeHomePageBase chromeHomeScreen = initPage(getDriver(), ChromeHomePageBase.class);
//        chromeHomeScreen.enterSearchData("https://karas.by/");
//        chromeHomeScreen.confirmUrlBarInput();
//        KarasHomePageBase karasHomeScreen = initPage(getDriver(), KarasHomePageBase.class);
//        karasHomeScreen.closeLangChoicePopup();
//        KarasLoginPageBase loginPageBase = karasHomeScreen.scrollToUserAccountLinkAndClick();
//        loginPageBase.login(email, password);
//    }
//
//    @Test
//    public void openBrowserInIncognitoModeTest() {
//        ChromeHomePageBase chromeHomeScreen = initPage(getDriver(), ChromeHomePageBase.class);
//        KarasHomePageBase karasHomePageBase = chromeHomeScreen.goToWebsite("https://karas.by");
//        KarasLoginPageBase loginPageBase = karasHomePageBase.scrollToUserAccountLinkAndClick();
//        loginPageBase.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));
//    }
//
//    @Test
//    public void goToWebsiteLoginAndRedirectToMainPageTest() {
//        KarasHomePageBase karasHomePage = util.openWebSiteAndLogin(R.TESTDATA.get("siteUrl"),
//                R.TESTDATA.get("email"),
//                R.TESTDATA.get("password"));
//    }

    @Test
    public void openAllAppsTest() throws IOException {
        DeviceMainScreenBase deviceMainScreen = initPage(getDriver(), DeviceMainScreenBase.class);
        AllAppsScreenBase allAppsScreen = deviceMainScreen.goToAllAppsScreen();
        allAppsScreen.openSettings();
        Runtime.getRuntime().exec("adb emu restart");
    }

    @Test
    public void testCamera() throws IOException {
        DeviceMainScreenBase deviceMainScreen = initPage(getDriver(), DeviceMainScreenBase.class);
        AllAppsScreenBase allAppsScreen = deviceMainScreen.goToAllAppsScreen();
        CameraScreenBase cameraScreen = allAppsScreen.openCamera();
        cameraScreen.changeCameraModeToVideo();
        cameraScreen.pressShatter();
        cameraScreen.pressShatter();
        Runtime.getRuntime().exec("adb emu restart");
    }
}
