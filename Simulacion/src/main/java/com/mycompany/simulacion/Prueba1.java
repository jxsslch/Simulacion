package com.mycompany.simulacion;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba1 {
    
    public void login (){
        System.setProperty("webdriver.chrome.driver", 
                "C:\\dev\\web\\Simulacion\\Simulacion\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/basic_auth");
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("button"));
        
        username.sendKeys("admin");
        password.sendKeys("admin");
        login.click();
        String url="http://the-internet.herokuapp.com/basic_auth";
        String esperado = driver.getCurrentUrl();
        boolean True = url.equals(esperado);
        System.out.print(True);
    }
}
