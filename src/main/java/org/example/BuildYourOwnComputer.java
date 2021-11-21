package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BuildYourOwnComputer {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/driver/chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Type the url
        driver.get("https://demo.nopcommerce.com/");
        //click on picture Build your own Computer
        driver.findElement(By.xpath("//img[@alt='Picture of Build your own computer']")).click();
        //title of Build your own computer
        driver.findElement(By.xpath("//h2/a[@href='/build-your-own-computer']")).click();




    }
}
