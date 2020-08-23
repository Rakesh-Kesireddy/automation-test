package com.mavenit.training.steps;

import com.mavenit.training.page_objects.HomePage;
import com.mavenit.training.page_objects.ResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;

public class SearchStepDef {

    private HomePage homePage = new HomePage();

    private String searchItem;

    @Then("^I should be see respective products$")
    public void i_should_be_see_respective_products() {
        String actualURL = homePage.getCUrrentUrl();
        assertThat(actualURL, endsWith(searchItem));
    }

    @When("^I do a search for a product \"([^\"]*)\"$")
    public void iDoASearchForAProduct(String item) {
        searchItem=item;
        homePage.doSearch(item);

    }
}
