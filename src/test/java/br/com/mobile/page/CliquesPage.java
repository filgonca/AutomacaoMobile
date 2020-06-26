package br.com.mobile.page;

import static br.com.mobile.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.mobile.core.BasePage;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class CliquesPage extends BasePage {

	AndroidTouchAction toque = new AndroidTouchAction (getDriver());
	
	public void clique() {
		toque.tap(TapOptions.tapOptions().withElement(ElementOption.element(getDriver().findElement(By.xpath("//*[@text='Clique Longo']"))))).perform();
	}
	
	public void cliqueLongo() {
		toque.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(getDriver().findElement(By.xpath("//*[@text='Clique Longo']"))))).perform();
	}
	
	public void cliquePorCordenada(int x, int y) {
		toque.tap(PointOption.point(x, y)).perform();
	}
	
	public String obterTextoCampo() {
		return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
	}	
}
