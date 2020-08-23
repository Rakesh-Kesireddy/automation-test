package com.mavenit.training.page_objects;

import com.mavenit.training.driver.DriverManager;
import org.openqa.selenium.By;

public class ProdcutDescriptionPage extends DriverManager {

    public void addToTrolley() {
        driver.findElement(By.cssSelector(".add-to-trolley-main")).click();
        sleep(5000);

    }

    public void goToTrolley() {
        driver.findElement(By.linkText("Go to Trolley")).click();
        sleep(5000);
    }
}
