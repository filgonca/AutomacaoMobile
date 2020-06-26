package br.com.mobile.page;

import br.com.mobile.core.BasePage;

public class AccordionPage extends BasePage {
	
	public void selecionarOpcao1() {
		clicarPorTexto("Opção 1");
	}
	
	public boolean obterValorOpcao1() {
		return existeElementoPorTexto("Esta é a descrição da opção 1");
	}

}
