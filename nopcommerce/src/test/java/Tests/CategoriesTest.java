package Tests;

import Pages.CategoriesPage;
import Pages.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CategoriesTest extends TestHome {
    CategoriesPage categoriesPage = new CategoriesPage();
    HomePage home = new HomePage();
    @DataProvider(name = "testData")
    public static Object[][] userdata()
    {

        return new Object[][] {
                {"madonah6@gmail.com","123456"},
                {"mina33@gmail.com","12345678"}
        };
    }



    @Test(priority=1)
    public void open_browser() throws InterruptedException {
        home.OpenBrowser();
    }

    @Test(dependsOnMethods ={"open_browser"})
    public void login() throws InterruptedException {

        categoriesPage.clickLogin(home.driver);
        Thread.sleep(1000);


    }

    @Test(dataProvider="testData")
    public void loginuser(String mail,String password) throws InterruptedException {
        categoriesPage.userName(home.driver, mail,password);
        Thread.sleep(1000);

    }

    @Test
    public void click_login() throws InterruptedException {
        categoriesPage.loginButton(home.driver);
        Thread.sleep(1000);
    }

@Test
    public void category_page(){
        categoriesPage.Categories(home.driver);

    }
   @Test
    public void subcategory_page(){
       categoriesPage.subCategories(home.driver);

    }
    @Test
    public void close_browser()  {


        home.CloseBrowser();
    }



}
