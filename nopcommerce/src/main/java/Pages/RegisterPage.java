package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    public void clickRegister(WebDriver driver){
        driver.findElement(By.xpath("//div//a[@href =\"/register?returnUrl=%2F\" ]")).click();
    }



    public void Registration(WebDriver driver,String firstname ,String secondName ,String e_mail ,String userpassword ,String confirm_Password){

        WebElement firstnameEle = driver.findElement(By.id("FirstName"));
        firstnameEle.sendKeys(firstname);


        WebElement lastnameEle = driver.findElement( By.id("LastName"));
        lastnameEle.sendKeys(secondName);


        WebElement emailEle = driver.findElement(By.id("Email"));
        emailEle.sendKeys(e_mail);



        WebElement passwordEle = driver.findElement(By.id("Password"));
        passwordEle.sendKeys(userpassword);

        WebElement confirmPasswordEle = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordEle.sendKeys(confirm_Password);

    }



        public void chooseGender(WebDriver driver){

        driver.findElement(By.name("Gender")).click();
    }
    public void birthDate(WebDriver driver , int day ,int months ,int year) {

        Select selectday = new Select( driver.findElement(By.name("DateOfBirthDay")));
        selectday.selectByIndex(day);

        Select selectmonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        selectmonth.selectByIndex(months);

        Select selectyear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        selectyear.selectByIndex(year);
    }






    public void company(WebDriver driver ,String companyName) {
        By company = By.id("Company");
        WebElement companyEle = driver.findElement(company);
            companyEle.sendKeys(companyName);
    }




    public void  clickButton(WebDriver driver){

        driver.findElement(By.id("register-button")).click();
    }


    }
