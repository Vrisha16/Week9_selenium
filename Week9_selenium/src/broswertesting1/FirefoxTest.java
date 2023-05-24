package broswertesting1;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTest {
    static WebDriver driver;
    static String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static String expectedTitle =  "nopCommerce demo store. Login";//expected title

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.get(url);//lunch url
        driver.manage().window().maximize();//maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));//giving wait
        String actualTitle = driver.getTitle();//getting title of page.
        System.out.println("Title of page is:" + actualTitle);//printing title of page
       Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();//closing driver
    }
}



