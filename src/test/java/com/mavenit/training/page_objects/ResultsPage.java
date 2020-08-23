package com.mavenit.training.page_objects;

import com.mavenit.training.driver.DriverManager;
import com.mavenit.training.utils.RandomHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends DriverManager {


    public String selectAnyProduct() {
        //select a product
        List<WebElement> products = driver.findElements(By.cssSelector("a[data-test='component-product-card-title']"));
        int indexNumber = new RandomHelper().randomNumber(products.size());
        WebElement selectedElement = products.get(indexNumber);
        String expected = selectedElement.getText();    // rem
        selectedElement.click();
        sleep(5000);
        return expected;
    }


    public void selectAnyCustomerRating(String choice) {
        //collect all webelement
        // forloop
        // get text of each element
        //select rating that intreset
        // break
        List<WebElement> ratingElements = driver.findElements(By.cssSelector("#content-container label"));
        for (WebElement ratingElement : ratingElements) {
            String ratingLabel = ratingElement.getText();
            if (ratingLabel.equalsIgnoreCase(choice)) {
                ratingElement.click();
                break;
            }
        }
    }

    public List<Double>  getAllProductsRatings() {
        //welements all svg
        // for
        // read dom values
        //store every product rating in list
        // assert
        List<Double> ratingCollection = new ArrayList<>();   // to collect all rating

        List<WebElement> ratingLables = driver.findElements(By.cssSelector("div[data-test='component-ratings']"));
        for (WebElement ratingLable: ratingLables){
            String ratingValue = ratingLable.getAttribute("data-star-rating");
            double ratingValueInDouble = Double.parseDouble(ratingValue);
            ratingCollection.add(ratingValueInDouble);
        }
        return ratingCollection;
    }
}
