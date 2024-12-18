package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class AccountCreationConfirmPage extends BasePage{

    public AccountCreationConfirmPage(WebDriver driver) {super(driver);}

    @FindBy (xpath = "//b[text()='Account Created!']")
    private WebElement accountCreatedMessage;
    @FindBy (xpath = "//a[@data-qa='continue-button']")
    private WebElement continueButton;

    public void validateAccountCreation(){

        Assert.assertEquals(accountCreatedMessage.getText(), "ACCOUNT CREATED!");
        LoggerUtility.infoLog("Account successfully created!");

        elementMethods.clickJSElement(continueButton);
        LoggerUtility.infoLog("User clicks on continue");

    }

}
