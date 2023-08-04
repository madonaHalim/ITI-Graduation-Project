package Tests;

import Pages.CurrencyPage;
import Pages.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SelectCrrencyTest extends TestHome {

    CurrencyPage currency = new CurrencyPage() ;

    HomePage home = new HomePage();

    @DataProvider(name = "testData")
    public static Object[][] userdata()
    {

        return new Object[][] {
                {"madonah6@gmail.com","123456"},
                {"mina33@gmail.com","12345678"}
        };
    }

    @Test(dependsOnMethods ={"open_browser"})
    public void userlogin() throws InterruptedException {

        currency.clickLogin(home.driver);
        Thread.sleep(1000);


    }

    @Test(priority=0)
    public void open_browser() throws InterruptedException {
        home.OpenBrowser();
    }

    @Test(dependsOnMethods ={"open_browser"})
    public void login() throws InterruptedException {

        currency.clickLogin(home.driver);
        Thread.sleep(1000);


    }

    @Test(dataProvider="testData")
    public void userlogin(String mail, String password) throws InterruptedException {
        currency.userName(home.driver, mail,password);
        Thread.sleep(1000);

    }

    @Test
    public void click_login() throws InterruptedException {
        currency.loginButton(home.driver);
        Thread.sleep(1000);
    }
    @Test
    public void choose_currecny(){
        currency.chooseCurrency(home.driver);

    }
@Test
    public void close_browser() throws InterruptedException {
        Thread.sleep(3000);
        home.CloseBrowser();
    }


}
