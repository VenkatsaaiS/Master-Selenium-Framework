package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;

public class StorePage extends BasePage {

    private final By searchFld= By.id("woocommerce-product-search-field-0");
    private final By searchBtn = By.cssSelector("button[value='Search']");
    private final By title = By.cssSelector(".woocommerce-products-header__title.page-title");
    private final By addToCartBtn= By.xpath("//a[@aria-label='Add “Blue Shoes” to your cart']");
    private final By viewCartBtn= By.xpath("//a[@title='View cart']");

    public StorePage(WebDriver driver) {
        super(driver);
    }

    public void enterTextInSearchFld(String txt) {
        driver.findElement(searchFld).sendKeys(txt);
    }

    public void clickSearchBtn(){
        driver.findElement(searchBtn).click();
    }

    public String getTitle(){
        return driver.findElement(title).getText();
    }

    public void clickAddToCartBtn(){
        driver.findElement(addToCartBtn).click();
    }

    public void clickViewCartBtn(){
        driver.findElement(viewCartBtn).click();

    }

}
