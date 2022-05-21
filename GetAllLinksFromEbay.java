package com.syntax.class02;

import javafx.scene.input.InputMethodTextRun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinksFromEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        System.out.println("Number of links " + allLinks.size());

        for(WebElement links: allLinks){
            String linksText = links.getText();
            String fullLink = links.getAttribute("href");
            if(!linksText.isEmpty()){
                System.out.println(linksText + "    " + fullLink);
            }
driver.quit();
        }
    }
}
