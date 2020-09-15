import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public void login(){
        enterCredentials();
        pressLogin();
    }

    private void enterCredentials(){
        sendKeysToElement(By.id("userName"), "John");
        sendKeysToElement(By.id("password"), "123456");
    }

    private void pressLogin(){
        clickElement(By.id("login"));
    }
}
