import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

    public static void main(String[] args) throws InterruptedException {

        String AmazonUrl="https://www.amazon.com/ref=nav_logo";
        String productName= "masks";
        String searchBoxLocator= "twotabsearchtextbox";

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shihab\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get(AmazonUrl);
        obj.manage().window().fullscreen();
        obj.manage().deleteAllCookies();
        obj.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        obj.findElement(By.id("nav-search-submit-button")).click();
        obj.findElement(By.id("n/17864516011")).click();
        obj.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();

        Thread.sleep(5000);

        obj.close();

    }
}

