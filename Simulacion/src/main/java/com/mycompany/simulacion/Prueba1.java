package com.mycompany.simulacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba1 {
    
    public void addElements(){
        System.setProperty("webdriver.chrome.driver", 
                "C:\\Users\\JOSE ENRIQUE\\OneDrive - Universidad Fidélitas\\Cuarto Cuatri\\Calidad del software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement add = driver.findElement(By.xpath("//div/button"));
        
        try {
            for(int i =0;i<3;i++){
                add.click();
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Prueba1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
    }
}
