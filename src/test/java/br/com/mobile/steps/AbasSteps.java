package br.com.mobile.steps;

import org.junit.Assert;

import br.com.mobile.core.BasePage;
import br.com.mobile.page.AbasPage;
import br.com.mobile.page.MenuPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AbasSteps extends BasePage {

	private MenuPage menu = new MenuPage();
	private AbasPage page = new AbasPage();
	
	@Dado("^que um usuario acesse o app CT Appium$")
	public void queUmUsuarioAcesseOAppCTAppium() {
	}

	@Quando("^acessar menu abas$")
	public void acessarMenuAbas() throws Throwable {
		menu.acessarMenuAbas();
	}

	@Quando("^verificar que esta na aba um$")
	public void verificarQueEstaNaAbaUm() throws Throwable {
		Assert.assertTrue(page.isAba1());
	}

	@Quando("^acessar aba dois$")
	public void acessarAbaDois() throws Throwable {
		page.selecionarAba2();
	}

	@Entao("^verificar que esta na aba dois$")
	public void verificarQueEstaNaAbaDois() throws Throwable {
		Assert.assertTrue(page.isAba2());
	}

}
