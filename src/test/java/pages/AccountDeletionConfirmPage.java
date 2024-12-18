package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountDeletionConfirmPage extends BasePage{

    public AccountDeletionConfirmPage(WebDriver driver) {super(driver);}

    @FindBy (xpath = "//b[text()='Account Deleted!']")
    private WebElement accountDeletedMessage;

    public void validateAccountDeletion(){

        Assert.assertEquals(accountDeletedMessage.getText(), "ACCOUNT DELETED!");
        LoggerUtility.infoLog("Account successfully deleted!");

    }

}
