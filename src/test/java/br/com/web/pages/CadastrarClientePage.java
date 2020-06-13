package br.com.web.pages;

import static br.com.web.core.DriverFactory.getDriver;

import java.util.Random;

import org.openqa.selenium.By;

import br.com.web.util.BasePage;

public class CadastrarClientePage extends BasePage {

	// *********Elementos Web*********
	By maioridade = By.id("age-gate-button-yes");
	By botaoEntrar = By.id("welcome-button-sign-in");
	By botaoCadastrar = By.id("login-home-link-dont-have-account");
	By entrarComEMail = By.id("signup-home-button-email");
	By nomeESobrenome = By.name("signup-email-input-name");
	By eMail = By.name("signup-email-input-email");
	By senhaEmail = By.id("signup-email-input-password");
	By numeroCpf = By.name("signup-email-input-document");
	By telefone = By.id("signup-email-input-phone");
	By idade = By.xpath("//*[@id='signup-email-input-age']");
	By confirmar = By.id("signup-email-button-signUp");
	By sairCadastro = By.id("sidebar-header-close-button");
	By textoCadastro = By.xpath("//*[@id=\"header-user-badge\"]/div/div");
	
	Random aleatorio = new Random();
	int valor = aleatorio.nextInt(100000);

	public void acessarSite (){
		getDriver().get("https://www.ze.delivery");
		clicar(maioridade);
	}
	
	public void preencherDadosDeCadastro() {
		clicar(botaoEntrar);
		clicar(botaoCadastrar);
		clicar(entrarComEMail);
		escrever(nomeESobrenome, "Ze Delivery");
		escrever(eMail, "zedelivery" + valor + "@ze.com.br");
		escrever(senhaEmail, "Ze123Delivery");
		escrever(numeroCpf, "98765432100");
		escrever(telefone, "11111111111");
		escrever(idade, "19");
		clicar(confirmar);
		clicar(sairCadastro);
	}

	public void validarCadastro() {
		validarTexto(textoCadastro, "Olá, Ze");
	}
}