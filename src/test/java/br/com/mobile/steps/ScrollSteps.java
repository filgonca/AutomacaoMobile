package br.com.mobile.steps;

import static br.com.mobile.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.mobile.core.BaseTest;
import br.com.mobile.page.MenuPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ScrollSteps extends BaseTest {

	MenuPage menu = new MenuPage();

	@Quando("^arrastar tela para cima$")
	public void arrastar_tela_para_cima() throws Throwable {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		menu.scroll(0.9, 0.1);
	}

	@Quando("^clicar no meu Opcao bem escondida$")
	public void clicar_no_meu_Opcao_bem_escondida() throws Throwable {
		menu.clicarPorTexto("Opção bem escondida");
	}

	@Quando("^validar mensagem do alerta$")
	public void validar_mensagem_do_alerta() throws Throwable {
		Assert.assertEquals("Você achou essa opção", menu.obterMensagemAlerta());
	}

	@Entao("^clicar na opcao do alerta para sair$")
	public void clicar_na_opcao_do_alerta_para_sair() throws Throwable {
		menu.clicarPorTexto("OK");
	}
}
