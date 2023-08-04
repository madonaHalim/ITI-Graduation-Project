package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    public void clickLogin(WebDriver driver)
    {
        driver.findElement(By.className("ico-login")).click();
    }

    public void userName(WebDriver driver,String e_mail ,String pasword){
        By email = By.id("Email");
        WebElement emailEle = driver.findElement(email);
        emailEle.sendKeys(e_mail);

        By password = By.id("Password");
        WebElement passwordEle = driver.findElement(password);
        passwordEle.sendKeys(pasword);

    }
    public void loginButton(WebDriver driver){

        driver.findElement(By.xpath("//div//button[@class =\"button-1 login-button\"]")).click();
    }


    public void search(WebDriver driver, String searCh) {
        By search = By.id("small-searchterms");
        WebElement searchEle = driver.findElement(search);
        searchEle.click();
        searchEle.sendKeys(searCh);

    }

    public void clickSearch(WebDriver driver) {
        By searchbtn = By.xpath("//div//button[@class=\"button-1 search-box-button\"]");
        WebElement searchBtnEle = driver.findElement(searchbtn);
        searchBtnEle.click();
    }



}
