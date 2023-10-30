package com.Junitmyfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElements_sitedeBtonSorgulama {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://www.bestbuy.com adresine gidin
        driver.get("https://www.bestbuy.com");

        // 2- cookies cikarsa kabul et butonuna basin

        // 3- sayfada kac adet button bulundugunu yazdirin
        List<WebElement> buttonListesi = driver.findElements(By.tagName("button")); //bu bir liste oluşturdugu için liste olustururuz
        System.out.println("buton adedi: " + buttonListesi.size()); //kaç adet dediği için

        // 4- sayfadaki her bir button uzerindeki yazilari yazdirin
        for ( WebElement w  : buttonListesi  ) {
            System.out.println(w.getText());

        }




    }
}
