# testeMobile
Teste aplicativo Icarros

Selenium WebDriver + Cucumber JVM + Page Objects + BDD
======================================================

Desafio Mobile proposto Iterasys.
Para iniciar, foi necessário a instalação das bibliotécas JAVA, JDK, JRE e uma IDE(Eclipse)

Foi criado um projeto do tipo Maven e adicionado as seguintes dependencias no arquivo pom, referente ao Cucumber, JUnit e Selenium WebDriver.

<dependencies>
		<dependency>
			<groupId>io.appium</groupId>
			<artifactId>java-client</artifactId>
			<version>6.1.0</version>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.11</version>
			<scope>test</scope>
		</dependency>
		<!-- https://mvnrepository.com/artifact/info.cukes/cucumber-java -->
		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>1.2.5</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>1.2.5</version>
		</dependency>
		<dependency>
			<groupId>javax</groupId>
			<artifactId>javaee-web-api</artifactId>
			<version>7.0</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>2.39.0</version>
		</dependency>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-firefox-driver</artifactId>
			<version>2.39.0</version>
		</dependency>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-server</artifactId>
			<version>2.39.0</version>
		</dependency>
  </dependencies>
--------------------------------------------------
Foram implementados os métodos

### Feature 
Contendo os cenário e caso de teste escrito em BDD

### Steps 
Implementação dos cenários de testes 

### Logic 
Lógica da aplicação e validações 

### Test 
Contem a classe de Teste (Runner) do projeto

### Utils
Contem as ações e Capability

### Resources
Contem a apk para instalação.

Executar os testes
=================
Para execução dos testes, é necessário executar a classe "ConsultaTest" na package Consulta 
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
