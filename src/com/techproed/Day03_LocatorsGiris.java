package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {

    public static void main(String[] args) {
        // java projemize chromedriveri tanittik.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

    // ilk webelementi bulduruyoruz
    //web sayfasindaki tum elemanlar WebElement

        //webelementi id kullanarak bulduk.
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        //webelementimize tikladik.
        signInLink.click();

        //email kutusunu bulalim
        WebElement emailKutusu = driver.findElement(By.id("session_email"));

        //email kutusunun icerisine yazi gonderiyoruz
        emailKutusu.sendKeys("testtechproed@gmail.com");
        //sifre kutusunu bulalim
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
       //sifre kutusuna sifre gonderiyoruz
        sifreKutusu.sendKeys("Test1234!");

        //sign in butonunu buluyoruz
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

        String baslik = driver.getTitle();

        if(baslik.equals("Address Book")){
            System.out.println("Giris basarili.");
        }else{
            System.out.println("Giris basarisiz.");
        }







    }

    }


