package br.com.mobile.page;

import static br.com.mobile.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.mobile.core.BasePage;

public class MenuPage extends BasePage {	

	public void acessarMenuFormulario() {
		clicarPorTexto("Formulário");
	}

	public void acessarMenuSplash() {
		clicarPorTexto("Splash");
	}

	public void acessarMenuAlertas() {
		clicarPorTexto("Alertas");
	}

	public void acessarMenuAbas() {
		clicarPorTexto("Abas");
	}
	
	public void acessarMenuAccordion() {
		clicarPorTexto("Accordion");
	}
	
	public void acessarMenuCliques() {
		clicarPorTexto("Cliques");
	}
	
	public void acessarMenuSwipe() {
		clicarPorTexto("Swipe");
	}
	
	public void acessarSwipeList() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		scroll(0.9, 0.1);
		clicarPorTexto("Swipe List");
	}
	
	public void acessarDragNDrop() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		scroll(0.9, 0.1);
		clicarPorTexto("Drag and drop");
	}
	
	public void acessarSBHibrido() {
		clicarPorTexto("SeuBarriga Híbrido");
	}
}	
