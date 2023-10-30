package com.Junitmyfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethodlari {
    public static void main(String[] args) {

        //Web sayfaları aralarında dolaşmak istiyorsun navigate kullanacağız

        WebDriver driver = new ChromeDriver();

        //1-driver.navigate().to("url") -->istenen url gider
        //driver.get("url") ile ayni ayni işlemleri yapar ama forward ve back yapılmasına imkan tanir.

        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");

        //2-driver.navigate().back() ; --> bir önceki sayfaya dönüş yapar
        driver.navigate().back(); // örneğimizde amazona dönüş yapar

        //3-driver.navigate().forward() --> back ile geldiği sayfaya yeniden gider.
        driver.navigate().forward(); // facebooka geri dönüşl yaparız

        //4-driver.navigate().refresh(); --> içinde olduğu sayfayı yeniler.
        driver.navigate().refresh();//içinde bulunduğu sayfayı yeniler.

        //driver olusturuldugunda acilan sayfayi kapatmak istersek
        driver.close();

        //driver calisirken birden fazla tab veya window actıysa tümünü kapatmak için
       // driver.quit();





    }
}
