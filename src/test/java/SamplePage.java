import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SamplePage {
    private WebDriver driver;

    public SamplePage(){
        this.driver = DriverSingleton.getDriverInstance();
    }

    public void pressElement(){
        driver.findElement(By.id("123")).click();
    }
}

