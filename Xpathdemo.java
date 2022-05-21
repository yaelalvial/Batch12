package com.syntax.class02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username= driver.findElement(By.xpath("//input[contains(@id, 'username')]"));
        username.sendKeys("Tester");
        WebElement password= driver.findElement(By.xpath("//input[@type = 'password']"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value = 'Login']"));
        loginButton.click();

        driver.quit();




    }
}
