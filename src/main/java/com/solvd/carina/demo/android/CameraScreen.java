package com.solvd.carina.demo.android;

import com.solvd.carina.demo.common.CameraScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CameraScreenBase.class)
public class CameraScreen extends CameraScreenBase {

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Switch to Camera Mode']")
    private ExtendedWebElement changeToCameraModeBtn;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Switch to Video Camera']")
    private ExtendedWebElement changeToVideoCameraBtn;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Shutter']")
    private ExtendedWebElement shatterBtn;

    public CameraScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public void changeCameraModeToVideo() {
        swipeRight(1000);
        changeToVideoCameraBtn.click();
    }

    @Override
    public void pressShatter() {
        shatterBtn.click();
    }
}
