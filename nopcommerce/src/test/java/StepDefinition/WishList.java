package StepDefinition;

import Pages.HomePage;
import Pages.WishListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WishList {

    WishListPage wishlist  = new WishListPage() ;

    HomePage home = new HomePage();

    @Given("^1_home page$")

    public void open_browser() throws InterruptedException {
        home.OpenBrowser();
    }


    @When("^2_click on login link$")
    public void login() throws InterruptedException {

        wishlist.clickLogin(home.driver);
        Thread.sleep(1000);


    }


    @And("^3_entered the name and password \"([^\"]*)\",\"([^\"]*)\"$")
    public void userlogin(String mail, String password) throws InterruptedException {
        wishlist.userName(home.driver, mail,password);
        Thread.sleep(1000);

    }


    @And ("^4_clicks login button$")
    public void click_login() throws InterruptedException {
        wishlist.loginButton(home.driver);
        Thread.sleep(1000);
    }

    @And ("^5_Chooses Category$")
    public void category_page(){
        wishlist.Categories(home.driver);

    }
    @And ("^6_go to The sub category$")
    public void subcategory_page(){
        wishlist.subCategories(home.driver);

    }
    @And ("^7_choose The first product$")
    public void first_product()
    {
        wishlist.firstProduct(home.driver);
    }

    @And ("^8_Add item to the wish list$")
    public void add_first_product() throws InterruptedException {
        wishlist.addfirstProduct(home.driver);


    }
    @And ("^9_choose Another category$")
    public void second_category()
    {
        wishlist.SecondCategories(home.driver);
    }


    @And ("^10_choose the Second product$")
    public void second_product()
    {
        wishlist.secondProduct(home.driver);
    }
    @And ("11_Add another Item to the wish list")
    public void addanother_Product(){
        wishlist.addsecondProduct(home.driver);

    }
    @And ("^9_Click his wish list$")
    public void click_cart(){
        wishlist.ClickCartwishlist(home.driver);

    }
    @And ("10_user is redirected to the wish list page")
    public void wish_list() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/wishlist", home.driver.getCurrentUrl());
        Thread.sleep(1000);

    }

}
