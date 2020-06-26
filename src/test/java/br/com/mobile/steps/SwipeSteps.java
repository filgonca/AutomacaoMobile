package br.com.mobile.steps;

import org.junit.Assert;

import br.com.mobile.core.BasePage;
import br.com.mobile.core.BaseTest;
import br.com.mobile.page.MenuPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class SwipeSteps extends BaseTest {

	private MenuPage menu = new MenuPage();
	private BasePage page = new BasePage();
	
	@Quando("^acessar menu Swipe$")
	public void acessar_menu_Swipe() throws Throwable {
		menu.acessarMenuSwipe();
	}

	@Quando("^verificar texto inicial$")
	public void verificar_texto_inicial() throws Throwable {
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
	}

	@Quando("^executar swipe para esquerda$")
	public void executar_swipe_para_esquerda() throws Throwable {
		menu.swipe(0.9, 0.1);
	}

	@Quando("^verificar texto apos swipe para esquerda$")
	public void verificar_texto_apos_swipe_para_esquerda() throws Throwable {
		Assert.assertTrue(menu.existeElementoPorTexto("E veja se"));
	}

	@Quando("^clicar botao  para direita$")
	public void clicar_botao_para_direita() throws Throwable {
		page.clicarPorTexto("›");
	}

	@Quando("^verificar texto apos clique botao para direita$")
	public void verificar_texto_apos_clique_botao_para_direita() throws Throwable {
		Assert.assertTrue(menu.existeElementoPorTexto("Chegar até o fim!"));
	}

	@Quando("^executar swipe para direita$")
	public void executar_swipe_para_direita() throws Throwable {
		menu.swipe(0.1, 0.9);
	}

	@Quando("^verificar texto apos swipe para direita$")
	public void verificar_texto_apos_swipe_para_direita() throws Throwable {
		Assert.assertTrue(menu.existeElementoPorTexto("E veja se"));
	}

	@Quando("^clicar botao para esquerda$")
	public void clicar_botao_para_esquerda() throws Throwable {
		page.clicarPorTexto("‹");
	}

	@Entao("^verificar texto apos clique botao para esquerda$")
	public void verificar_texto_apos_clique_botao_para_esquerda() throws Throwable {
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));		
	}
}
