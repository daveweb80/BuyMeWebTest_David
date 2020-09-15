import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMTest{
    public static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgotl\\Downloads\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com");
    }

    @Test
    public void test01(){
        TranslatePage translatePage = new TranslatePage(driver);
        translatePage.pressTextField();
        translatePage.SendTextToTranslate("hello");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
