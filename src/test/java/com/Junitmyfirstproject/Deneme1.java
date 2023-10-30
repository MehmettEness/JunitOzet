package com.Junitmyfirstproject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme1 {



        public static void main(String[] args) throws InterruptedException {


            WebDriver driver = new ChromeDriver();
            driver.get("https://web.whatsapp.com/");
            Thread.sleep(30000);

            WebElement aramaKutusu = driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[1]"));
            aramaKutusu.sendKeys("Watsaptan aratılan yazı");
            aramaKutusu.sendKeys(Keys.RETURN);

             driver.findElement(By.xpath("//span[@title='Gülüm']")).click();

            for (int i = 0; i < 50; i++) {
                WebElement messageBox=driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"));
                messageBox.sendKeys("Watsappdan gönderilen mesaj"+i);
                driver.findElement(By.xpath("//span[@data-icon='send']")).click();
                messageBox.sendKeys(Keys.RETURN);
            }

            driver.close();
        }
    }

