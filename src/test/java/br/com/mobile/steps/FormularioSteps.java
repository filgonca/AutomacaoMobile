package br.com.mobile.steps;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import br.com.mobile.core.BaseTest;
import br.com.mobile.page.FormularioPage;
import br.com.mobile.page.MenuPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileBy;

public class FormularioSteps extends BaseTest {

	private MenuPage menu = new MenuPage();
	private FormularioPage page = new FormularioPage();
	
	@Quando("^acessar menu Formulario$")
	public void acessar_menu_Formulario() throws Throwable {
		menu.acessarMenuFormulario();
	}

	@Quando("^preencher campo texto$")
	public void preencher_campo_texto() throws Throwable {
		page.escreverNome("Fillipe");
	}

	@Entao("^verificar campo preenchido$")
	public void verificar_campo_preenchido() throws Throwable {
		assertEquals("Fillipe", page.obterNome());
	}

	@Quando("^selecionar item do combobox$")
	public void selecionar_item_do_combobox() throws Throwable {
		page.selecionarCombo("PS4");
	}

	@Entao("^verificar valor do combobox$")
	public void verificar_valor_do_combobox() throws Throwable {
		Assert.assertEquals("PS4", page.obterValorCombo());
	}

	@Quando("^selecionar checkbox$")
	public void selecionar_checkbox() throws Throwable {
		Assert.assertFalse(page.isCheckedMarcado());
		page.clicarCheck();
	}

	@Entao("^verificar checkbox selecionado$")
	public void verificar_checkbox_selecionado() throws Throwable {
		Assert.assertTrue(page.isCheckedMarcado());
	}

	@Quando("^selecionar switchbox$")
	public void selecionar_switchbox() throws Throwable {
		Assert.assertTrue(page.isSwitchMarcado());
		page.clicarSwitch();
	}

	@Entao("^verificar switchbox selecionado$")
	public void verificar_switchbox_selecionado() throws Throwable {
		Assert.assertFalse(page.isSwitchMarcado());
	}

	@Quando("^preencher cadastro$")
	public void preencher_cadastro() throws Throwable {
		page.escreverNome("Fillipe");
		page.clicarCheck();
		page.clicarSwitch();
		page.selecionarCombo("Nintendo Switch");
		page.salvar("SALVAR");
	}

	@Entao("^verificar dados preenchidos$")
	public void verificar_dados_preenchidos() throws Throwable {
		Assert.assertEquals("Nome: Fillipe", page.obterNomeCadastrado());
		Assert.assertEquals("Console: switch", page.obterConsoleCadastrado());
		Assert.assertTrue(page.obterCheckCadastrado().endsWith("Off"));
		Assert.assertTrue(page.obterSwitchCadastrado().endsWith("Marcado"));
	}

	@Quando("^alterar a data$")
	public void alterar_a_data() throws Throwable {
		page.clicarPorTexto("01/01/2000");
		page.clicarPorTexto("20");
		page.clicarPorTexto("OK");
	}

	@Entao("^verificar valor da data alterada$")
	public void verificar_valor_da_data_alterada() throws Throwable {
		Assert.assertTrue(page.existeElementoPorTexto("20/2/2000"));
	}

	@Quando("^alterar a hora$")
	public void alterar_a_hora() throws Throwable {
		page.clicarPorTexto("06:00");
		page.clicar(MobileBy.AccessibilityId("10"));
		page.clicar(MobileBy.AccessibilityId("30"));
		page.clicarPorTexto("OK");
	}

	@Entao("^verificar valor da hora alterada$")
	public void verificar_valor_da_hora_alterada() throws Throwable {
		Assert.assertTrue(page.existeElementoPorTexto("10:30"));	
	}
}
