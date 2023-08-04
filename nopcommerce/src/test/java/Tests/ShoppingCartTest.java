package Tests;

import Pages.HomePage;
import Pages.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShoppingCartTest extends TestHome {

    ShoppingCartPage shoppingcartPage = new ShoppingCartPage();
    HomePage home = new HomePage();

    @DataProvider(name = "testData")
    public static Object[][] userdata()
    {

        return new Object[][] {
                {"madonah6@gmail.com","123456"},
                {"mina33@gmail.com","12345678"}
        };
    }


    public void open_browser() throws InterruptedException {
        home.OpenBrowser();
    }

    @Test(dependsOnMethods ={"open_browser"})
    public void login() throws InterruptedException {

        shoppingcartPage.clickLogin(home.driver);
        Thread.sleep(1000);


    }

    @Test(dataProvider="testData")
    public void userlogin(String mail, String password) throws InterruptedException {
        shoppingcartPage.userName(home.driver, mail,password);
        Thread.sleep(1000);

    }

    @Test
    public void click_login() throws InterruptedException {
        shoppingcartPage.loginButton(home.driver);
        Thread.sleep(1000);
    }




    @Test
    public void category_page(){
        shoppingcartPage.Categories(home.driver);

    }
    @Test
    public void subcategory_page(){
        shoppingcartPage.subCategories(home.driver);

    }
    @Test
    public void first_product()
    {
        shoppingcartPage.firstProduct(home.driver);
    }

    @Test
    public void add_first_product() throws InterruptedException {
        shoppingcartPage.addfirstProduct(home.driver);


    }
    @Test
    public void second_category()
    {
        shoppingcartPage.SecondCategories(home.driver);
    }


    @Test
    public void second_product()
    {
        shoppingcartPage.secondProduct(home.driver);
    }
    @Test
    public void addanother_Product(){
        shoppingcartPage.addsecondProduct(home.driver);

    }
    @Test
    public void click_cart(){
        shoppingcartPage.clickShoppingCart(home.driver);

    }
    @Test
    public void shopping_cart() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/cart", home.driver.getCurrentUrl());
        Thread.sleep(1000);

    }
    @Test
    public void close_browser()  {


        home.CloseBrowser();
    }



}
