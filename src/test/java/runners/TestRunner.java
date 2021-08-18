package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
                 glue = {"stepsDefinitions"},
                 plugin = {"pretty", "html:target;report-html", "json:target/cucumber.json"},
                 monochrome = false, snippets = SnippetType.CAMELCASE, dryRun = false, strict = false )
public class TestRunner {
}
