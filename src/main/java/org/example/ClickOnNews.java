package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ClickOnNews {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/driver/chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //type the url
        driver.get("https://demo.nopcommerce.com/");
        //click on details
        driver.findElement(By.xpath("//div[@class='news-list-homepage']/div[2]/div[2]/div[3]/a")).click();
        //click on title
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Very Nice Product");
        //click on comments
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("5 star Product");
        driver.findElement(By.xpath("//div[@class='page-body']/div[3]/form/div[2]/button[1]")).click();
        String actualTest = driver.findElement(By.xpath("result")).getText();
        System.out.println("actualText");
    }
}
