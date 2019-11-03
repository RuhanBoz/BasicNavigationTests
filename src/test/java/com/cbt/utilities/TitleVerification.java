package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(0));
        driver.get("http://practice.cybertekschool.com/");
        String title1= driver.getTitle();

        Thread.sleep(1000);

        driver.navigate().to(urls.get(1));
        String title2 = driver.getTitle();
        StringUtility.verifyEquals(title1,title2);
        Thread.sleep(3000);

        driver.navigate().to(urls.get(2));
        String title3= driver.getTitle();
        StringUtility.verifyEquals(title1,title3);
         Thread.sleep(3000);


        driver.close();
    }
}
