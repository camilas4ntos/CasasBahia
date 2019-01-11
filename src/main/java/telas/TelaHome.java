package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaHome {

	public WebElement menuCBH(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='//carrinho.casasbahia.com.br/Checkout?ReturnUrl=https://www.casasbahia.com.br#login']"));
	}
	
	public WebElement emailCBH(WebDriver driver) {
		return driver.findElement(By.id("Email"));
	}
	
	public WebElement naocadastroCBH(WebDriver driver) {
		return driver.findElement(By.id("rbNaoCadastrado"));
	}
	
	public WebElement continuarCBH(WebDriver driver) {
		return driver.findElement(By.id("btnClienteLogin"));
	}
	
}
