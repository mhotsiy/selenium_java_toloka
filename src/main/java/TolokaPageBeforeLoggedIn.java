import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TolokaPageBeforeLoggedIn {
    WebDriver driver;

    public TolokaPageBeforeLoggedIn(WebDriver driver) {
        this.driver = driver;
    }

    WebElement loginButton = driver.findElement(By.xpath("//input[@value='Вхід']"));

}
