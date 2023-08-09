package com.solvd.carina.demo.chromebrowser.common;

import org.openqa.selenium.WebDriver;

public abstract class CameraScreenBase extends DeviceScreen{

    public CameraScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void changeCameraModeToVideo();

    public abstract void pressShatter();

}
