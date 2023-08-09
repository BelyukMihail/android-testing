package com.solvd.carina.demo.chromebrowser;

import com.solvd.carina.demo.chromebrowser.utils.Util;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.webdriver.device.Device;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ChromeBaseTest implements IAbstractTest {

    protected Util util = new Util();
}
