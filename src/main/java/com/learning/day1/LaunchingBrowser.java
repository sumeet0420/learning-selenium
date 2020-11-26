package com.learning.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

    public static void main(String[] args) throws InterruptedException {
        //Setting the chromedriver path
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        //Launching the chrome driver
        //WebDriver -> Interface
        WebDriver driver = new ChromeDriver();
        //WebDriver driver3 = new InternetExplorerDriver();
        //Maximizing the browser
        driver.manage().window().maximize();
        //Opening an url
        driver.get("https://www.google.com");
        //Getting the title
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        //Page Source Code
        //System.out.println(driver.getPageSource());
        //Current Url
        String url = driver.getCurrentUrl();
        System.out.println(url);
        //Closing the browser
        driver.close();
    }
}
