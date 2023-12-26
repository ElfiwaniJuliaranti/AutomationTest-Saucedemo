import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends env_target{
    @Test
    public void main(){
        //set driver location path
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        //maximize driver
        driver = new ChromeDriver();
        WebDriver.Window window = driver.manage().window();
        window.maximize();
        //set URL
        driver.get(baseUrl);
    }
}
