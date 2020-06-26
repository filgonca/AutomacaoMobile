package br.com.mobile.steps;

import org.junit.Assert;

import br.com.mobile.core.BasePage;
import br.com.mobile.page.CliquesPage;
import br.com.mobile.page.MenuPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CliquesSteps extends BasePage {

	private MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();

	@Quando("^acessar menu Cliques$")
	public void acessarMenuCliques() throws Throwable {
		menu.acessarMenuCliques();
	}

	@Quando("^clicar em Clique Longo$")
	public void clicarEmCliqueLongo() throws Throwable {
		page.cliqueLongo();
	}

	@Entao("^verifica texto apos clique longo$")
	public void verificaTextoAposCliqueLongo() throws Throwable {
		Assert.assertEquals("Clique Longo", page.obterTextoCampo());
	}

	@Quando("^clicar em Clique duplo$")
	public void clicarEmCliqueDuplo() throws Throwable {
		page.clicarPorTexto("Clique duplo");
		page.clicarPorTexto("Clique duplo");
	}

	@Entao("^verifica texto apos clique duplo$")
	public void verificaTextoAposCliqueDuplo() throws Throwable {
		Assert.assertEquals("Duplo Clique", page.obterTextoCampo());
	}
}
