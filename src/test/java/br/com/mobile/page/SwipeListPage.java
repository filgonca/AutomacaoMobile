package br.com.mobile.page;

import static br.com.mobile.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.mobile.core.BasePage;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeListPage extends BasePage {

	AndroidTouchAction toque = new AndroidTouchAction(getDriver());

	public void clicarBotaoMais() {
		String element = getDriver().findElement(By.xpath("//*[@text='(+)']")).getAttribute("bounds");

		// valor inicial de x do elemento
		String x_inicial = element.substring(1, 4);
		int x_inicialConvertido = Integer.parseInt(x_inicial);

		// valor inicial de y do elemento
		String y = element.substring(5, 8);
		int yConvertido = Integer.parseInt(y);

		toque.tap(PointOption.point(x_inicialConvertido, yConvertido)).release().perform();
	}
}
