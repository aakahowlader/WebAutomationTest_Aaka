import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest {


    String AmazonUrl = "https://www.amazon.com";
    String productName = "masks";
    String searchBoxLocator = "twotabsearchtextbox";
    WebDriver obj = new ChromeDriver();


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shihab\\chromedriver.exe");
        obj.get(AmazonUrl);

    }
    @Test
    public void checkSearchBox(){
        obj.get(AmazonUrl);
        obj.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        obj.findElement(By.id("nav-search-submit-button")).click();
    }

    @AfterMethod

    public void tearDown(){
        obj.quit();
        obj.close();
    }


}
