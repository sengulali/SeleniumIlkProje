package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");

        String sayfaBasligi = driver.getTitle();// car

        if(sayfaBasligi.toLowerCase().contains("car")){
            System.out.println("Car kelimesi geciyor : " + sayfaBasligi);
        }else{
            System.out.println("Car kelimesi gecmiyor. " + sayfaBasligi);
        }

        driver.quit();


    }
}
