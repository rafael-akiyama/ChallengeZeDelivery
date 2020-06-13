package br.com.web.util;

import static br.com.web.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
 
public class BasePage {
 
    //Metodo para clicar
    public void clicar (By elementBy) {
        getDriver().findElement(elementBy).click();
    }
    
    //Metodo para clicar por texto
    public void clicarPorTexto(String texto) {
    	clicar(By.xpath("//*[@text=' + texto + ']"));
	}
 
    //Metodo para escrever
    public void escrever (By elementBy, String text) {
        getDriver().findElement(elementBy).sendKeys(text);
    }
 
    //Metodo para ler texto
    public String readText (By elementBy) {
        return getDriver().findElement(elementBy).getText().toString();
    }
 
    //Metodo de comparacao de texto
    public void validarTexto (By elementBy, String expectedText) {
        Assert.assertEquals(readText(elementBy), expectedText);
    }
}
