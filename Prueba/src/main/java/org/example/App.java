package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("start-maximized");
       // edgeOptions.addArguments("--remote-allow-origins=*");


        WebDriverManager.edgedriver().setup();

        WebDriver pDriver = new EdgeDriver(edgeOptions);


        pDriver.get("https://www.saucedemo.com/");
        pDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        pDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        pDriver.findElement(By.id("login-button")).click();
        pDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        pDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        pDriver.findElement(By.id("shopping_cart_container")).click();
        pDriver.findElement(By.id("remove-sauce-labs-bike-light")).click();
        pDriver.findElement(By.id("checkout")).click();
        pDriver.findElement(By.name("firstName")).sendKeys("Mario");
        pDriver.findElement(By.name("lastName")).sendKeys("Valencia");
        pDriver.findElement(By.name("postalCode")).sendKeys("503");
        pDriver.findElement(By.id("continue")).click();

        pDriver.quit();
    }
}
