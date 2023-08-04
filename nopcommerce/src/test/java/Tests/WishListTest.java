package Tests;

import Pages.HomePage;
import Pages.WishListPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WishListTest  extends TestHome{
    WishListPage wishListPage = new WishListPage();
    HomePage home = new HomePage();

    @DataProvider(name = "testData")
    public static Object[][] userdata()
    {

        return new Object[][] {
                {"madonah6@gmail.com","123456"},
                {"mina33@gmail.com","12345678"}
        };
    }


    @Test
    public void open_browser() throws InterruptedException {
        home.OpenBrowser();
    }

    @Test(dependsOnMethods ={"open_browser"})
    public void login() throws InterruptedException {

        wishListPage.clickLogin(home.driver);
        Thread.sleep(1000);


    }

    @Test(dataProvider="testData")
    public void userlogin(String mail, String password) throws InterruptedException {
        wishListPage.userName(home.driver, mail,password);
        Thread.sleep(1000);

    }
    @Test
    public void click_login() throws InterruptedException {
        wishListPage.loginButton(home.driver);
        Thread.sleep(1000);
    }



@Test
    public void category_page(){
        wishListPage.Categories(home.driver);

    }
    @Test
    public void subcategory_page(){
        wishListPage.subCategories(home.driver);

    }
    @Test
    public void first_product()
    {
        wishListPage.firstProduct(home.driver);
    }

    @Test
    public void add_first_product() throws InterruptedException {
        wishListPage.addfirstProduct(home.driver);


    }
//    @Test
//        public void second_category()
//    {
//        wishListPage.SecondCategories(home.driver);
//    }
//
//
//    @Test
//    public void second_product()
//    {
//        wishListPage.secondProduct(home.driver);
//    }
//    @Test
//    public void addanother_Product(){
//        wishListPage.addsecondProduct(home.driver);
//
//    }
    @Test
    public void click_cart(){
        wishListPage.ClickCartwishlist(home.driver);

    }
    @Test
    public void wish_list() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/wishlist", home.driver.getCurrentUrl());
        Thread.sleep(1000);

    }
    @Test
    public void close_browser() throws InterruptedException {


        home.CloseBrowser();
    }



}
