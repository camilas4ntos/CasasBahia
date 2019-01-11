package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaIdent {

	public WebElement emailCBH(WebDriver driver) {
		return driver.findElement(By.id("Email"));
	}
	
	public WebElement naocadastroCBH(WebDriver driver) {
		return driver.findElement(By.id("rbNaoCadastrado"));
	}
	
	public WebElement continuarCBH(WebDriver driver) {
		return driver.findElement(By.id("btnClienteCadastrar"));
	}
	
	public WebElement esqueciCBH(WebDriver driver) {
	return driver.findElement(By.id("lnkEsqueciSenha"));
	}

 //   public AbstractButton esqueciCBH(org.openqa.selenium.WebDriver driver) {
  //  }
}
