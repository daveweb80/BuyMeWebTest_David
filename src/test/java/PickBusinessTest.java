import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class PickBusinessTest {
    @Test
    static void PickBusiness() {
        WebDriver driver = DriverSingleton.getDriverInstance();
        driver.get("https://buyme.co.il/supplier/765832");

        driver.findElement(By.id("ember927")).sendKeys("500");
        driver.findElement(By.xpath("//*/button[.='לבחירה']")).click();

        //driver.findElement(By.xpath("['למישהו אחר']/*//")).click();
        driver.findElement(By.id("ember1257")).sendKeys("יוסי");
        driver.findElement(By.id("ember1259")).sendKeys("דוד");

        driver.findElement(By.xpath("//*/textarea")).sendKeys("יום הולדת 20");
        //driver.findElement(By.id("step-2-later")).click();
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.id("step-2-later")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.id("step-2-now")));

        //driver.findElement(By.xpath("//*/*[class='chosen-search']/input")).sendKeys("סוכות");

        //driver.findElement(By.xpath("//a[.='לאיזה אירוע?']")).click();
        //driver.findElement(By.xpath("//a[.='לאיזה אירוע?']")).sendKeys("סוכות");

     }


}
