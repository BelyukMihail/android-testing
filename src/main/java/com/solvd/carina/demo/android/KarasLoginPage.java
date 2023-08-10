package com.solvd.carina.demo.android;

import com.solvd.carina.demo.common.KarasLoginPageBase;
import com.solvd.carina.demo.common.KarasUserAccountPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = KarasLoginPageBase.class)
public class KarasLoginPage extends KarasLoginPageBase {

    @FindBy(xpath = "//*[@text='Войти']")
    private ExtendedWebElement loginBtn;

    @FindBy(xpath = "//*[@id='input-email']")
    private ExtendedWebElement emailField;


    @FindBy(xpath = "//*[@id='input-password']")
    private ExtendedWebElement passwordField;

    public KarasLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void scrollToEnterCredentialsBlock() {
        scrollToElement(loginBtn, 2000);
    }

    @Override
    public void enterEmail(String email) {
        emailField.type(email);
    }

    @Override
    public void enterPassword(String password) {
        passwordField.type(password);
    }

    @Override
    public void clickLoginBtn() {
        loginBtn.click();
    }

    @Override
    public KarasUserAccountPageBase login(String email, String password) {
        scrollToEnterCredentialsBlock();
        switchContext("CHROMIUM");
        System.out.println(getAvailableContexts());
        enterEmail(email);
        enterPassword(password);
        hideKeyboard();
        switchContext("NATIVE_APP");
        clickLoginBtn();
        return initPage(getDriver(), KarasUserAccountPageBase.class);
    }
}
