package org.selenium.pom.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.selenium.pom.factory.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    protected WebDriver driver;

   // @Parameters("browser")
    @BeforeMethod
    public void startDriver() {
        driver = new DriverManager().initializeDriver();    
    }

    @AfterMethod
    public void quitDriver(){
        driver.quit();

    }
}
