package com.cbt.tests;
/*
import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
        ChromeTest();
        fireFoxTest();
        EdgeTest();

    }

    public static void ChromeTest() {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String titleOne = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String titleTwo = driver.getTitle();
        driver.navigate().back();
        String googleTitleTwo = driver.getTitle();


        driver.quit();
     /*   public static void ChromeTest() {...}

        public static void fireFoxTest() {...}

        public static void EdgeTest() {...}
*/
