package tests;

import configFiles.DataConfig;
import modelObject.LoginModel;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoggedInHomePage;
import pages.LoginSignupPage;
import sharedData.Hooks;

public class LoginLogoutTest extends Hooks {

    @Test
    public void metodaTest(){

        LoginModel testData = new LoginModel(DataConfig.LOGIN_DATA);

        HomePage homePage = new HomePage(getDriver());
        homePage.consentCookies();
        homePage.goToLoginPage();

        LoginSignupPage loginSignupPage = new LoginSignupPage(getDriver());
        loginSignupPage.inputExistentUserCredentials(testData);

        LoggedInHomePage loggedInHomePage = new LoggedInHomePage(getDriver());
        loggedInHomePage.logoutAction(testData);

    }
}
