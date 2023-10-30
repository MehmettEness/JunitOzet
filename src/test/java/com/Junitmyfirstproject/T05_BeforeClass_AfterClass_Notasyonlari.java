package com.Junitmyfirstproject;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T05_BeforeClass_AfterClass_Notasyonlari {
    // Olusturdugumuz test class'inin icindeki test method'lari
    // hep ayni web sitesi ile ilgili ise her seferinde yeniden driver olusturmaya
    // ve her method icin bu driver'i kapatmaya gerek yoktur
    // Class'in basinda bir kere setup calisip, en sonda kapansa olur
    // dersek BeforeClass ve AfterClass kullaniriz

  static   WebDriver driver ;

    @BeforeClass
    public static void  siraylaYap(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void kapatma(){
        driver.close();
    }
    @Test
    public void trendyol (){
        driver.get("https://www.trendyol.com");
    }
    @Test @Ignore
    public void title(){
        //title yazdıralım
        System.out.println(driver.getTitle());
    }
    @Test
    public void url(){
        //url yazdıralım
        System.out.println(driver.getCurrentUrl());
    }




}
