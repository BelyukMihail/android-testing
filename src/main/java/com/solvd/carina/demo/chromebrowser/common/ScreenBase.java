package com.solvd.carina.demo.chromebrowser.common;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class ScreenBase extends AbstractPage implements IMobileUtils {

    public ScreenBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_URL_AND_ELEMENT);
    }

    public void scrollToElement(ExtendedWebElement element, int scrollDuration) {
        int swipeCount = 0;
        while (!element.isVisible()) {
            swipeUp(scrollDuration);
            swipeCount++;
            if (swipeCount == 10) {
                throw new RuntimeException("Swipe limit reached");
            }
        }
    }
}
