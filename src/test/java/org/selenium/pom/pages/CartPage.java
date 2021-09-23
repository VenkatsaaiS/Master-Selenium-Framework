package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.selenium.pom.base.BasePage;

public class CartPage extends BasePage {

//    private final By productName= By.cssSelector("td[class='product-name'] a");
//    private final By checkoutBtn= By.cssSelector("a.checkout-button.button.alt.wc-forward");

    @FindBy(css="td[class='product-name'] a") private WebElement productName;
    @FindBy(how = How.CSS, using = "a.checkout-button.button.alt.wc-forward") private WebElement checkoutBtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

     public String getProductName(){
     return productName.getText();
     }

     public void clickCheckoutBtn(){
      checkoutBtn.click();
     }

}
