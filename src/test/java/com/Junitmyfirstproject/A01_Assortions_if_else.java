package com.Junitmyfirstproject;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class A01_Assortions_if_else {
    WebDriver driver;

    @Before
    public void giris(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void cikis(){

       driver.close();
    }
    @Test
    public void site (){
        //siteye git
        driver.get("https://www.amazon.com.tr");

        //arama kısmına kablosuz kulaklık yazdır
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Kablosuz Kulaklık");

        //arama yapmak için seçmem lazım
        aramaKutusu.submit();

        //bulunan sonucların Kablosuz Kulaklık yazdığını test edelim
        WebElement sonucYazdir = driver.findElement(By.xpath("//html[@data-19ax5a9jf='dingo']"));
        String actualYaziStr= sonucYazdir.getText();

        //30.000 üzeri sonuç arasından 1-48 arası gösteriliyor. Aranan ürün: "Kablosuz Kulaklık"
        String expectedBulunanKelime = "Kablosuz Kulaklık";

 //        if (actualYaziStr.contains(expectedBulunanKelime)){
 //             System.out.println("Test passed");
 //         }else {
 //             System.out.println("Yanlış içerik" + "\n Test Failed");
 //         }

        Assert.assertTrue(actualYaziStr.contains(expectedBulunanKelime));
        //yazılan sonuc kablosuz ama beklenen kablolu olduğu için test geçmez
        //Testin geçmesi için assertfalse yapsaydık geçerdi.
    }

}
