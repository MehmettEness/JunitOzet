package com.Junitmyfirstproject;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManagerMethodlari {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //1- driver.manage().window() methodlari
        //1 a - driver.manage().window().getSize(); //bana içerisnde olduğumuz sdayfanın pixel ölçülerini getirecektir.
        System.out.println(driver.manage().window().getSize()); //(1051, 806)

        //1 b - driver.manage().window().getPosition() --> içinde olduğu sayfanın pixel olarak konumu döndürür.
        System.out.println(driver.manage().window().getPosition()); //(9, 9)

        //1 c - driver.manage().window().setPosition(new Point (15,15));
        // içinde olduğu sayfanın sol aly kosesini bizim yazacağımız pixel noktasına taşır.
        driver.manage().window().setPosition(new Point(15,15));

        //1 d -driver.manage().window().setSize(new Dimension (900,600));
        //içinde olduğu sayfanın sol alt kosesi sabit olarak bizimm yazacağımız olcülere getirir.
        driver.manage().window().setSize(new Dimension(900,600));


        System.out.println("yeni pencere ölçüleri :" + driver.manage().window().getSize()); // (900,600)
        System.out.println("yeni pencere konumu :" + driver.manage().window().getPosition());// (15 , 15)

        //1 e - driver.manage().window().maximize(); --> içinde olduğu sayfayı maximize yapar.
        //1 f - driver.manage().window().fullscreen(); --> içinde olduğu sayfayı fullscreen yapar

        //farkları görmek için yazdıralım
        driver.manage().window().maximize();
        System.out.println("maximize konum :" + driver.manage().window().getPosition()); //(-8, -8)
        System.out.println("maximize boyut :" + driver.manage().window().getSize()); //(1552, 840)

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum :" + driver.manage().window().getPosition()); //(0, 0)
        System.out.println("fullscreen boyut :" + driver.manage().window().getSize()); //(1536, 864)

        //1 g - driver.manage().window().minimize(); --> sayfayi simge durumda küçültür
        driver.manage().window().minimize();

        //---------------------------------------------------------------------------------------------------------///

        //2 - driver.manage().timeouts() methodları
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));   //implicitlyWait() methodu --> sleeniumun çalışmasını bir süre bekle demek

            /*      wait konusunu ilerde tek basina ele alacagiz
                ancak her class icin yapmamiz gereken bir ayar oldugu icin burada kisaca deginelim
                implicitlyWait : driver'a sayfanin yuklenmesi ve kullanacagimiz webelementlerin bulunmasi icin
                                 bekleyecegi maximum sureyi belirtir.
                                 driver bu sure icerisinde sayfa yuklenir/web element bulunursa
                                 beklemeden calismaya devam eder.
                                 bu sure bittigi halde sayfa yuklenememis/webElement bulunamamissa
                                 exception vererek calismayi durdurur

                Duration.ofSeconds(15) : Duration class'i Selenium-4 ile gelen zaman class'idir
                                         Yani driver'a ne kadar bekleyecegini soyler
                                         Duration.ofSeconds(15) yerine milis,minutes,hours da kullanilabilir
         */

        /* NOT :    Driver'in istedigimiz islemleri yaparken sorunla karsilasmamasi icin
                    driver.manage() method'larindan
                    maximize() ve implicitlyWait() method'larinin her test'te kullanilmasi
                    FAYDALI OLACAKTIR

         */




    }
}
