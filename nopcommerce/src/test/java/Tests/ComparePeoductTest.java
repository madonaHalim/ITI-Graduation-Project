package Tests;

import Pages.ComparePage;
import Pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComparePeoductTest extends TestHome {

    ComparePage compare = new ComparePage();
    HomePage home = new HomePage();

    @DataProvider(name = "testData")
    public static Object[][] userdata()
    {

        return new Object[][] {
                {"madonah6@gmail.com","123456"},
                {"mina33@gmail.com","12345678"}
        };
    }
    @Test(priority=0)
    public void open_browser() throws InterruptedException {
        home.OpenBrowser();
    }

    @Test(dependsOnMethods ={"open_browser"})
    public void login() throws InterruptedException {

        compare.clickLogin(home.driver);
        Thread.sleep(1000);


    }

    @Test(dataProvider="testData")
    public void userlogin(String mail, String password) throws InterruptedException {
        compare.userName(home.driver, mail,password);
        Thread.sleep(1000);

    }

    @Test
    public void click_login() throws InterruptedException {
        compare.loginButton(home.driver);
        Thread.sleep(1000);
    }



    @Test
    public void category_page(){
        compare.Categories(home.driver);

    }
    @Test
    public void subcategory_page(){
        compare.subCategories(home.driver);

    }
    @Test
    public void first_product()
    {
        compare.firstProduct(home.driver);
    }

    @Test
    public void add_first_product() throws InterruptedException {
        compare.addfirstProduct(home.driver);


    }
    @Test
    public void second_category()
    {
        compare.SecondCategories(home.driver);
    }
@Test
    public void second_subcategory()
    {
        compare.secondsubCategory(home.driver);
    }

    @Test
    public void second_product()
    {
        compare.secondProduct(home.driver);
    }
    @Test
    public void addanother_Product(){
        compare.addsecondProduct(home.driver);

    }
    @Test
    public void click_cart(){
        compare.ClickCart(home.driver);

    }
    @Test
    public void compare_list() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/compareproducts", home.driver.getCurrentUrl());
        Thread.sleep(1000);

    }
    @Test
    public void close_browser() throws InterruptedException {


        home.CloseBrowser();
    }


}
