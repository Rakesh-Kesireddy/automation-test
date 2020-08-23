package com.mavenit.training.page_objects;

import com.mavenit.training.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class TrolleyPage extends DriverManager {
    public List<String> getProductsInTrolley() {
        List<String> allProductsInTrolley = new ArrayList<>();

        List<WebElement> prodcutInTrolley = driver.findElements(By.className("ProductCard__titleLink__1PgaZ"));
        for (WebElement webElement : prodcutInTrolley) {
            String prodcut = webElement.getText();
            allProductsInTrolley.add(prodcut);
        }
        return allProductsInTrolley;

    }

    public double getPriceFromBasket() {
        String priceInString = driver.findElement(By.cssSelector("span[data-e2e='product-line-price']")).getText().replace("£", "");
        // how to convert string -> double  casting
        double priceInDoble = Double.parseDouble(priceInString);
        return priceInDoble;
    }

    public void selectQuantity(){
        new Select(driver.findElement(By.cssSelector("select[data-e2e='product-quantity']"))).selectByVisibleText("3");
        sleep(4000); /// this will be remove when webdriver wait starts
    }

}
