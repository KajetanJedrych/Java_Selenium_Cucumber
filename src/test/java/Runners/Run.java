package Runners;

import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"D:\\test\\JavaSelenium\\src\\test\\features"},
        glue={"D:\\test\\JavaSelenium\\src\\test\\java\\steps"},
        monochrome = true,
        plugin = {"pretty", "html:target/HtmlReports"}
)

public class Run {


}
