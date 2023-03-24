/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba6 {
    
    public void dropdown(){
        System.setProperty("webdriver.chrome.driver", 
                "C:\\Users\\JOSE ENRIQUE\\OneDrive - Universidad Fidélitas\\Cuarto Cuatri\\Calidad del software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        WebElement link1 = driver.findElement(By.xpath("//option[@value='1']"));
        WebElement link2 = driver.findElement(By.xpath("//option[@value='2']"));
        
        try {
            Thread.sleep(3000);
            dropdown.click();
            Thread.sleep(1000);
            link1.click();
            Thread.sleep(1000);
            dropdown.click();
            Thread.sleep(1000);
            dropdown.click();
            Thread.sleep(1000);
            link2.click();
            Thread.sleep(1000);
            dropdown.click();
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Prueba1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
