package br.com.mobile.steps;

import org.junit.Assert;

import br.com.mobile.core.BasePage;
import br.com.mobile.page.AccordionPage;
import br.com.mobile.page.MenuPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AccordionSteps extends BasePage {

	private MenuPage menu = new MenuPage();
	private AccordionPage page = new AccordionPage();

	@Quando("^acessar menu Accordion$")
	public void acessarMenuAccordion() throws Throwable {
		menu.acessarMenuAccordion();
	}

	@Quando("^clicar opcao um$")
	public void clicarOpcaoUm() throws Throwable {
		page.selecionarOpcao1();
	}

	@Entao("^verificar texto opcao um$")
	public void verificarTextoOpcaoUm() throws Throwable {
		Assert.assertTrue(page.obterValorOpcao1());
	}
}
