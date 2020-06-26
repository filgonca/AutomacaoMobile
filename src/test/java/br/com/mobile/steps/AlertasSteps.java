package br.com.mobile.steps;

import org.junit.Assert;

import br.com.mobile.page.AlertasPage;
import br.com.mobile.page.MenuPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AlertasSteps {

	MenuPage menu = new MenuPage();
	AlertasPage page = new AlertasPage();

	@Quando("^acessar menu Alertas$")
	public void acessarMenuAlert() throws Throwable {
		menu.acessarMenuAlertas();
	}

	@Quando("^clicar em alerta confirm$")
	public void clicarEmAlertaConfirm() throws Throwable {
		page.clicarAlertaConfirm();
	}

	@Quando("^verificar os textos do alerta confirm$")
	public void verificarOsTextosDoAlertaConfirm() throws Throwable {
		Assert.assertEquals("Info", page.obterTituloAlerta());
		Assert.assertEquals("Confirma a operação?", menu.obterMensagemAlerta());
	}

	@Quando("^confirmar alerta$")
	public void confirmarAlerta() throws Throwable {
		page.confirmar();
	}

	@Quando("^verificar nova mensagem do alerta confirm$")
	public void verificarNovaMensagemDoAlertaConfirm() throws Throwable {
		Assert.assertEquals("Confirmado", menu.obterMensagemAlerta());
	}

	@Entao("^clicar em sair$")
	public void clicarEmSair() throws Throwable {
		page.sair();
	}

	@Quando("^clicar em alerta simples$")
	public void clicarEmAlertaSimples() throws Throwable {
		page.clicarAlertaSimples();
	}

	@Quando("^verificar o texto do alerta simples$")
	public void verificarOTextoDoAlertaSimples() throws Throwable {
		Assert.assertEquals("Pode clicar no OK ou fora da caixa para sair", menu.obterMensagemAlerta());
	}

	@Entao("^clicar fora do alerta simples$")
	public void clicarForaDoAlertaSimples() throws Throwable {
		page.clicarPorTexto("OK");
	}
}
