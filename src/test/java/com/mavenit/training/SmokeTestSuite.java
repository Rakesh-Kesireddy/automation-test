//package com.mavenit.training;
//
//
//import com.mavenit.training.page_objects.HomePage;
//import com.mavenit.training.page_objects.ProdcutDescriptionPage;
//import com.mavenit.training.page_objects.ResultsPage;
//import com.mavenit.training.page_objects.TrolleyPage;
//import org.junit.Test;
//
//import java.util.List;
//
//import static java.lang.Thread.sleep;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*;
//
//public class SmokeTestSuite extends Hooks {
//
//    private HomePage homePage = new HomePage();
//    private ResultsPage resultsPage = new ResultsPage();
//    private TrolleyPage trolleyPage = new TrolleyPage();
//    private ProdcutDescriptionPage desPage = new ProdcutDescriptionPage();
//
//    @Test
//    public void searchTest() {
//        homePage.doSearch("watch");
//        String actualHeader = homePage.getHeader();
//        assertThat(actualHeader, is(equalToIgnoringCase("Nike")));
//        String actualURL = homePage.getCUrrentUrl();
//        assertThat(actualURL, endsWith("nike"));
//    }
//
//    @Test
//    public void basketTest() {
//        homePage.doSearch("nike");
//        String selectedProduct = resultsPage.selectAnyProduct();
//        desPage.addToTrolley();
//        desPage.goToTrolley();
//        List<String> trolleyItems = trolleyPage.getProductsInTrolley();
//        assertThat(trolleyItems, hasItem(selectedProduct));
//    }
//
//
//    @Test
//    public void customerRatingTest() throws InterruptedException {
//        //search // select  review  // wait for page refresh  //collect all prodcut rating // assert
//        homePage.doSearch("nike");
//        resultsPage.selectAnyCustomerRating("Show All");
//        sleep(5000);
//        List<Double> allProductsRatings = resultsPage.getAllProductsRatings();
//        //assert  HW   Hint:  greaterThanOrEuals       everyItem
//        assertThat(allProductsRatings,everyItem(greaterThanOrEqualTo(4.0)));
//    }
//
//
//    @Test
//    public void trolleyQuantityTest() {
//        homePage.doSearch("nike");
//        resultsPage.selectAnyProduct();
//        desPage.addToTrolley();
//        desPage.goToTrolley();
//
//        double priceForOneQuan = trolleyPage.getPriceFromBasket();
//        double expected = priceForOneQuan * 3;
//
//        //actual
//        trolleyPage.selectQuantity();
//        double actual = trolleyPage.getPriceFromBasket();
//
//        assertThat(expected, is(equalTo(actual)));
//
////        new Select(driver.findElement(By.cssSelector("select[data-e2e='product-quantity']"))).selectByIndex(2);
////        new Select(driver.findElement(By.cssSelector("select[data-e2e='product-quantity']"))).selectByValue("3");
//    }
//}
