package br.com.web.runners;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import br.com.web.core.DriverFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/CadastrarCliente.feature",
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		glue = "br.com.web.steps",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)

public class Runner {
	
	@AfterClass
	public static void tearDown() {
		DriverFactory.killDriver();
	}
	
}