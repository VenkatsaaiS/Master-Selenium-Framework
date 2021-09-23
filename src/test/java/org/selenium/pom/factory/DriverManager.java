package org.selenium.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.selenium.pom.constants.BrowserType;

public class DriverManager {

    WebDriver driver;

      public WebDriver initializeDriver(){

          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();

//          browser= System.getProperty("browser", browser);
//
//         switch (BrowserType.valueOf(browser)){
//             case CHROME:
//                 WebDriverManager.chromedriver().setup();
//                 driver = new ChromeDriver();
//                 break;
//             case FIREFOX:
//                 WebDriverManager.firefoxdriver().setup();
//                 driver= new FirefoxDriver();
//                 break;
//             default:
//                 throw new IllegalAccessException("Invalid Browser Name:" + browser);
//         }
          driver.manage().window().maximize();
          return driver;

      }
}
