package com.solvd.carina.demo;

import com.solvd.carina.demo.common.AllAppsScreenBase;
import com.solvd.carina.demo.common.DeviceMainScreenBase;
import org.testng.annotations.Test;

public class ChromeTest extends ChromeBaseTest {

    @Test
    public void openAllAppsTest() {
        DeviceMainScreenBase deviceMainScreen = initPage(getDriver(), DeviceMainScreenBase.class);
        AllAppsScreenBase allAppsScreen = deviceMainScreen.goToAllAppsScreen();
        allAppsScreen.openSettings();
    }
}
