package stepsA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook {
    WebDriver driver = null;
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Before Method");
    }

    public void cleanUp(){
        driver.quit();
        System.out.println("After Method");
    }
}
