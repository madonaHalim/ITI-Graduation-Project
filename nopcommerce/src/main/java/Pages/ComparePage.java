package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComparePage {

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

    public void Categories(WebDriver driver){

        WebElement categoryEle = driver.findElement( By.cssSelector("a[href=\"/electronics\"]"));
        categoryEle.click();
    }


    public void subCategories(WebDriver driver){

        By subcategory =By.xpath("//div//img[@alt=\"Picture for category Cell phones\"]");
        WebElement subcategoryEle = driver.findElement(subcategory);
        subcategoryEle.click();
    }

    public void firstProduct(WebDriver driver){
        By product = By.xpath("//div//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000041_htc-one-m8-android-l-50-lollipop_415.jpeg\"]");
        WebElement productEle = driver.findElement(product);
        productEle.click();
    }
    public void addfirstProduct(WebDriver driver) throws InterruptedException {
        WebElement addEle = driver.findElement(By.className("compare-products"));
        addEle.click();
    }


    public void SecondCategories(WebDriver driver){

        By secondcategory = By.cssSelector("a[href=\"/electronics\"]");

        WebElement secondCategoryEle = driver.findElement(secondcategory);

        secondCategoryEle.click();
    }
    public void secondsubCategory(WebDriver driver) {

        By secondsubcategory = By.xpath("//div//img[@alt=\"Picture for category Cell phones\"]");
        WebElement secondSubCategoryEle = driver.findElement(secondsubcategory);
        secondSubCategoryEle.click();
    }



    public void secondProduct(WebDriver driver){
        By secondproduct =  By.xpath("//div//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000042_htc-one-mini-blue_415.jpeg\"]");
        WebElement secondProductEle = driver.findElement(secondproduct);
        secondProductEle.click();
    }

    public void addsecondProduct(WebDriver driver){
        WebElement addSecondEle = driver.findElement(By.className("compare-products"));
        addSecondEle.click();

    }


    public void ClickCart (WebDriver driver){
        WebElement clickCartEle = driver.findElement(By.xpath("//li//a[@href=\"/compareproducts\"]"));

        clickCartEle.click();
    }






}
