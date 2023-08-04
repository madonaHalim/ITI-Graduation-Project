package StepDefinition;

import Pages.HomePage;

import Pages.ShoppingCartPage;
import Tests.TestHome;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class Shopping  {
    ShoppingCartPage shoppingcart  = new ShoppingCartPage() ;

    HomePage home = new HomePage();


    @Given("^the_user in home page$")

    public void open_browser() throws InterruptedException {
        home.OpenBrowser();
    }


    @When("^I-click-on-login-link$")
    public void login() throws InterruptedException {

        shoppingcart.clickLogin(home.driver);
        Thread.sleep(1000);


    }


    @And("^entered-login data \"([^\"]*)\",\"([^\"]*)\"$")
    public void userlogin(String mail, String password) throws InterruptedException {
        shoppingcart.userName(home.driver, mail,password);
        Thread.sleep(1000);

    }


    @And ("clicks-login-button")
    public void click_login() throws InterruptedException {
        shoppingcart.loginButton(home.driver);
        Thread.sleep(1000);
    }

    @And("Chooses category")
    public void category_page(){
        shoppingcart.Categories(home.driver);

    }
    @And("Chooses subcategory")
    public void subcategory_page(){
        shoppingcart.subCategories(home.driver);

    }
    @And("choose the first product")
    public void first_product()
    {
        shoppingcart.firstProduct(home.driver);
    }

    @And("Add item")
    public void add_first_product() throws InterruptedException {
        shoppingcart.addfirstProduct(home.driver);


    }
    @And("choose another category")
    public void second_category()
    {
        shoppingcart.SecondCategories(home.driver);
    }


    @And("choose the second product")
    public void second_product()
    {
        shoppingcart.secondProduct(home.driver);
    }
    @And("Add another Item")
    public void addanother_Product(){
        shoppingcart.addsecondProduct(home.driver);

    }
    @And("click his shopping cart")
    public void click_cart(){
        shoppingcart.clickShoppingCart(home.driver);

    }
    @And("^user is redirected to the shopping cart$")
    public void shopping_cart() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/cart", home.driver.getCurrentUrl());
        Thread.sleep(1000);

    }
    @And("^close_browser$")
    public void close_browser()  {


        home.CloseBrowser();
    }





}
