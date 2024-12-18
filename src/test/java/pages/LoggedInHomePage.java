package pages;

import loggerUtility.LoggerUtility;
import modelObject.LoginModel;
import modelObject.RegisterModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoggedInHomePage extends BasePage {

    public LoggedInHomePage (WebDriver driver) {super(driver);}

    @FindBy (xpath = "//header[@id='header']/div/div/div/div[2]/div/ul/li[10]/a")
    private WebElement loggedUserName;
    @FindBy (xpath = "//a[text()=' Delete Account']")
    private WebElement deleteAccountButton;
    @FindBy (xpath = "//a[text()=' Logout']")
    private WebElement logoutButton;

    public void deleteAccount(RegisterModel testData){

        Assert.assertEquals(loggedUserName.getText(), "Logged in as "+testData.getUserName());
        LoggerUtility.infoLog("User "+testData.getUserName()+" logged in");

        elementMethods.clickJSElement(deleteAccountButton);
        LoggerUtility.infoLog("User deletes account");

    }

    public void logoutAction(LoginModel testData){

        Assert.assertEquals(loggedUserName.getText(), "Logged in as "+testData.getRegisteredUserName());
        LoggerUtility.infoLog("User "+testData.getRegisteredUserName()+" logged in");

        elementMethods.clickJSElement(logoutButton);
        LoggerUtility.infoLog("User logged out");



    }


}
