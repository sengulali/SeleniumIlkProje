package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {

    //1- youtube.com a gidelim
    //2- title(sayfa basligi), video kelimesini iceriyor mu
    //3- driveri kapatalim

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://youtube.com");

        String sayfaBasligi = driver.getTitle();// car

        if(sayfaBasligi.toLowerCase().contains("video")){
            System.out.println("Video kelimesi geciyor : " + sayfaBasligi);
        }else{
            System.out.println("Video kelimesi gecmiyor. " + sayfaBasligi);
        }

        driver.quit();



    }
}
