import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage extends BasePage  {

    @Test
    public void login() throws Exception {
        // Enter the main login screenWebDriver driver = DriverSingleton.getDriverInstance();
        WebDriver driver = DriverSingleton.getDriverInstance();
        String testingSiteURL = getData ("URL");
        driver.get(testingSiteURL);
        WebElement btn = driver.findElement(By.xpath("//div[@class='login-btn-wrapper']/button"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", btn);

        enterCredentials();
        pressLogin();

        Report rep = new Report();
        rep.test.log(rep.status_pass(), "Logging of a registered user is O.K");
    }

    @Test
    public void newUserLogin() throws Exception{
        WebDriver driver = DriverSingleton.getDriverInstance();
        String testingSiteURL = getData ("URL");
        driver.get(testingSiteURL);
        // Enter the main login screen
        WebElement btn = driver.findElement(By.xpath("//div[@class='login-btn-wrapper']/button"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", btn);

        // Enter new user registration screen
        WebElement btn2 = driver.findElement(By.xpath("//span[@data-ember-action='1196']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", btn2);

        // Fill all user data fields.
        sendKeysToElement(By.xpath("//input[@placeholder='שם פרטי']"),"דוד");
        sendKeysToElement(By.xpath("//input[@placeholder='מייל']"),"david-bensh@bezeqint.net");
        sendKeysToElement(By.xpath("//input[@placeholder='סיסמה']"),"Dave1305");
        WebElement password2 = driver.findElement(By.xpath("//input[@placeholder='אימות סיסמה']"));
        password2.sendKeys("Dave1305");
        password2.submit();
    }

    private void enterCredentials(){
        sendKeysToElement(By.xpath("//input[@placeholder='מייל']"),"david-bensh@bezeqint.net");
        sendKeysToElement(By.xpath("//input[@placeholder='סיסמה']"),"Dave1305");
    }

    private void pressLogin(){
        clickElement(By.xpath("//button[@type='submit']"));
    }
}

