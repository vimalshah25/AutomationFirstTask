package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registation {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver.exe");
        //open the browser

        driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //type the url
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //type firstname
        driver.findElement(By.id("FirstName")).sendKeys("Vimal");
        //type lastname
        driver.findElement(By.id("LastName")).sendKeys("Shah");
        //type email
        driver.findElement(By.id("Email")).sendKeys("vimalshah00@bmail.com");
        //type password
        driver.findElement(By.id("Password")).sendKeys("12345678");
        //type confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");
        //click register
        driver.findElement(By.id("register-button")).click();

        System.out.println("your registration completed");




    }












}
