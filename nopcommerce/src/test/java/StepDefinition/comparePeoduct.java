package StepDefinition;

import Pages.ComparePage;
import Pages.HomePage;
import Tests.TestHome;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class comparePeoduct {
    ComparePage compare = new ComparePage();
    HomePage home = new HomePage();

    @Given("^the_home_page$")
    public void open_browser() throws InterruptedException {
        home.OpenBrowser();
    }

    @When("^click-on-login-link$")
    public void login() throws InterruptedException {

        compare.clickLogin(home.driver);
        Thread.sleep(1000);


    }

    @And("^entered-data \"([^\"]*)\",\"([^\"]*)\"$")
    public void userlogin(String mail, String password) throws InterruptedException {
        compare.userName(home.driver, mail,password);
        Thread.sleep(1000);

    }

    @And ("^click_login_button$")
    public void click_login() throws InterruptedException {
        compare.loginButton(home.driver);
        Thread.sleep(1000);
    }



    @And("^Chooses_Category$")
    public void category_page(){
        compare.Categories(home.driver);

    }

    @And("choose the sub category")
    public void subcategory_page(){
        compare.subCategories(home.driver);

    }
    @And("Choose  first product")
    public void first_product()
    {
        compare.firstProduct(home.driver);
    }

    @And("Add item to the Compare list")
    public void add_first_product() throws InterruptedException {
        compare.addfirstProduct(home.driver);


    }

    @And("choose Another_category")
    public void second_category()
    {
        compare.SecondCategories(home.driver);
    }
    @And("go to The sub category")
    public void second_subCategory() {

        compare.secondsubCategory(home.driver);
    }

    @And("Choose Second product")
    public void second_product()
    {
        compare.secondProduct(home.driver);
    }

    @And("Add another Item to the compare list")
    public void addanother_Product(){
        compare.addsecondProduct(home.driver);

    }
    @Then("Click his compare list")
    public void click_cart(){
        compare.ClickCart(home.driver);

    }

    @And("user is redirected to the compare list page")
    public void compare_list() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/compareproducts", home.driver.getCurrentUrl());
        Thread.sleep(1000);

    }

    @And("end browser")
    public void close_browser() throws InterruptedException {


        home.CloseBrowser();
    }


}
