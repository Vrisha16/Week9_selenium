package browsertesting4;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest {
    static WebDriver driver;
    static String url = "https://www.saucedemo.com/";

    static String expectedTitle = "Swag Labs";//expected title

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();//setting webdriver
        //options.addArguments("--remote-allow-origins=*);
        driver = new ChromeDriver(options);
        driver.get(url);//launch url
        driver.manage().window().maximize();//maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));//giving wait
        String actualTitle = driver.getTitle();//gettimg title of page
        System.out.println("Title of page is : " + actualTitle); //printing title of page
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();//closing driver

    }

}
