package com.Junitmyfirstproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T04_Before_After_Notasyon {
    WebDriver driver ;
    @Before
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void siraylaGidecek (){
        driver.close();
    }
    @Test
    public void trendyol(){
        driver.get("https://www.trendyol.com");
    }
    @Test
    public void kamrusepa(){
        driver.get("https://www.kamrusepa.com");
    }
    @Test
    public void hepsiburada(){
        driver.get("https://www.hepsiburada.com");
    }


}
