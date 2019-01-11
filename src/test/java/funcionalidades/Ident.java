package funcionalidades;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import telas.TelaIdent;

public class Ident {

	TelaIdent ident_CBH = new TelaIdent();
	private WebDriver driver;
	String email = "email@email.com";

	public void preencherEmailIdentificacao() {

		ident_CBH.emailCBH(driver).sendKeys(email);

	}

	public void preencherRadioPrimeiraCompra() {
		ident_CBH.naocadastroCBH(driver).click();
	}

	public void botaoContinuar() {

		ident_CBH.continuarCBH(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void preencherEmail() {

		ident_CBH.emailCBH(driver).sendKeys(email);
	}
}
