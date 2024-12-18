package tests;

import configFiles.DataConfig;
import modelObject.RegisterModel;
import org.testng.annotations.Test;
import pages.*;
import sharedData.Hooks;

public class RegisterUserTest extends Hooks {

    @Test
    public void metodaTest(){

        RegisterModel testData = new RegisterModel(DataConfig.REGISTER_DATA);

        HomePage homePage = new HomePage(getDriver());
        homePage.consentCookies();
        homePage.goToLoginPage();

        LoginSignupPage loginSignupPage = new LoginSignupPage(getDriver());
        loginSignupPage.inputNewUserCredentials(testData);

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.fillRegisterForm(testData);

        AccountCreationConfirmPage accountCreationConfirmPage = new AccountCreationConfirmPage(getDriver());
        accountCreationConfirmPage.validateAccountCreation();

        LoggedInHomePage loggedInHomePage = new LoggedInHomePage(getDriver());
        loggedInHomePage.deleteAccount(testData);

        AccountDeletionConfirmPage accountDeletionConfirmPage = new AccountDeletionConfirmPage(getDriver());
        accountDeletionConfirmPage.validateAccountDeletion();






    }
}
