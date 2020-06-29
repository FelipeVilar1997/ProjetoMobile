$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ConsultaVeiculo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#utf-8"
    }
  ],
  "line": 4,
  "name": "Buscar veiculos",
  "description": "Eu como usuario do aplicativo iCarros\r\nQuero realizar a busca de veiculos",
  "id": "buscar-veiculos",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "BuscarVeiculosBuscaHome",
  "description": "",
  "id": "buscar-veiculos;buscarveiculosbuscahome",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 9,
  "name": "seleciono o campo de busca",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "informo o \"camaro\"",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "clico no botao buscar",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "valido os veiculo que busquei",
  "keyword": "Então "
});
formatter.match({
  "location": "ConsultaStep.seleciono_o_campo_de_busca()"
});
formatter.result({
  "duration": 34407150000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "camaro",
      "offset": 11
    }
  ],
  "location": "ConsultaStep.informo_o(String)"
});
formatter.result({
  "duration": 6200168400,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStep.clico_no_botao_buscar()"
});
formatter.result({
  "duration": 5325875500,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStep.valido_os_veiculo_que_busquei()"
});
formatter.result({
  "duration": 50523513300,
  "status": "passed"
});
});