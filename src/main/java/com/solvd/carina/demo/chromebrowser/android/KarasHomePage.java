package com.solvd.carina.demo.chromebrowser.android;

import com.solvd.carina.demo.chromebrowser.common.KarasHomePageBase;
import com.solvd.carina.demo.chromebrowser.common.KarasLoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = KarasHomePageBase.class)
public class KarasHomePage extends KarasHomePageBase {

    @FindBy(id = "com.android.chrome:id/infobar_close_button")
    private ExtendedWebElement changeLangPopupCloseBtn;

    @FindBy(xpath = "//*[contains(@text,'Личный Кабинет') and @class='android.view.View']")
    private ExtendedWebElement userAccountLink;

    public KarasHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void closeLangChoicePopup() {
        if (changeLangPopupCloseBtn.isPresent()) {
            changeLangPopupCloseBtn.click();
        }
    }

    @Override
    public KarasLoginPageBase scrollToUserAccountLinkAndClick() {
        scrollToElement(userAccountLink,50);
        int xLocation = userAccountLink.getLocation().getX();
        int yLocation = userAccountLink.getLocation().getY();
        tap(xLocation, yLocation, 1);
        return initPage(getDriver(), KarasLoginPageBase.class);
    }
}
