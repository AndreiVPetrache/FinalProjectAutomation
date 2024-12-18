package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "fc-button-background")
    private WebElement cookiesConsent;
    @FindBy(xpath = "//a[text()=' Signup / Login']")
    private WebElement loginSignupButton;
    @FindBy(xpath = "//a[text()=' Products']")
    private WebElement goToProductPage;

    public void consentCookies(){
        elementMethods.clickJSElement(cookiesConsent);
        LoggerUtility.infoLog("User accepts cookies");

    }

    public void goToLoginPage(){
        elementMethods.clickJSElement(loginSignupButton);
        LoggerUtility.infoLog("User clicks on the Signup/ Login button");
    }

    public void goToProductPage(){
        elementMethods.clickJSElement(goToProductPage);
        LoggerUtility.infoLog("User clicks on the Signup/ Login button");
    }


}
