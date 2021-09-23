package org.selenium.pom.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.objects.BillingAddress;
import org.selenium.pom.objects.User;
import org.selenium.pom.pages.CartPage;
import org.selenium.pom.pages.CheckoutPage;
import org.selenium.pom.pages.HomePage;
import org.selenium.pom.pages.StorePage;
import org.selenium.pom.utils.JacksonUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class MyFirstTestCase extends BaseTest {

    @Test
    public void guestCheckOutUsingDirectBankTransfer() throws IOException {

//        BillingAddress billingAddress= new BillingAddress("dummy","user","India",
//                "Chaitanya Colony","Huzurnagar","Telangana","508204","albitharz@yahoo.com");
        String searchFor="blue";
        BillingAddress billingAddress = new BillingAddress();
        InputStream is=getClass().getClassLoader().getResourceAsStream("myBillingAddress.json");
        billingAddress= JacksonUtils.deserialization(is,billingAddress);

        HomePage homePage = new HomePage(driver).loadUrl();
        StorePage storePage = new StorePage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        homePage.
                clickStoreMenuLink();
        storePage.
                enterTextInSearchFld(searchFor);
        storePage.
                clickSearchBtn();
        Assert.assertEquals(storePage.getTitle(),"Search results: “blue”");
        storePage.
                clickAddToCartBtn();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,10);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='View cart']")));
        storePage.
                clickViewCartBtn();
        Assert.assertEquals(cartPage.getProductName(),"Blue Shoes");
        cartPage.
                clickCheckoutBtn();
        checkoutPage.
                setBillingAddress(billingAddress);
//                enterFirstName("dummy");
//        checkoutPage.
//                enterLastName("user");
//        checkoutPage.
//                enterStreetAddress("California");
//        checkoutPage.
//                enterCityName("California");
//        checkoutPage.
//                enterZipCode("94188");
//        checkoutPage.
//                enterEmailId("arbitharz@yahoo.co.in");
        checkoutPage.
                clickPlaceOrderBtn();
       WebDriverWait wait1 = new WebDriverWait(driver,10);
        wait1.until(ExpectedConditions.
             visibilityOfElementLocated(By.
                       cssSelector(".woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received"))).getText();
        Assert.assertEquals(checkoutPage.getSuccessNotice(),"Thank you. Your order has been received.");


        System.out.println("Voila.....Your Order has been Placed Successfully.....Thank you for shopping with us....");

    }

    @Test
    public void LoginAndCheckOutUsingDirectBankTransfer() throws IOException {

        String searchFor="blue";
        User user = new User("dummy","dummypwd");
        BillingAddress billingAddress = new BillingAddress();
        InputStream is=getClass().getClassLoader().getResourceAsStream("myBillingAddress.json");
        billingAddress= JacksonUtils.deserialization(is,billingAddress);
       // driver.get("https://askomdch.com/");
        HomePage homePage = new HomePage(driver).loadUrl();
        StorePage storePage = new StorePage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        homePage.
                clickStoreMenuLink();
        storePage.
                enterTextInSearchFld(searchFor);
        storePage.
                clickSearchBtn();
        Assert.assertEquals(storePage.getTitle(),"Search results: “blue”");
        storePage.
                clickAddToCartBtn();
 //       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='View cart']")));
        storePage.
                clickViewCartBtn();
        Assert.assertEquals(cartPage.getProductName(),"Blue Shoes");
        cartPage.
                clickCheckoutBtn();
        checkoutPage.
                clickHereToLoginLink();
        checkoutPage.
                setUser(user);
        checkoutPage.
                clickLoginBtn();
        checkoutPage.
                setBillingAddress(billingAddress);
        checkoutPage.
                clickPlaceOrderBtn();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait1= new WebDriverWait(driver,10);
        wait1.until(ExpectedConditions.
                visibilityOfElementLocated(By.
                        cssSelector(".woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received"))).getText();
        Assert.assertEquals(checkoutPage.getSuccessNotice(),"Thank you. Your order has been received.");


        System.out.println("Voila....Successfully logged in to your account and order has been Placed Successfully..." +
                "Thank you for shopping with us....");
    }

}