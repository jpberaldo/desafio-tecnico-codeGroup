package modulos.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfig {

    private static WebDriver driver;

    public static void configurarDriverDoNavegadorWeb() {
      //  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); //webdriver.edge.driver e msedgedriver.exe
        WebDriverManager.chromedriver().setup();
        String ambiente = System.getProperty("ambiente", "local");

        if (ambiente.equals("ci")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless", "--disable-gpu", "--no-sandbox");
            driver = new ChromeDriver(options);
        } else {
            System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

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
