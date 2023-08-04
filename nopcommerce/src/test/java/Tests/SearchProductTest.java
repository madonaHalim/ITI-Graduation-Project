package Tests;

import Pages.HomePage;

import Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchProductTest extends TestHome{


    SearchPage search = new SearchPage() ;

    HomePage home = new HomePage();

    @DataProvider(name = "testData")
    public static Object[][] userdata()
    {

        return new Object[][] {
                {"madonah6@gmail.com","123456"},
                {"mina33@gmail.com","12345678"}
        };
    }

    @DataProvider(name = "searchdata")
    public static Object[][] searchdata()
    {

        return new Object[][] {
                {"computers"},
                {"Books"}
        };
    }

    @Test(priority=0)
    public void open_browser() throws InterruptedException {
        home.OpenBrowser();
    }

    @Test(dependsOnMethods ={"open_browser"})
    public void login() throws InterruptedException {

        search.clickLogin(home.driver);
        Thread.sleep(1000);


    }

    @Test(dataProvider="testData")
    public void userlogin(String mail, String password) throws InterruptedException {
        search.userName(home.driver, mail,password);
        Thread.sleep(1000);

    }

    @Test
    public void click_login() throws InterruptedException {
        search.loginButton(home.driver);
        Thread.sleep(1000);
    }

    @Test(dataProvider="searchdata")

    public void click_search(String productName) throws InterruptedException {
        search.search(home.driver,productName);
        Thread.sleep(1000);
    }


    @Test

    public void search_btn (){

        search.clickSearch(home.driver);
    }

    @Test

    public void search_page() throws InterruptedException {
        String url = home.driver.getCurrentUrl();
        Assert.assertEquals( "https://demo.nopcommerce.com/search?q=HTC+One+M8+Android+L+5.0+Lollipop",url);
        System.out.println(url);
        Thread.sleep(1000);
    }

    public void close_browser() throws InterruptedException {
        Thread.sleep(3000);
        home.CloseBrowser();
    }





}
