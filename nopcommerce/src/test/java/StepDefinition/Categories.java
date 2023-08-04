package StepDefinition;

import Pages.CategoriesPage;
import Pages.HomePage;
import Tests.TestHome;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Categories  {
    CategoriesPage categoriesPage = new CategoriesPage();
    HomePage home = new HomePage();


    @Given("^the user in home_page$")
    public void open_browser() throws InterruptedException {
        home.OpenBrowser();
    }


    @When("^I click on login_link$")
    public void login() throws InterruptedException {

        categoriesPage.clickLogin(home.driver);
        Thread.sleep(1000);


    }
    @And("^I entered the user_data \"([^\"]*)\",\"([^\"]*)\"$")
    public void loginuser(String mail,String password) throws InterruptedException {
        categoriesPage.userName(home.driver, mail,password);
        Thread.sleep(1000);

    }

    @And ("clicks login_button")

    public void click_login() throws InterruptedException {
        categoriesPage.loginButton(home.driver);
        Thread.sleep(1000);
    }

    @Then("user click on any sub-category")
    public void category_page(){
        categoriesPage.Categories(home.driver);

    }

    @And ("user redirected to the sub category page")

    public void subcategory_page(){
        categoriesPage.subCategories(home.driver);

    }

    @And ("user close_browser")
    public void close_browser()  {


        home.CloseBrowser();
    }

}
