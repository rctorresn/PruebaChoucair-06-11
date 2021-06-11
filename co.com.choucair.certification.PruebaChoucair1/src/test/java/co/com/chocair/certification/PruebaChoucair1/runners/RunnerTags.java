package co.com.chocair.certification.PruebaChoucair1.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/academyChoucair.feature",
                                tags = "@stories",
                                    glue = "co.com.choucair.certification.PruebaChoucair1.stepdefinitions",
                                snippets = SnippetType.CAMELCASE)

public class RunnerTags{

}
