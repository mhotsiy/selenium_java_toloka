import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    WebDriverWait wait = new WebDriverWait(driver, 20);

    WebElement loginPageButton = driver.findElement(By.xpath("//a[contains(text(),'Вхід')]"));
//    WebElement loginPageButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Вхід')]")));


}
