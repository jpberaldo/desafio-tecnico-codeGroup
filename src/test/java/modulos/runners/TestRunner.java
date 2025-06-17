package modulos.runners;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "modulos.steps",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true,
        tags = "@Positivo or @Negativo"
)

public class TestRunner {


}
