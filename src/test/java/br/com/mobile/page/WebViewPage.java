package br.com.mobile.page;

import static br.com.mobile.core.DriverFactory.getDriver;

import java.util.Set;

import org.openqa.selenium.By;

import br.com.mobile.core.BasePage;

public class WebViewPage extends BasePage {
	
	// Elementos Web
	By campoEmail = By.id("email");
	By campoSenha = By.id("senha");
	By botaoEntrar = By.xpath("/html/body/div[2]/form/button");

	public void entrarContextoWeb() {
		Set<String> contextHandles = getDriver().getContextHandles();
		getDriver().context((String) contextHandles.toArray()[1]);
	}

	public void sairContextoWeb() {
		getDriver().getContextHandles();
		getDriver().context((String) getDriver().getContextHandles().toArray()[0]);
	}

	public void preencherEmail() {
		escrever(campoEmail, "f@f.com.br");
	}

	public void preencherSenha() {
		escrever(campoSenha, "123");
	}

	public void clicarEntrar() {
		clicar(botaoEntrar);
	}

	public String obterBemVindo() {
		return obterTexto(By.xpath("/html/body/div[1]"));
	}
}
