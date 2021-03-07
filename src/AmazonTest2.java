import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest2 {

    WebDriver driver;
    String AmazonUrl = "https://www.amazon.com";
    String productName = "Mask";
    String searchBoxLocator = "twotabsearchtextbox";
    String getSearchBoxLocator = "nav-search-submit-button";

    @BeforeMethod
    public void setUp() {

        String chromeDriverPath = "C:\\Users\\Shihab\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }



    //action method
    public void checkSearchBox() {

        driver.get(AmazonUrl);
        //enter product name
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        //driver.close();


    }
}
