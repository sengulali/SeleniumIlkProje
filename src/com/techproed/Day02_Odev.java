package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Odev {
    //1- chromeDriveri kullanarak facebooka gidin ve sayfa basligini (page title) "facebook"
    // olup olmadigini dogrulayin. degilse dogru basligi yazdirin
    //2- Sayfa URL'sinin facebook içerip içermediğini(contains), Değilse doğru URL'yi(Actual url) yazdırın.
    //3- Ardından Navigate to https://www.walmart.com/
    //4-Walmart sayfa başlığının "Walmart.com" içerip içermediğini(contains) doğrulayın
    //5- Navigate back to facebook
    //7- Sayfayı yenileyin(refresh)
    //8- Maximize the window
    //9. Close the browse

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("http://faceebok.com");
        String baslik = webDriver.getTitle();
        if(baslik.contains("Facebook")){
            System.out.println("title'de Facebook Kelimesi bulunmaktadir.");
        } else {
            System.out.println("Title'de Facebook Kelimesi BULUNMAMAKTADIR.");
            System.out.println("Sayfa Basligi: " + baslik);
        }

        String url = webDriver.getCurrentUrl();
        if(url.contains("facebook")){
            System.out.println("URL'de facebook kelimesi vardir.");
        } else{
            System.out.println("URL'de facebook kelimesi yoktur!");
            System.out.println("sayfa URL adi: " + url);
        }

        webDriver.navigate().to("http://www.walmart.com");
        String title = webDriver.getTitle();
        if(title.contains("Walmart.com")){
            System.out.println("Title iceriyor.");
        } else{
            System.out.println("Title ICERMIYOR.");
        }

        webDriver.navigate().back();
        webDriver.navigate().refresh();
        webDriver.quit();
    }


}
