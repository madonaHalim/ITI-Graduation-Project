package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoriesPage {

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


    public void Categories(WebDriver driver) {

        WebElement categoryEle = driver.findElement(By.xpath("//div//a[@href=\"/computers\"]"));

        categoryEle.click();
    }

    public void subCategories(WebDriver driver) {

        WebElement subcategoryEle = driver.findElement(By.xpath("//div//img[@alt=\"Picture for category Desktops\"]"));
        subcategoryEle.click();
    }
}

