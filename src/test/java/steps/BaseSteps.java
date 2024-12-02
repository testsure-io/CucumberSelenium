package steps;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BaseSteps {
    WebDriver driver;
    BaseSteps(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vithika Patel\\IdeaProjects\\CucumberSeleniumDemo\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
