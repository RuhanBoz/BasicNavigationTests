package com.cbt.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

import static com.cbt.utilities.BrowserFactory.getDriver;
import static com.cbt.utilities.StringUtility.verifyEquals;

public class NavigationTests {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("pick a browser");

        String browser = scan.nextLine();
        if(browser.equals("chrome")){


            WebDriver driver = getDriver("chrome");
            driver.navigate().to("http:/www.google.com");

            String expected = driver.getTitle();

            System.out.println(verifyEquals(expected , "google"));

            driver.close();
        }
    }

    }
