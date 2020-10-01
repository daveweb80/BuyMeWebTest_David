import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePageTest {
    @Test
    static void searchVoucher()
    {
        LoginScreenTest.registeredUserLogin();

        WebDriver driver = DriverSingleton.getDriverInstance();
        driver.findElement(By.xpath("//a[.='אזור']")).click();
       // ((JavascriptExecutor)driver).executeScript("arguments[0].selected='selected';",
       //        driver.findElement(By.xpath("//*[@id='ember791']/option[2]")));

       // ((JavascriptExecutor)driver).executeScript("arguments[0].visible='';",driver.findElement(By.xpath("//*[@id='ember791']")));

       // Select drpPrice = new Select(driver.findElement(By.id("ember791")));
       // drpPrice.selectByVisibleText("מרכז");

        driver.findElement(By.id("ember833")).sendKeys("משולב מסעדות חיים כהן");
        driver.findElement(By.id("ember836")).click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      }
}
