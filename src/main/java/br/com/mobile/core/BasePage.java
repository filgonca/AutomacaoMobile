package br.com.mobile.core;

import static br.com.mobile.core.DriverFactory.getDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {

	AndroidTouchAction toque = new AndroidTouchAction(getDriver());

	public void escrever(By elemento, String texto) {
		getDriver().findElement(elemento).sendKeys(texto);
	}

	public String obterTexto(By elemento) {
		return getDriver().findElement(elemento).getText();
	}

	public void clicar(By elemento) {
		getDriver().findElement(elemento).click();
	}
	
	public void clicarPorTexto(String texto) {
		clicar(By.xpath("//*[@text='" + texto + "']"));
	}

	public void selecionarCombo(By elemento, String valor) {
		getDriver().findElement(elemento).click();
		clicarPorTexto(valor);
	}

	public String obterTituloAlerta() {
		return obterTexto(By.id("android:id/alertTitle"));
	}

	public String obterMensagemAlerta() {
		return obterTexto(By.id("android:id/message"));
	}

	public boolean isCheckMarcado(By elemento) {
		return getDriver().findElement(elemento).getAttribute("checked").equals("true");
	}

	public boolean existeElementoPorTexto(String texto) {
		List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='" + texto + "']"));
		return elementos.size() > 0;
	}

	// Rolar para cima ex: porcentagem de altura da tela de 90% que seria na parte
	// final inferior até 10% para parte superior e rolar para baixo ex: (0.1, 0.9)
	public void scroll(double inicio, double fim) {
		Dimension size = getDriver().manage().window().getSize();

		int x = size.width / 2;

		int start_y = (int) (size.height * inicio);
		int end_y = (int) (size.height * fim);

		toque.press(PointOption.point(x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(x, end_y)).release().perform();
	}

	// Rolar para esquerda ex: porcentagem de largura da tela de 90% que seria na parte
	// inicial direita até 10% para final esquerda e rolar para direita ex: (0.1, 0.9)
	public void swipe(double inicio, double fim) {
		Dimension size = getDriver().manage().window().getSize();

		int y = size.height / 2;

		int start_x = (int) (size.width * inicio);
		int end_x = (int) (size.width * fim);

		toque.press(PointOption.point(start_x, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(end_x, y)).release().perform();
	}

	public void swipeElementRight(String text) {
		MobileElement elemento = getDriver().findElement(By.xpath("//*[@text='" + text + "']/.."));
		int y = elemento.getLocation().y + (elemento.getSize().height / 2);

		int start_x = (int) (elemento.getSize().width * 0.9);
		int end_x = (int) (elemento.getSize().width * 0.1);

		toque.press(PointOption.point(start_x, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(end_x, y)).release().perform();
	}
	
	public void swipeElementLeft(String text) {
		MobileElement elemento = getDriver().findElement(By.xpath("//*[@text='" + text + "']/.."));
		int y = elemento.getLocation().y + (elemento.getSize().height / 2);

		int start_x = (int) (elemento.getSize().width * 0.1);
		int end_x = (int) (elemento.getSize().width * 0.9);

		toque.press(PointOption.point(start_x, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(end_x, y)).release().perform();
	}
}