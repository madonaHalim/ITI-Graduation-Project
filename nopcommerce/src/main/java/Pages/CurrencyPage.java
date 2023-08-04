package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CurrencyPage {

    public void clickLogin(WebDriver driver) {
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

    public void loginButton(WebDriver driver) {

        driver.findElement(By.xpath("//div//button[@class =\"button-1 login-button\"]")).click();
    }


    public void chooseCurrency(WebDriver driver) {
        WebElement currencyEl = driver.findElement(By.name("customerCurrency"));
        currencyEl.click();
        Select select = new Select(currencyEl);
        select.selectByIndex(1);
    }
}
