package br.com.mobile.page;

import static br.com.mobile.core.DriverFactory.getDriver;

import br.com.mobile.core.BasePage;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class AlertasPage extends BasePage {
	
	AndroidTouchAction toque = new AndroidTouchAction (getDriver());
	
	public void clicarAlertaConfirm() {
		clicarPorTexto("ALERTA CONFIRM");
	}
	
	public void clicarAlertaSimples() {
		clicarPorTexto("ALERTA SIMPLES");
	}
	
	public void confirmar() {
		clicarPorTexto("CONFIRMAR");
	}
	
	public void sair() {
		clicarPorTexto("SAIR");
	}
	
	public void cliquePorCordenada(int x, int y) {
		toque.tap(PointOption.point(x, y)).perform();
	}
	
	public void validaTextoAlertaSimples() {
		existeElementoPorTexto("ALERTA SIMPLES");
	}
}
