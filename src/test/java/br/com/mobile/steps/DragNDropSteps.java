package br.com.mobile.steps;

import org.junit.Assert;

import br.com.mobile.core.BaseTest;
import br.com.mobile.page.DragNDropPage;
import br.com.mobile.page.MenuPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class DragNDropSteps extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private DragNDropPage page = new DragNDropPage();
	
	private String[] estadoInicial = new String []{"Esta", "é uma lista", "Drag em Drop!", "Faça um clique longo,", "e arraste para", "qualquer local desejado."};
	private String[] estadoIntermediario = new String []{"é uma lista", "Drag em Drop!", "Faça um clique longo,", "e arraste para", "Esta", "qualquer local desejado."};
	private String[] estadoFinal = new String []{"Faça um clique longo,", "é uma lista", "Drag em Drop!", "e arraste para", "Esta", "qualquer local desejado."};
	
	@Quando("^acessar menu DragNDrop$")
	public void acessarMenuDragNDrop() throws Throwable {
		menu.acessarDragNDrop();
	}

	@Quando("^verificar estado inicial$")
	public void verificarEstadoInicial() throws Throwable {
		Thread.sleep(1000);
		Assert.assertArrayEquals(estadoInicial, page.obterLista());
	}

	@Quando("^arrastar a tela para cima$")
	public void arrastarATelaParaCima() throws Throwable {
		page.dragNDrop("Esta", "e arraste para");
	}

	@Quando("^verificar estado intermediario$")
	public void verificarEstadoIntermediario() throws Throwable {
		Assert.assertArrayEquals(estadoIntermediario, page.obterLista());
	}

	@Quando("^arrastar a tela para baixo$")
	public void arrastarATelaParaBaixo() throws Throwable {
		page.dragNDrop("Faça um clique longo,", "é uma lista");
	}

	@Entao("^verificar estado final$")
	public void verificarEstadoFinal() throws Throwable {
		Assert.assertArrayEquals(estadoFinal, page.obterLista());
	}
}
