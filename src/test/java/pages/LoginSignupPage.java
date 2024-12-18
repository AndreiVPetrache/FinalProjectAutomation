package pages;

import loggerUtility.LoggerUtility;
import modelObject.LoginModel;
import modelObject.RegisterModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSignupPage extends BasePage {

    public LoginSignupPage(WebDriver driver) {super (driver);}

    @FindBy (xpath = "//input[@data-qa='signup-name']")
    private WebElement userName;
    @FindBy (xpath = "//input[@data-qa='signup-email']")
    private WebElement userEmail;
    @FindBy (xpath = "//button[@data-qa='signup-button']")
    private WebElement signupButton;
    @FindBy (xpath = "//input[@data-qa='login-email']")
    private WebElement existentUserEmail;
    @FindBy (xpath = "//input[@data-qa='login-password']")
    private WebElement existentUserPassword;
    @FindBy (xpath = "//button[@data-qa='login-button']")
    private  WebElement loginButton;


    public void inputNewUserCredentials(RegisterModel testData){
        elementMethods.fillElement(userName, testData.getUserName());
        LoggerUtility.infoLog("User inputs their username");

        elementMethods.fillElement(userEmail, testData.getUserEmail());
        LoggerUtility.infoLog("User inputs their email address");

        elementMethods.clickJSElement(signupButton);
        LoggerUtility.infoLog("User clicks on submit");

    }

    public void inputExistentUserCredentials(LoginModel testData){

        elementMethods.fillElement(existentUserEmail, testData.getRegisteredUserEmail());
        LoggerUtility.infoLog("User inputs their email address");
        elementMethods.fillElement(existentUserPassword, testData.getRegisteredUserPassword());
        LoggerUtility.infoLog("User inputs their password");
        elementMethods.clickJSElement(loginButton);
        LoggerUtility.infoLog("User clicks login");

    }

}
