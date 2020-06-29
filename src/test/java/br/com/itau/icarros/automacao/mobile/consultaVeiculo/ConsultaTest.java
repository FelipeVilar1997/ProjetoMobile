package br.com.itau.icarros.automacao.mobile.consultaVeiculo;

import org.junit.After;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.Driver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
								plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json" },
								strict = false,
								monochrome = true,
								glue = {  })
public class ConsultaTest {
	@After
	public void depois() {
		Driver.quitDriver();	
	}
}