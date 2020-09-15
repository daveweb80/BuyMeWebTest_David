import org.testng.annotations.Test;

public class BaseClassTest {
    @Test
    public void test01_login(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}
