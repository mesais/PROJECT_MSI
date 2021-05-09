package testRunnersJunit4;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "stepDefs",
        monochrome = true, plugin = {
        "pretty", "html:target/HtmlReports.html",
        "json:target/JSONReports/report.json",
        "json:target/JunitReports/report.xml"},
        tags = "@all",
        publish  = true)

public class Runner {

}

//publish = true
