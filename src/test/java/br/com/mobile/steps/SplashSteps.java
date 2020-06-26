package br.com.mobile.steps;

import org.junit.Assert;

import br.com.mobile.core.BaseTest;
import br.com.mobile.page.MenuPage;
import br.com.mobile.page.SplashPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class SplashSteps extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();
	
	@Quando("^acessar menu Splash$")
	public void acessar_menu_Splash() throws Throwable {
		menu.acessarMenuSplash();
	}

	@Quando("^verificar que menu splash esta sendo exibido$")
	public void verificar_que_menu_splash_esta_sendo_exibido() throws Throwable {
		page.isTelaSplashVisivel();
	}

	@Quando("^aguardar saida do splash$")
	public void aguardar_saida_do_splash() throws Throwable {
		page.aguardarSplashSumir();
	}

	@Entao("^verificar que o splash esta aparecendo$")
	public void verificar_que_o_splash_esta_aparecendo() throws Throwable {
		Assert.assertTrue(page.existeElementoPorTexto("Formulário"));
	}
}
