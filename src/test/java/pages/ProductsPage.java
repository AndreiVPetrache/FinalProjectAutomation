package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {super (driver);}

    @FindBy(xpath = "//h2[text()='All Products']")
    private WebElement allProductsHeader;
    @FindBy (xpath = "//a[@data-product-id='1']")
    private WebElement addProduct1ToCart;
    @FindBy (xpath = "//a[@data-product-id='2']")
    private WebElement addProduct2ToCart;
    @FindBy (xpath = "//a/u[text()='View Cart']")
    private WebElement goToCart;
    @FindBy (xpath = "//button[text()='Continue Shopping']")
    private WebElement continueShopping;

    public void addProductsToCart(){

        elementMethods.clickJSElement(addProduct1ToCart);
        LoggerUtility.infoLog("User added product 1 to cart");

        elementMethods.clickJSElement(continueShopping);
        LoggerUtility.infoLog("User clicked on continue shopping");

        elementMethods.clickJSElement(addProduct2ToCart);
        LoggerUtility.infoLog("User added product 2 to cart");

    }

    public void goToCartPage(){

        elementMethods.clickJSElement(goToCart);
        LoggerUtility.infoLog("User clicked on cart");
    }


}
