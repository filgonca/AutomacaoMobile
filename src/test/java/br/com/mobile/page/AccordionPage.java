package br.com.mobile.page;

import br.com.mobile.core.BasePage;

public class AccordionPage extends BasePage {
	
	public void selecionarOpcao1() {
		clicarPorTexto("Op��o 1");
	}
	
	public boolean obterValorOpcao1() {
		return existeElementoPorTexto("Esta � a descri��o da op��o 1");
	}

}
