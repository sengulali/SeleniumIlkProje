package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
        //Java projemize chromedriveri tanittik
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        //Selenium ile ilgili ilk codeumuz
        //webDriver nesnesi olusturarak, chrome driveri kullanabilir hale getirdik
        WebDriver webDriver = new ChromeDriver();

      //direver imiza google.com a gitmesini soyledik.
        webDriver.get("http://google.com");

        //driver da acik olan pencereyi kapatir.
       // webDriver.close();

        //driveri komple kapatiyor.
        //webDriver.quit();


    }
}
