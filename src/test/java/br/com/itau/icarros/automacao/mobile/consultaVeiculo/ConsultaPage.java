package br.com.itau.icarros.automacao.mobile.consultaVeiculo;

import org.openqa.selenium.By;

public class ConsultaPage {
		
	private By comboBoxBuscaHome = By.id("br.com.icarros.androidapp:id/searchText");
	private By comboBoxPesquisa = By.id("br.com.icarros.androidapp:id/fullSearchText");
	private By btnResultadoPesquisa = By.id("br.com.icarros.androidapp:id/completeButton");
	private By btnBuscar = By.id("br.com.icarros.androidapp:id/searchButton");
//	private By btnClicarBuscar = By.id("");
	private By btnFiltroPesquisa = By.xpath("//*(contains[@text,'Filter' or 'Filtro')]");
	private By btnFiltroPreco = By.xpath("//*(contains[@text,'Preço' or 'Price')]");
	
	
	private By txtQtdOfertas = By.xpath("//*(contains[@text,'Deals' or 'Ofertas')]");
	private By txtCbBoxBusca = By.xpath("//*(contains[@text,'Search model' or '')]");
//	private By txtBusca = By.id("br.com.icarros.androidapp:id/titleText");
	
	private By txtNomeVeiculo = By.id("br.com.icarros.androidapp:id/makeAndModelText");
	private By txtPrecoVeiculo = By.id("br.com.icarros.androidapp:id/priceText\r\n");
	private By txtTipoCambio = By.id("br.com.icarros.androidapp:id/transmissionText");
	private By txtCorVeiculo = By.id("br.com.icarros.androidapp:id/colorText");
	private By txtKmVeiculo = By.id("br.com.icarros.androidapp:id/mileageText");
	private By txtAnoVeiculo = By.id("br.com.icarros.androidapp:id/yearText");
	
	
	public By getBuscaPrincipal() {
		return comboBoxBuscaHome;
	}
	
	public By getBuscaAposClicar() {
		return comboBoxPesquisa;
	}
	
	public By getBtnResultadoPesquisa() {
		return btnResultadoPesquisa;
	}
	
	public By getBtnBuscar() {
		return btnBuscar;
	}

	public By getBtnFiltrar() {
		return btnFiltroPesquisa;
	}
	
	public By getBtnFiltrarPreco() {
		return btnFiltroPreco;
	}
	
	///Valida textos
	
	public By getQuantidadeOfertas() {
		return txtQtdOfertas;
	}
	
	public By getTxtCampoBusca() {
		return txtCbBoxBusca;
	}
	
	public By getTxtNomeMarcaVeiculos() {
		return txtNomeVeiculo;
	}
	
	public By getTxtTipoCambio() {
		return txtTipoCambio;
	}
	
	public By getTxtCorVeiculo() {
		return txtCorVeiculo;
	}
	
	public By getTxtKmVeiculo() {
		return txtKmVeiculo;
	}
	
	public By getTxtAnoVeiculo() {
		return txtAnoVeiculo;
	}
	
	public By getTxtPrecoVeiculo() {
		return txtPrecoVeiculo;
	}
}
