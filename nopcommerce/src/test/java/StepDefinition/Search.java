package StepDefinition;

import Pages.HomePage;
import Pages.SearchPage;
import Tests.TestHome;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Search {


        SearchPage search = new SearchPage() ;

        HomePage home = new HomePage();

    @Given("^home page$")

        public void open_browser() throws InterruptedException {
            home.OpenBrowser();
        }

    @When("^login link$")
        public void login() throws InterruptedException {

            search.clickLogin(home.driver);
            Thread.sleep(1000);


        }

    @And("^I entered user \"([^\"]*)\",\"([^\"]*)\"$")
        public void userlogin(String mail, String password) throws InterruptedException {
            search.userName(home.driver, mail,password);
            Thread.sleep(1000);

        }

    @And ("^clicks login$")
        public void click_login() throws InterruptedException {
            search.loginButton(home.driver);
            Thread.sleep(1000);
        }

    @And("^i entered search data \"([^\"]*)\"$")

        public void click_search(String productName) throws InterruptedException {
            search.search(home.driver,productName);
            Thread.sleep(1000);
        }


    @And("i click search")

        public void search_btn (){

            search.clickSearch(home.driver);
        }

    @Then("the search page displayed succesfully")

        public void search_page() throws InterruptedException {
            String url = home.driver.getCurrentUrl();
            Assert.assertEquals( "https://demo.nopcommerce.com/search?q=HTC+One+M8+Android+L+5.0+Lollipop",url);
            System.out.println(url);
            Thread.sleep(1000);
        }



    }

