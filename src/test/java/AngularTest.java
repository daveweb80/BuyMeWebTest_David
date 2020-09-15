import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AngularTest {
    private static ChromeDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgotl\\Downloads\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        NgWebDriver ngWebDriver = new NgWebDriver(driver);
        ngWebDriver.waitForAngularRequestsToFinish();
        driver.get("https://dgotlieb.github.io/Selenium-Hands-On/Angular/angular.html");
    }

    @Test
    public void test01_useAngularLocator() {
        driver.findElement(ByAngular.model("word")).sendKeys("hello");
    }

    @Test
    public void test02_useRegularLocator() {
        driver.findElement(By.className("ng-valid")).sendKeys(" world");
    }

    @AfterClass
    public static void tearDown() {
       // driver.quit();
    }
}

