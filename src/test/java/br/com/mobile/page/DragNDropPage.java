package br.com.mobile.page;

import static br.com.mobile.core.DriverFactory.getDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import br.com.mobile.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DragNDropPage extends BasePage {
	
	AndroidTouchAction toque = new AndroidTouchAction(getDriver());
	
	// metodo arrastar, depreciado, porem funciona
	/*public void arrastar(String origem, String destino) {
		MobileElement inicio = getDriver().findElement(By.xpath("//*[@text='" + origem + "']"));
		MobileElement fim = getDriver().findElement(By.xpath("//*[@text='" + destino + "']"));

		toque.longPress(inicio).moveTo(fim).release().perform();
	}*/

	// realiza clique longo no elemento origem e solta no local do elemento destino 
	public void dragNDrop(String origem, String destino) {
		MobileElement elementoOrigem = getDriver().findElement(By.xpath("//*[@text='" + origem + "']"));
		MobileElement elementoDestino = getDriver().findElement(By.xpath("//*[@text='" + destino + "']"));

		// valor inicial de x do elemento origem
		int x_origem = elementoOrigem.getLocation().x;

		// valor inicial de y do elemento origem
		int y_origem = elementoOrigem.getLocation().y;

		// valor inicial de x do elemento destino
		int x_destino = elementoDestino.getLocation().x;

		// valor inicial de y do elemento destino
		int y_destino = elementoDestino.getLocation().y;

		toque.longPress(PointOption.point(x_origem, y_origem)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
		.moveTo(PointOption.point(x_destino, y_destino)).release().perform();
	}

	public String[] obterLista() {
		List<MobileElement> elements = getDriver().findElements(By.className("android.widget.TextView"));
		String[] retorno = new String[elements.size()];
		for (int i = 0; i < elements.size(); i++) {
			retorno[i] = elements.get(i).getText();
		}
		return retorno;
	}
}
