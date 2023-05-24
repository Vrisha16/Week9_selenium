package browsertesting2;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest {
    static WebDriver driver;
    static String url= "https://opensource-demo.orangehrmlive.com/";
    static String expectedTitle = "OrangeHRM";


    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.get(url);//launch url
        driver.manage().window().maximize();//maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));//giving wait
        String actualTitle = driver.getTitle();//getting title of page
        System.out.println("Title of page is:"+ actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();//closing driver

    }
}
