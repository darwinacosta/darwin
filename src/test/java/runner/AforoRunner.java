package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "stepDefinition",
        features = "src/test/resources/features/Aforo.feature",
        snippets = SnippetType.CAMELCASE
)
public class AforoRunner {
}
