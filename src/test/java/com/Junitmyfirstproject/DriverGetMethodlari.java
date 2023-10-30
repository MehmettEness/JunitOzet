package com.Junitmyfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodlari {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        //1-driver.get ("url") --> yadığımızdaq url gider.

        driver.get("https://www.amazon.com");

        //2- driver.getTitle()--> içinde olduğu sayfanın başlığını döndürür.

        System.out.println("sayfa title :"  + driver.getTitle());

        //3-driver.getCurrentUrl() --> içinde olduğu sayfanın urlini döndürür.

        System.out.println(driver.getCurrentUrl()); //https://www.amazon.com/

        //4-driver.getPageSource () --> içinde olduğu sayfanın kaynak kodlarını döndürür.

        System.out.println("----------------------------------------------------------------");
        System.out.println(driver.getPageSource());
        System.out.println("----------------------------------------------------------------");

        //5-driver.getWindowHandle() --> içinde olduğu sayfanın UNIQUE hash kodunbun döndürür.
        System.out.println(driver.getWindowHandle()); //CDWindow-A8327B247BD99A5C4E8407F39BE62DB0

        //6-driver.getWindowHandles () --> driver calisirken açılan tüm sayfaların UNIQUE hash kodunu döndürür






    }
}
