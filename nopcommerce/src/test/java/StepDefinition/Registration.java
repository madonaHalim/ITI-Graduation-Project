package StepDefinition;

import Pages.HomePage;
import Pages.RegisterPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class Registration  {
    RegisterPage register = new RegisterPage();
    HomePage home = new HomePage();


    @Given("the user in home page")
    public void the_user_in_home_page() throws InterruptedException {
       home.OpenBrowser();

    }

    @When("I click on register link")
    public void i_click_on_register_link() throws InterruptedException {
        register.clickRegister(home.driver);
        Thread.sleep(1000);
    }




    @And("^I entered \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void userRegistration(String firstname, String secondName, String e_mail, String userpassword, String confirm_Password) throws InterruptedException {

        register.Registration(home.driver, firstname, secondName, e_mail, userpassword, confirm_Password);
        Thread.sleep(1000);

    }

    @Then("clicks register button")
    public void registerButton() throws InterruptedException {
        register.clickButton(home.driver);

        Thread.sleep(1000);
    }

    @Then("the Registration page displayed successfully")
    public void home_page() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", home.driver.getCurrentUrl());
        Thread.sleep(1000);


    }

    @And("user quit the Browser")
    public void close_browser()  {


        home.CloseBrowser();
    }

}

