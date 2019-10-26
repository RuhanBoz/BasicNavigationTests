package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
    public static ChromeDriver getDriver(String driver) {

        if (driver.equals("safari")) {
            return null;
        } else {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }
    }
}