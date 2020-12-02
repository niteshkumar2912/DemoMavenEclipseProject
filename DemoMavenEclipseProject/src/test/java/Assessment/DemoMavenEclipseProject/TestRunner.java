package Assessment.DemoMavenEclipseProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue = {"Assessment.DemoMavenEclipseProject"},

monochrome = true,
plugin = {"pretty", "html:target/HtmlReports"}
)
public class TestRunner {

}
