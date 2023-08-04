package StepDefinition;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Login {

        LoginPage login = new LoginPage() ;

        HomePage home = new HomePage();


        @Given("user in home page")

        public void open_browser() throws InterruptedException {
            home.OpenBrowser();
        }


    @When("click on login link")
        public void login() throws InterruptedException {

            login.clickLogin(home.driver);
            Thread.sleep(1000);


        }


        @And("^entered \"([^\"]*)\",\"([^\"]*)\"$")
        public void userlogin(String mail, String password) throws InterruptedException {
            login.userName(home.driver, mail,password);
            Thread.sleep(1000);

        }


    @And ("^click login button$")
        public void click_login() throws InterruptedException {
            login.loginButton(home.driver);
            Thread.sleep(1000);
        }




    @Then("the login page display successful")
        public void home_page() throws InterruptedException {
            String url = home.driver.getCurrentUrl();
            Assert.assertEquals( "https://demo.nopcommerce.com/",url);
            System.out.println(url);
            Thread.sleep(1000);

        }
    @And ("logout")
    public void logout() throws InterruptedException {

        login.clickLogout(home.driver);
        Thread.sleep(1000);


    }


    @And("quit the Browser")
        public void end_browser() throws InterruptedException {
            Thread.sleep(2000);
            home.CloseBrowser();
        }

    }


