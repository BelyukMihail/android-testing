package com.solvd.carina.demo.android;

import com.solvd.carina.demo.common.KarasHomePageBase;
import com.solvd.carina.demo.common.KarasUserAccountPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = KarasUserAccountPageBase.class)
public class KarasUserAccountPage extends KarasUserAccountPageBase {

    @FindBy(xpath = "//*[contains(@content-desc,'karas.by, Минск')]")
    private ExtendedWebElement logo;

    public KarasUserAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public KarasHomePageBase goToHomePage() {
        logo.click();
        return initPage(getDriver(),KarasHomePageBase.class);
    }


}
