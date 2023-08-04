package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestHome {
    LoginPage login = new LoginPage() ;

    HomePage home = new HomePage();

    @DataProvider(name = "userlogin")
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
    public void userlogin() throws InterruptedException {

        login.clickLogin(home.driver);
        Thread.sleep(1000);


    }

    @Test (dataProvider="userlogin")
    public void userlogin(String mail, String password) throws InterruptedException {
        login.userName(home.driver, mail,password);
        Thread.sleep(1000);

    }

    @Test
    public void click_login() throws InterruptedException {
        login.loginButton(home.driver);
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods ={"click_login"})
    public void logout() throws InterruptedException {

        login.clickLogout(home.driver);
        Thread.sleep(1000);


    }

    @Test
    public void home_page() throws InterruptedException {
        String url = home.driver.getCurrentUrl();
        Assert.assertEquals( "https://demo.nopcommerce.com/",url);
        System.out.println(url);
        Thread.sleep(1000);

    }

    @Test
    public void end_browser() throws InterruptedException {
        Thread.sleep(2000);
        home.CloseBrowser();
    }

}
