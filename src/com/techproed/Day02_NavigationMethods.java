package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {
        //Java projemize chromedriverı tanittik.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        //driverin tum ekrani kaplamasini sagliyor
        webDriver.manage().window().maximize();

        //Driver a google.com a gitmesini soyledik.
        webDriver.get("http://google.com");

        //get komutu ile ayni islevi yapiyor.
        webDriver.navigate().to("http://amazon.com");
        //navigate().back() komutu bir onceki sayfaya geri donmemizi sagliyor
        webDriver.navigate().back();

        //navigate().forward() methodu geri geldigimiz sayfaya gitmemizi sagliyor
        // ornek: google -> amazon a gitiik -> google a geri donduk.
        webDriver.navigate().forward();

        // navigate().refresh() methodu sayfayi yenilemeye yariyor.
        webDriver.navigate().refresh();




    }
}