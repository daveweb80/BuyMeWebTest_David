import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import java.util.concurrent.TimeUnit;

import static org.testng.FileAssert.fail;

public class Report {
    public static ChromeDriver driver;
    // create ExtentReports and attach reporter(s)
    public static ExtentReports extent ;
    // creates a toggle for the given test, adds all log events under it
    public static ExtentTest test ;

    public Status status_pass()
    {
        return Status.PASS;
    }
    public Status status_fail()
    {
        return Status.FAIL;
    }

    public Status status_info()
    {
        return Status.INFO;
    }

    public Report() {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("C:\\selenium\\chromedriver_win32e\\buyMeReportTesting.html");
        // attach reporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        // name your test and add description
        test = extent.createTest("buyMeTest", "Report about Buy Me site testing");
        // add custom system info
        extent.setSystemInfo("Environment", "Production");
        extent.setSystemInfo("Tester", "David B");
        // log results
        test.log(Status.INFO, "@start");

        boolean driverEstablish = false;
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driverEstablish = true;
        } catch (Exception e) {
            e.printStackTrace();
            fail("Cant connect chromeDriver");
            test.log(Status.FAIL, "Driver Connection Failed! " + e.getMessage());
            driverEstablish = false;
        } finally {
            if (driverEstablish) {
                test.log(Status.PASS, "Driver established successfully");
            }
        }
    }

    private static void copyFile(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
