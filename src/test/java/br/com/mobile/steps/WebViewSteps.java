package br.com.mobile.steps;

import org.junit.Assert;

import br.com.mobile.core.BaseTest;
import br.com.mobile.page.MenuPage;
import br.com.mobile.page.WebViewPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class WebViewSteps extends BaseTest {

	MenuPage menu = new MenuPage();
	WebViewPage page = new WebViewPage();

	@Quando("^acessar menu Seu Barriga Hibrido$")
	public void acessar_menu_Seu_Barriga_Hibrido() throws Throwable {
		menu.acessarSBHibrido();
		Thread.sleep(3000);
		page.entrarContextoWeb();
	}

	@Quando("^preencher campo Email$")
	public void preencher_campo_Email() throws Throwable {
		page.preencherEmail();
	}

	@Quando("^preencher campo Senha$")
	public void preencher_campo_Senha() throws Throwable {
		page.preencherSenha();
	}

	@Quando("^clicar no botao entrar$")
	public void clicar_no_botao_entrar() throws Throwable {
		page.clicarEntrar();
	}

	@Entao("^validar texto de boas vindas$")
	public void validar_texto_de_boas_vindas() throws Throwable {
		Assert.assertEquals("Bem vindo, Teste!", page.obterBemVindo());
		page.sairContextoWeb();
	}
}
