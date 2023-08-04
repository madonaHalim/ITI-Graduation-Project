package Tests;

import Pages.HomePage;
import Pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest extends TestHome{
    RegisterPage register = new RegisterPage();
    HomePage home = new HomePage( );

    @DataProvider(name = "testData")
    public static Object[][] userdata()
    {

        return new Object[][] {
                {"Madona" , "Halim","madonah6@gmail.com","123456","123456"},
                {"Mina","Halim","mina33@gmail.com","12345678","12345"}
        };
    }

@Test
    public void open_browser() throws InterruptedException {

        home.OpenBrowser();
    }
    @Test
    public void register_button() throws InterruptedException {

        register.clickRegister(home.driver);
        Thread.sleep(1000);


    }
//    @Test (priority=1,dataProvider="testData")
//    public void chooseGender() throws InterruptedException {
//        register.chooseGender(home.driver);
//        Thread.sleep(1000);
//
//    }
    @Test (dataProvider="testData")
    public void userRegistration(String firstname ,String secondName ,String e_mail ,String userpassword ,String confirm_Password) throws InterruptedException {

        register.Registration(home.driver,firstname,secondName,e_mail,userpassword,confirm_Password);
        Thread.sleep(1000);

    }

//    @Test
//    public void date_birth(int day,int month,int year) throws InterruptedException {
//
//       register .birthDate(home.driver,day,month,year);
//    Thread.sleep(3000);
//
//    }
//    @Test
//
//
//    public void company(String companyName) throws InterruptedException {
//
//        register.company(home.driver, companyName);
//        Thread.sleep(1000);
//
//    }

    @Test
    public void registerButton() throws InterruptedException {
        register.clickButton(home.driver);

        Thread.sleep(1000);
    }

    @Test
    public void home_page() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", home.driver.getCurrentUrl());

        Thread.sleep(1000);
    }
    @Test
    public void close_browser() {

        home.CloseBrowser();
    }




}
