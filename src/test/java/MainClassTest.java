import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClassTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/MacBook/testselenium/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://toloka.to/login.php?redirect=index.php&");
        loginPage = new LoginPage(driver);
    }
    @Test
    public void loginPageLoading(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://toloka.to/login.php?redirect=index.php&", url);
    }
    @After
    public void TearDown(){
        driver.quit();
    }







}


