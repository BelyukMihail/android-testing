package com.solvd.carina.demo.chromebrowser.android;

import com.solvd.carina.demo.chromebrowser.common.ChromeHomePageBase;
import com.solvd.carina.demo.chromebrowser.common.KarasHomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ChromeHomePageBase.class)
public class ChromeHomePage extends ChromeHomePageBase {

    @FindBy(id = "com.android.chrome:id/search_provider_logo")
    private ExtendedWebElement googleLogo;

    @FindBy(id = "com.android.chrome:id/search_box_text")
    private ExtendedWebElement searchField;

    @FindBy(id = "com.android.chrome:id/url_bar")
    private ExtendedWebElement urlBar;

    @FindBy(id = "android:id/alertTitle")
    private ExtendedWebElement alertTitle;

    @FindBy(id = "android:id/aerr_close")
    private ExtendedWebElement closeAppPopupBtn;

    @FindBy(id = "com.android.chrome:id/menu_button")
    private ExtendedWebElement chromeMenuBtn;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='New Incognito tab']")
    private ExtendedWebElement newIncognitoTabBtn;

    public ChromeHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean checkIfGoogleLogoIsPresent() {
        return googleLogo.isVisible() && googleLogo.isPresent();
    }

    @Override
    public void hideApplication() throws InterruptedException {
        Thread.sleep(500);
        swipe(705, 2514, 705, 1000, 500);
    }

    @Override
    public void enterSearchData(String searchData) {
        switchContext("NATIVE_APP");
        while (alertTitle.isPresent()) {
            closeAppPopupBtn.click();
        }
        searchField.type(searchData);
    }

    @Override
    public void confirmUrlBarInput() {
        new Actions(getDriver()).sendKeys(Keys.ENTER).perform();
    }

    @Override
    public void openChromeMenu() {
        switchContext("NATIVE_APP");
        chromeMenuBtn.click();
    }

    @Override
    public void clickIncognitoMode() {
        newIncognitoTabBtn.click();
    }

    @Override
    public void openChromeIncognito() {
        openChromeMenu();
        clickIncognitoMode();
    }

    @Override
    public void enterUrl(String url) {
        switchContext("NATIVE_APP");
        if (searchField.isVisible()) {
            searchField.click();
            urlBar.type(url);
        } else {
            urlBar.click();
            urlBar.type(url);
        }
    }

    @Override
    public KarasHomePageBase goToWebsite(String url) {
        enterUrl(url);
        new Actions(getDriver()).sendKeys(Keys.ENTER).perform();
        return initPage(getDriver(), KarasHomePageBase.class);
    }
}
