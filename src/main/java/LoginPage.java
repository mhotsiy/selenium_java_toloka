import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private  WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By emailField = By.xpath("/html/body/div[1]/table[2]/tbody/tr/td/form/table[2]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input");
    private By passwordField = By.xpath("//input[@name='password']");
    private By rememberCheckbox = By.xpath("//input[@name='autologin']");
    private By loginButton = By.xpath("//input[@value='Вхід']");

    public LoginPage enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
        return this;
    }
    public LoginPage enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }
    public TolokaPageAfterLoggedIn clickLogin(){
        driver.findElement(loginButton).click();
        return new TolokaPageAfterLoggedIn(driver);
    }
    public TolokaPageAfterLoggedIn signIn(String email, String password){
        this.enterEmail(email);
        this.enterPassword(password);
        this.clickLogin();
        return new TolokaPageAfterLoggedIn(driver);
    }



}
