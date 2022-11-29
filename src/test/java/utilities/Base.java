package utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;


public class Base
{
    public static WebDriver driver;

    @BeforeClass
    public  void setupBrowser() throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://app.cloudlex.net/#/login");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @AfterClass
    public   void tearDown()
    {
        driver.quit();
    }

    public static void main(String[] args) {

    }

}
