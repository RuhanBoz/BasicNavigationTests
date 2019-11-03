package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com, ",
                "https://westelm.com/");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://lulugandgeorgia.com");
        driver.get(urls.get(0));
        String title1 = driver.getTitle();
        title1 = title1.toLowerCase();
        title1 = title1.replace(" ", "");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

   if(urls.get(0).contains(title1)){
    System.out.println("WebSite 1 Passed");
   }else {
    System.out.println("WebSite 1 Failed");
}

     driver.navigate().to(urls.get(1));

        String title2 = driver.getTitle();
        title2 = title2.toLowerCase();
        title2 = title2.replace(" ", "");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        if(urls.get(0).contains(title2)){
            System.out.println("WebSite 2 Passed");
        }else {
            System.out.println("WebSite 2 Failed");
        }
driver.navigate().to(urls.get(2));

        String title3 = driver.getTitle();
        title3 = title3.toLowerCase();
        title3 = title3.replace(" ", "");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        if(urls.get(0).contains(title3)){
            System.out.println("WebSite 3 Passed");
        }else {
            System.out.println("WebSite 3 Failed");
        }

        driver.navigate().to(urls.get(3));

        String title4 = driver.getTitle();
        title4 = title4.toLowerCase();
        title4 = title4.replace(" ", "");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        if(urls.get(0).contains(title4)){
            System.out.println("WebSite 4 Passed");
        }else {
            System.out.println("WebSite 4 Failed");
        }

        driver.close();
    }
}
