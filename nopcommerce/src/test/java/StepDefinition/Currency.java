package StepDefinition;

import Pages.CurrencyPage;
import Pages.HomePage;
import Pages.LoginPage;
import Tests.TestHome;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Currency {

    CurrencyPage currenCy = new CurrencyPage() ;

    HomePage home = new HomePage();


    @Given("^home_page$")

    public void open_browser() throws InterruptedException {
        home.OpenBrowser();
    }


    @When("^I click login$")
    public void login() throws InterruptedException {

        currenCy.clickLogin(home.driver);
        Thread.sleep(1000);


    }


    @And("^I entered \"([^\"]*)\",\"([^\"]*)\"$")
    public void userlogin(String mail, String password) throws InterruptedException {
        currenCy.userName(home.driver, mail,password);
        Thread.sleep(1000);

    }


    @And ("^login button$")
    public void click_login() throws InterruptedException {
        currenCy.loginButton(home.driver);
        Thread.sleep(1000);
    }

    @Then("choose the Euro currency")
    public void choose_currecny()
    {
        currenCy.chooseCurrency(this.home.driver);
    }

    @And("user Close browser")
    public void close_browser() throws InterruptedException {
        this.home.CloseBrowser();
    }
}
