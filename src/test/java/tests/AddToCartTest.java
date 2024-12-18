package tests;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductsPage;
import sharedData.Hooks;

public class AddToCartTest extends Hooks {

    @Test
    public void metodaTest(){

        HomePage homePage = new HomePage(getDriver());
        homePage.consentCookies();
        homePage.goToProductPage();

        ProductsPage productsPage = new ProductsPage(getDriver());
        productsPage.addProductsToCart();
        productsPage.goToCartPage();

        CartPage cartPage = new CartPage(getDriver());
        cartPage.verifyCartItems();


    }
}
