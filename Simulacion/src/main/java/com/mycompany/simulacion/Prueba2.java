/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba2 {
    
    public void redirect(){
        System.setProperty("webdriver.chrome.driver", 
                "C:\\Users\\JOSE ENRIQUE\\OneDrive - Universidad Fidélitas\\Cuarto Cuatri\\Calidad del software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/redirector");
        
        WebElement redirect = driver.findElement(By.id("redirect"));
        redirect.click();
    }
}
