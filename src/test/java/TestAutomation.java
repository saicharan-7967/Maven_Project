import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.testng.annotations.Test;

public class TestAutomation
{
    @Test public void testChrome() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver ();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        Thread.sleep(6000);
        driver.close();
    }
}
