package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

public class SharedSD {

    private static WebDriver driver;
    private static String hotelUrl = "https://www.hotels.com/";

        @Before("@web")
        public static void before() {
            //setChromedriver
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            driver = new ChromeDriver();
            //navigate to the url
            driver.navigate().to(hotelUrl);
        }

         @After("@web")
            public void afterClass() {
                //quit the browser
                driver.quit();
            }

        public static WebDriver getDriver() {
            return driver;
        }
        public static String getUrl() {
             return hotelUrl;
         }
    }

