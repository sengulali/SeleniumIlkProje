package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    //1 - ilk once google.com a gidiniz
    //2 - youtube.com a gidiniz
    //3 - google.com a back methodu ile geri donunuz
    //4 - youtube.com a geri gidiniz(forward methodu ile)
    //5 - youtube.com u refresh methodu ileyenileyiniz
    //6 - driveri quit methodu ile kapatin

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://google.com");
        webDriver.navigate().to("http://youtube.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();


    }
}
