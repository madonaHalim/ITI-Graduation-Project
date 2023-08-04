package Tests;

import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class TestHome {
    public static  WebDriver driver ;
    @BeforeSuite


    public void OpenBrowser() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://demo.nopcommerce.com/");


    }
    @AfterSuite
//    @Test
//    public  void screenShot(ITestResult result)
//    {
//        if(result.getStatus()== ITestResult.FAILURE) {
//            Helper.captureScreenshot(driver, result.getName());
//        }
//
//
//
//    }


    public void scrollTo()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }

@AfterSuite

    public void CloseBrowser(){
        driver.quit();

    }


}
