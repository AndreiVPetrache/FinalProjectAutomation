package pages;

import loggerUtility.LoggerUtility;
import modelObject.RegisterModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {super (driver);}

    @FindBy (id = "id_gender1")
    private WebElement genderField;
    @FindBy (id = "password")
    private WebElement passwordField;
    @FindBy (id = "days")
    private WebElement daysField;
    @FindBy (id = "months")
    private WebElement monthsField;
    @FindBy (id = "years")
    private WebElement yearsField;
    @FindBy (xpath = "//div[@class='checkbox']//label[text()='Sign up for our newsletter!']")
    private WebElement newsletterCheckbox;
    @FindBy (xpath = "//div[@class='checkbox']//label[text()='Receive special offers from our partners!']")
    private WebElement offersCheckbox;
    @FindBy (id = "first_name")
    private WebElement firstNameField;
    @FindBy (id = "last_name")
    private WebElement lastNameField;
    @FindBy (id = "address1")
    private WebElement addressField;
    @FindBy (id = "country")
    private WebElement countryField;
    @FindBy (id = "state")
    private WebElement stateField;
    @FindBy (id = "city")
    private WebElement cityField;
    @FindBy (id = "zipcode")
    private WebElement zipCodeField;
    @FindBy (id = "mobile_number")
    private WebElement phoneNumberField;
    @FindBy (xpath = "//button[text()='Create Account']")
    private WebElement submitFormButton;

    public void fillRegisterForm(RegisterModel testData){

        elementMethods.clickJSElement(genderField);
        LoggerUtility.infoLog("User selects their gender");

        elementMethods.fillElement(passwordField, testData.getPasswordField());
        LoggerUtility.infoLog("User inputs their password");

        elementMethods.selectDropDownElement(daysField, testData.getDaysField());
        LoggerUtility.infoLog("User selects day of birth");

        elementMethods.selectDropDownElement(monthsField, testData.getMonthsField());
        LoggerUtility.infoLog("User selects month of birth");

        elementMethods.selectDropDownElement(yearsField, testData.getYearsField());
        LoggerUtility.infoLog("User selects year of birth");

        elementMethods.clickJSElement(newsletterCheckbox);
        LoggerUtility.infoLog("User clicks the newsletter checkbox");

        elementMethods.clickJSElement(offersCheckbox);
        LoggerUtility.infoLog("User clicks the offer checkbox");

        elementMethods.fillElement(firstNameField, testData.getFirstNameField());
        LoggerUtility.infoLog("User inputs their first name");

        elementMethods.fillElement(lastNameField, testData.getLastNameField());
        LoggerUtility.infoLog("User inputs their last name");

        elementMethods.fillElement(addressField, testData.getAddressField());
        LoggerUtility.infoLog("User inputs their address");

        elementMethods.selectDropDownElement(countryField, testData.getCountryField());
        LoggerUtility.infoLog("User selects their country");

        elementMethods.fillElement(stateField, testData.getStateField());
        LoggerUtility.infoLog("User inputs their state");

        elementMethods.fillElement(cityField, testData.getCityField());
        LoggerUtility.infoLog("User inputs their city");

        elementMethods.fillElement(zipCodeField, testData.getZipCodeField());
        LoggerUtility.infoLog("User inputs their zipcode");

        elementMethods.fillElement(phoneNumberField, testData.getPhoneNumberField());
        LoggerUtility.infoLog("User inputs their phone number");

        elementMethods.clickJSElement(submitFormButton);
        LoggerUtility.infoLog("User submits form");




    }

}
