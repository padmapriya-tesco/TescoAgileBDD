package Tesco;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.testng.Assert;

/**
 * Created by Dell on 26/04/2017.
 */
public class MyStepdefs extends BasePage {

    HomePage homePage = new HomePage();

    @Given("^User is on Tesco home page$")
    public void userIsOnTescoHomePage() throws Throwable {
        homePage.userIsOnHomePage();
        Assert.assertTrue(driver.getCurrentUrl().contains("signin"),"User is not on HomePage");

    }

    @When("^User search for any \"([^\"]*)\"on search menu$")
    public void User_search_for_any_on_search_menu(String product) {
        homePage.userShouldAbleToSearchAnyProduct(product);

    }

    @Then("^User should able to view all related \"([^\"]*)\" as a search result$")
    public void userShouldAbleToViewAllRelatedAsASearchResult(String product) {
        homePage.verifySearchResult(product);

    }
}
