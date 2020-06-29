package br.com.itau.icarros.automacao.mobile.consultaVeiculo;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Então;

public class ConsultaStep {

	ConsultaLogic logic;

	public ConsultaStep() {
		logic = new ConsultaLogic();
	
	}

	@Dado("^seleciono o campo de busca$")
	public void seleciono_o_campo_de_busca() throws Throwable {
		logic.buscaVeiculo();
	}

	@Quando("^informo o \"([^\"]*)\"$")
	public void informo_o(String veiculo) throws Throwable {
		logic.escreveVeiculo(veiculo);
	}

	@Quando("^clico no botao buscar$")
	public void clico_no_botao_buscar() throws Throwable {
		logic.clicaBuscar();
	}

	@Então("^valido os veiculo que busquei$")
	public void valido_os_veiculo_que_busquei() throws Throwable {
		logic.validaVeiculos();
	}
	
	public void seleciono_o_filtro_na_pagina_home() throws Throwable {
	}

}
