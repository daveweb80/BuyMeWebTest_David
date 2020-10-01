import org.testng.annotations.Test;

public class LoginScreenTest {
    @Test
    public static void newUserLogin() {
        LoginPage buyMeLoginPage = new LoginPage();
        try{
            buyMeLoginPage.newUserLogin();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    @Test
    public static void registeredUserLogin() {
        LoginPage buyMeLoginPage = new LoginPage();
        try {
            buyMeLoginPage.login();
        }
        catch(Exception ex)
        {
           ex.printStackTrace();
        }
    }
}
