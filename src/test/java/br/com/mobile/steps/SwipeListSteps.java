package br.com.mobile.steps;

import org.junit.Assert;

import br.com.mobile.core.BaseTest;
import br.com.mobile.page.MenuPage;
import br.com.mobile.page.SwipeListPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class SwipeListSteps extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SwipeListPage page = new SwipeListPage();

	@Quando("^clicar no menu swipelist$")
	public void clicar_no_menu_swipelist() throws Throwable {
		menu.acessarSwipeList();
	}

	@Quando("^arrastar OpcaoUm para esquerda$")
	public void arrastar_OpcaoUm_para_esquerda() throws Throwable {
		menu.swipeElementRight("Opção 1");
	}

	@Quando("^clicar OpcaoUmMais$")
	public void clicar_OpcaoUmMais() throws Throwable {
		page.clicarBotaoMais();
	}

	@Quando("^validar texto OpcaoUmmais$")
	public void validar_texto_OpcaoUmmais() throws Throwable {
		Assert.assertTrue(page.existeElementoPorTexto("Opção 1 (+)"));
	}

	@Quando("^arrastar OpcaoQuatro para esquerda$")
	public void arrastar_OpcaoQuatro_para_esquerda() throws Throwable {
		menu.swipeElementRight("Opção 4");
	}

	@Quando("^clicar OpcaoQuartoMenos$")
	public void clicar_OpcaoQuartoMenos() throws Throwable {
		page.clicarPorTexto("(-)");
	}

	@Quando("^validar texto OpcaoQuatroMenos$")
	public void validar_texto_OpcaoQuatroMenos() throws Throwable {
		Assert.assertTrue(page.existeElementoPorTexto("Opção 4 (-)"));
	}

	@Quando("^arrastar OpcaoCinco para direita$")
	public void arrastar_OpcaoCinco_para_direita() throws Throwable {
		menu.swipeElementLeft("Opção 5 (-)");
	}

	@Entao("^validar texto OpcaoCinco$")
	public void validar_texto_OpcaoCinco() throws Throwable {
		Assert.assertTrue(page.existeElementoPorTexto("Opção 5"));
	}

}