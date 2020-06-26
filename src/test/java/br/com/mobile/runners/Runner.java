package br.com.mobile.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./features",
		//plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		glue = {"br.com.mobile.steps", "br.com.mobile.util"},
		tags = {"@all"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)

public class Runner {
	
}