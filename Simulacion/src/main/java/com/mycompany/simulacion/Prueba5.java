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

public class Prueba5 {
    
    public void keyPresses(){
        System.setProperty("webdriver.chrome.driver", 
                "C:\\Users\\JOSE ENRIQUE\\OneDrive - Universidad Fidélitas\\Cuarto Cuatri\\Calidad del software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/key_presses");
        WebElement add = driver.findElement(By.xpath("//form/input"));
        String[] teclas = {"a", "b","c","d"};
        try {
            for(int i =0;i<teclas.length;i++){
                add.sendKeys(teclas[i]);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Prueba1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
