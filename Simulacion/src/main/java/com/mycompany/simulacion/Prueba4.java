/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author JOSE ENRIQUE
 */
public class Prueba4 {
    
    public void newWindow(){
        System.setProperty("webdriver.chrome.driver", 
                "C:\\Users\\JOSE ENRIQUE\\OneDrive - Universidad Fidélitas\\Cuarto Cuatri\\Calidad del software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");
        
         WebElement newW = driver.findElement(By.cssSelector("a[href='/windows/new']"));
        newW.click();
    }
}
