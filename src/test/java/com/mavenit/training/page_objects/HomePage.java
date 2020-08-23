package com.mavenit.training.page_objects;

import com.mavenit.training.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage extends DriverManager{

    public void doSearch(String item) {
        WebElement searchBox = driver.findElement(By.id("searchTerm"));
        searchBox.sendKeys(item);
        searchBox.sendKeys(Keys.ENTER);
        sleep(3000);
    }

    public String getHeader(){
       return driver.findElement(By.cssSelector(".styles__SearchTerm-sc-1haccah-1")).getText();
    }

    public String getCUrrentUrl(){
        return driver.getCurrentUrl();

    }

}
