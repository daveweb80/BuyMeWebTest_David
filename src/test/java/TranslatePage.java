import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TranslatePage {
    private WebDriver driver;

    public TranslatePage(WebDriver driver){
        this.driver = driver;
    }

    public void pressTextField(){
        driver.findElement(By.id("source")).click();
    }

    public void SendTextToTranslate(String textToTranslate){
        driver.findElement(By.id("source")).sendKeys(textToTranslate);
    }
}
