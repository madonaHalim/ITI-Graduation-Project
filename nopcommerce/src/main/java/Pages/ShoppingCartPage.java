package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {

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



    public void Categories(WebDriver driver){

        WebElement categoryEle = driver.findElement( By.xpath("//div//a[@href=\"/computers\"]"));
        categoryEle.click();
    }


    public void subCategories(WebDriver driver){

        By subcategory = By.xpath("//div//img[@alt=\"Picture for category Notebooks\"]");
        WebElement subcategoryEle = driver.findElement(subcategory);
        subcategoryEle.click();
    }

    public void firstProduct(WebDriver driver){
        By product = By.xpath("//div//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]");
        WebElement productEle = driver.findElement(product);
        productEle.click();
    }
    public void addfirstProduct(WebDriver driver) throws InterruptedException {
        WebElement addEle = driver.findElement(By.id("add-to-cart-button-4"));
        addEle.click();
    }


    public void SecondCategories(WebDriver driver){

        By secondcategory = By.xpath("//div//a[@href=\"/books\"]");

        WebElement secondCategoryEle = driver.findElement(secondcategory);

        secondCategoryEle.click();
    }



    public void secondProduct(WebDriver driver){
        By secondproduct =By.xpath ("//div//img[@alt=\"Picture of First Prize Pies\"]");
        WebElement secondProductEle = driver.findElement(secondproduct);
        secondProductEle.click();
    }

    public void addsecondProduct(WebDriver driver){
        WebElement addSecondEle = driver.findElement(By.id("add-to-cart-button-38"));
        addSecondEle.click();

    }


    public void clickShoppingCart (WebDriver driver){

        WebElement clickCartEle = driver.findElement(By.className("cart-label"));
        clickCartEle.click();

    }


}
