package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {super (driver);}

    @FindBy (xpath = "//tr[@id='product-1']/td[2]/h4/a")
    private WebElement nameProduct1;
    @FindBy (xpath = "//tr[@id='product-1']/td[3]/p")
    private WebElement priceProduct1;
    @FindBy (xpath = "//tr[@id='product-1']/td[4]/button")
    private WebElement quantityProduct1;

    @FindBy (xpath = "//tr[@id='product-2']/td[2]/h4/a")
    private WebElement nameProduct2;
    @FindBy (xpath = "//tr[@id='product-2']/td[3]/p")
    private WebElement priceProduct2;
    @FindBy (xpath = "//tr[@id='product-2']/td[4]/button")
    private WebElement quantityProduct2;


    public void verifyCartItems(){

        LoggerUtility.infoLog("The price of product "+ nameProduct1.getText()+" is "+priceProduct1.getText());
        LoggerUtility.infoLog("The quantity of product "+ nameProduct1.getText()+" added to the cart is "+quantityProduct1.getText());

        LoggerUtility.infoLog("The price of product "+ nameProduct2.getText()+" is "+priceProduct2.getText());
        LoggerUtility.infoLog("The quantity of product "+ nameProduct2.getText()+" added to the cart is "+quantityProduct2.getText());

    }

}
