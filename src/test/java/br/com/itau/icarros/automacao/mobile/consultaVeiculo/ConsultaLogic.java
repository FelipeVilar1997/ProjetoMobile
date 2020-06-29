package br.com.itau.icarros.automacao.mobile.consultaVeiculo;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import utils.Driver;
import utils.Utilidades;
import java.io.FileNotFoundException;

public class ConsultaLogic extends ConsultaPage {

	Utilidades utils = new Utilidades();
	ConsultaPage page = new ConsultaPage();

	String kilometragem;
	String nomeVeiculo;
	String precoVeiculo;
	String anoVeiculo;
	String cambio;
	String corVeiculo;

	public AndroidDriver<WebElement> driver = Driver.getDriver();

	public void buscaVeiculo() {
		utils.espera(7000);
		utils.clicaSimples(page.getBuscaPrincipal());
	}

	public void escreveVeiculo(String tipoVeiculo) {
		utils.espera(5000);
		utils.escreve(page.getBuscaAposClicar(), tipoVeiculo);
	}

	public void clicaBuscar() {
		utils.espera(5000);
		utils.clicaSimples(page.getBtnBuscar());
	}
	
	public void validaVeiculos() throws FileNotFoundException {
		
		for(int i = 0; i < 5; i++ ) {
			validaDadosVeiculo();
		}
	}

	public void validaDadosVeiculo() throws FileNotFoundException {
		utils.testeScroll();
		utils.geradorDados();
		utils.espera(5000);
		nomeVeiculo = (utils.leSimples(page.getTxtNomeMarcaVeiculos()));
		anoVeiculo = (utils.leSimples(page.getTxtAnoVeiculo()));
		kilometragem = (utils.leSimples(page.getTxtKmVeiculo()));
		cambio = (utils.leSimples(page.getTxtTipoCambio()));
		corVeiculo = (utils.leSimples(page.getTxtCorVeiculo()));
		utils.evidencia(null);
		System.out.println("Nome Veiculo: " + nomeVeiculo);
		System.out.println("Ano:  " + anoVeiculo);
		System.out.println("Kilometragem:  " + kilometragem);
		System.out.println("Câmbio:  " + cambio);
		System.out.println("Cor:  " + corVeiculo);
		System.out.println("---------------------------------");
	}
}
