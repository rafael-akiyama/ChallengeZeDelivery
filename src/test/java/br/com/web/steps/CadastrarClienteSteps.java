package br.com.web.steps;
import br.com.web.pages.CadastrarClientePage;
import br.com.web.util.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastrarClienteSteps extends BasePage{

	private CadastrarClientePage page = new CadastrarClientePage();

	@Dado("^que um usuario acesse a plataforma web do Ze Delivery$")
	public void queUmUsuarioAcesseAPlataformaWebDoZeDelivery() {
		page.acessarSite();
	}

	@Quando("^preencher os dados de cadastro com e-mail$")
	public void preencherOsDadosDeCadastroComEMail() {
		page.preencherDadosDeCadastro();
	}

	@Entao("^um novo usuario sera cadastrado$")
	public void umNovoUsuarioSeraCadastrado() throws InterruptedException {
		page.validarCadastro();
	}
}