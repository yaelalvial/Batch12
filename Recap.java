package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        String title=driver.getTitle();
        String expectedTitle="Facebook - Log in or Sign up";
        if(title.equals(expectedTitle)){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is incorrect");
        }


    }
}
