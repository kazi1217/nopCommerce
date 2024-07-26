package stepsA;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCaseA {
    WebDriver driver = null;

    @Given("User in a Home Page")
    public void user_in_a_home_page() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.quit();
    }

    @When("User click on Register link")
    public void user_click_on_register_link() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //a[@class='ico-register']
        //a[text()='Register']
        WebElement RegisterLink= driver.findElement(By.xpath(" //a[text()='Register']"));
        RegisterLink.click();
        driver.quit();

    }

    @Then("user should fill up the from with their information")


    public void user_should_fill_up_the_from_with_their_information() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //a[@class='ico-register'] //a[text()='Register']

        WebElement RegisterLink= driver.findElement(By.xpath(" //a[text()='Register']"));
        RegisterLink.click();

        WebElement gender= driver.findElement(By.xpath("//input[@id='gender-male']"));
        gender.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Kazi");
        Thread.sleep(2000);

        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Rahman");
        Thread.sleep(2000);


        Select day = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        day.selectByIndex(17);
        Thread.sleep(1000);
        Select month = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
        month.selectByVisibleText("March");
        Thread.sleep(1000);
        Select year = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
        year.selectByValue("1988");

        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("kazi1217tanu@gmail.com");
        Thread.sleep(2000);

        WebElement companyName = driver.findElement(By.xpath("//input[@id='Company']"));
        companyName.sendKeys("MegaTechs");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("1971Bangladesh");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("1971Bangladesh");
        Thread.sleep(2000);

        WebElement confirmRegister = driver.findElement(By.xpath("//button[@id='register-button']"));
        confirmRegister.click();
        Thread.sleep(2000);

        driver.close();
    }
}
