package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    //1- driveri ekrani kaplayacak sekilde kullanalim
    //1- google.com a gidelim
    //2- sayfanin title ini alalim ve ekrana yazdiralim
    //3-daha sonra youtube.com a gidelim
    //4- sayfanin title ini ve url ini alalim ve ekrana yazdiralim
    //5- google.com a geri gidelim ve sayfanin url ini alip ekrana yazdiralım
    //6- driverimizi kapatalim.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://google.com");
        String sayfaTitle = webDriver.getTitle();
        String sayfaUrl = webDriver.getCurrentUrl();
        System.out.println(sayfaTitle);
        System.out.println(sayfaUrl);
        webDriver.navigate().to("http://youtube.com");
        String sayfaTitle1 = webDriver.getTitle();
        String sayfaUrl1 = webDriver.getCurrentUrl();
        System.out.println(sayfaTitle1);
        System.out.println(sayfaUrl1);
        webDriver.navigate().back();
        String sayfaUrl2 = webDriver.getCurrentUrl();
        System.out.println(sayfaUrl2);
        webDriver.quit();

    }
}
