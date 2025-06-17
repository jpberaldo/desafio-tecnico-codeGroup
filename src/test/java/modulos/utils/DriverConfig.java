package modulos.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConfig {

    private static WebDriver driver;

    public static void configurarDriverDoNavegadorWeb() {
      //  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); //webdriver.edge.driver e msedgedriver.exe
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); //new EdgeDriver()
        driver.manage().window().maximize();
    }

    public static WebDriver retornarDriverDoNavegador() {
        return driver;
    }

    public static void fecharDriverDoNavegador() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
