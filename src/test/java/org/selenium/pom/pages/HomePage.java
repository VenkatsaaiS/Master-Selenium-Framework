package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;

public class HomePage extends BasePage {

 private final By storeMenuLink= By.cssSelector("li[id='menu-item-1227'] a[class='menu-link']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickStoreMenuLink(){
        driver.findElement(storeMenuLink).click();

    }
    public HomePage loadUrl(){
        loadUrl("/");
        return this;
    }
    }
