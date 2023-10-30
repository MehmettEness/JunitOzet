package com.Junitmyfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElemntMethodlari_facebookYaziKontrolü {
    public static void main(String[] args) {
        // https://www.facebook.com adresine gidin
        // e-posta kutusuna rastgele bir mail girin
        // sifre kismina rastgele bir sifre girin
        // giris yap butonuna basin
        // uyari olarak "Girdiğin e-posta veya cep telefonu numarası bir hesaba bağlı değil. Hesabını bul ve giriş yap."
        //  mesajinin ciktigini test edin
        // sayfayi kapatin


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");

        // e-posta kutusuna rastgele bir mail girin
        WebElement epostaKutusu = driver.findElement(By.xpath("//input[@id='email']"));
        epostaKutusu.sendKeys("1z6d5fg46zdfg4");

        // sifre kismina rastgele bir sifre girin
        WebElement sifreGir = driver.findElement(By.xpath("//input[@id='pass']"));
        sifreGir.sendKeys("6f5g1hAS");

        // giris yap butonuna basin
        driver.findElement(By.xpath("//button[@name='login']")).click();

        // uyari olarak "Girdiğin e-posta veya cep telefonu numarası bir hesaba bağlı değil. Hesabını bul ve giriş yap."
        //altta o değeri verdik

        //  mesajinin ciktigini test edin

        WebElement sonucYazisi = driver.findElement(By.xpath("//div[@class='_9ay7']"));

        String expectedResultYazisi = "Girdiğin e-posta veya cep telefonu numarası bir hesaba bağlı değil. Hesabını bul ve giriş yap.";

        String actualSonucYazisi = sonucYazisi.getText(); // expected ve actual yazıları birbirine eşit mi o konytrol edilecek.

        if(expectedResultYazisi.equals(actualSonucYazisi)){
            System.out.println("girilemedi testi passed");
        }else{
            System.out.println("girilemedi testi failed");
        }

        // sayfayi kapatin
       driver.close();





    }
}
