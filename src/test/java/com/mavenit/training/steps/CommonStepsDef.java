package com.mavenit.training.steps;

import com.mavenit.training.Hooks;
import com.mavenit.training.page_objects.HomePage;
import cucumber.api.java.en.Given;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.is;

public class CommonStepsDef  {

    private HomePage homePage= new HomePage();

    @Given("^Iam on a homepage$")
    public void iam_on_a_homepage() {
       String actual = homePage.getCUrrentUrl();
       assertThat(actual,is(endsWith("co.uk/")));
    }
}