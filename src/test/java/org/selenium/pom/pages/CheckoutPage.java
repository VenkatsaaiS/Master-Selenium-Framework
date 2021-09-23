package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.BillingAddress;
import org.selenium.pom.objects.User;

public class CheckoutPage extends BasePage {

    private final By userNameFld= By.id("username");
    private final By passwordFld= By.id("password");
    private final By loginBtn= By.name("login");
    private final By firstNameFld = By.id("billing_first_name");
    private final By lastNameFld = By.id("billing_last_name");
    private final By countryFld= By.id("billing_country");
    private final By streetAddressFld = By.id("billing_address_1");
    private final By cityNameFld = By.id("billing_city");
    private final By stateNameFld= By.id("billing_state");
    private final By zipCodeFld = By.id("billing_postcode");
    private final By emailIdFld = By.id("billing_email");
    private final By placeOrderBtn = By.id("place_order");
    private final By successNotice = By.cssSelector(".woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received");
    private final By clickHereToLogin= By.className("showlogin");

    public CheckoutPage(WebDriver driver) {
        super(driver);

    }

    public void enterFirstName(String firstName){
        driver.findElement(firstNameFld).clear();
        driver.findElement(firstNameFld).sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        driver.findElement(lastNameFld).clear();
        driver.findElement(lastNameFld).sendKeys(lastName);
    }

    public void selectCountryName(String countryName){
        Select select= new Select(driver.findElement(countryFld));
        select.selectByVisibleText(countryName);
    }

    public void enterStreetAddress(String streetAddress){
        driver.findElement(streetAddressFld).clear();
        driver.findElement(streetAddressFld).sendKeys(streetAddress);
    }

    public void enterCityName(String city){
        driver.findElement(cityNameFld).clear();
        driver.findElement(cityNameFld).sendKeys(city);
    }

    public void enterStateName(String state){
        Select select =new Select(driver.findElement(stateNameFld));
        select.selectByVisibleText(state);
    }
    public void enterZipCode(String zipCode){
        driver.findElement(zipCodeFld).clear();
        driver.findElement(zipCodeFld).sendKeys(zipCode);
    }

    public void enterEmailId(String email){
        driver.findElement(emailIdFld).clear();
        driver.findElement(emailIdFld).sendKeys(email);
    }

    public void clickPlaceOrderBtn(){
        driver.findElement(placeOrderBtn).click();
    }

    public String getSuccessNotice(){
        return driver.findElement(successNotice).getText();
    }

    public void clickHereToLoginLink(){
        driver.findElement(clickHereToLogin).click();

    }
    public void enterUserName(String uname){
        driver.findElement(userNameFld).sendKeys(uname);
    }

    public void enterPassword(String pwd){
        driver.findElement(passwordFld).sendKeys(pwd);
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        enterFirstName(billingAddress.getFirstName());
        enterLastName(billingAddress.getLastName());
        selectCountryName(billingAddress.getCountryName());
        enterStreetAddress(billingAddress.getStreetAddress());
        enterCityName(billingAddress.getCity());
        enterStateName(billingAddress.getState());
        enterZipCode(billingAddress.getZipCode());
        enterEmailId(billingAddress.getEmailId());

    }

    public void setUser(User user){
        enterUserName(user.getUserName());
        enterPassword(user.getPassword());
    }
}
