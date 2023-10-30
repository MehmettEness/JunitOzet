package com.Junitmyfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsClass {
@Test
    public void mouseAndKeyboard (){
        //1. Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Click on 'Signup / Login' button
        WebElement signuuGiris = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        Actions actions = new Actions(driver);
        actions.click(signuuGiris).perform();
        //4. Enter name and email address
        WebElement nameKutusu = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        //5. Click 'Signup' button
        actions.click(nameKutusu)
                .sendKeys("Mehmet Enisss")
                .sendKeys(Keys.TAB)
                .sendKeys("gabel.maalik@free2ducks.com")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        //6. Fill details: Title, Name, Email, Password, Date of birth
        //7. Select checkbox 'Sign up for our newsletter!'
        //8. Select checkbox 'Receive special offers from our partners!'
        //9. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
            WebElement titleSec = driver.findElement(By.xpath("//div[@id='uniform-id_gender1']"));
            actions.click(titleSec)
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.TAB)
                    .sendKeys("123456")
                    .sendKeys(Keys.TAB)
                    .sendKeys("3")
                    .sendKeys(Keys.TAB)
                    .sendKeys("July")
                    .sendKeys(Keys.TAB)
                    .sendKeys("1991")
                    .sendKeys(Keys.TAB)
                    .click()
                    .sendKeys(Keys.TAB)
                    .click()
                    .sendKeys(Keys.TAB)
                    .sendKeys("enissss")
                    .sendKeys(Keys.TAB)
                    .sendKeys("arslannnnn")
                    .sendKeys(Keys.TAB)
                    .sendKeys("helololo")
                    .sendKeys(Keys.TAB)
                    .sendKeys("adw.cadee 1684/54")
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.TAB)
                    .sendKeys("Canada")
                    .sendKeys(Keys.TAB)
                    .sendKeys("güdül")
                    .sendKeys(Keys.TAB)
                    .sendKeys("Angora")
                    .sendKeys(Keys.TAB)
                    .sendKeys("06450")
                    .sendKeys(Keys.TAB)
                    .sendKeys("5060900909")
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.ENTER).perform();


        //10. Click 'Create Account button'
        //11. Verify that 'ACCOUNT CREATED!' is visible
            String expectedYazi = "ACCOUNT CREATED!";
            String actualYazi = driver.findElement(By.xpath("//h2[@data-qa='account-created']")).getText();

    Assert.assertEquals(expectedYazi , actualYazi);

    driver.close();

    }

}
