package funcionalidades;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import telas.TelaCadastro;

public class Cadastro {

	TelaCadastro cadastroCBH = new TelaCadastro();
	private WebDriver driver;
	

	String nomeCompleto = "Marcio Santos";
	String cpf = "28186422056";
	String linkSenha = "Esqueci minha senha";
	String senha = "12345";
	String email = "email@email.com";

	public void acessarUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.casasbahia.com.br");

	}

	public void preencherNome() {
		cadastroCBH.nomeCBH(driver).sendKeys(nomeCompleto);
	}

	public void preencherCpf() {
		cadastroCBH.cpfCBH(driver).sendKeys(cpf);
	}

	public void preencherTelefone() {
		// Select comboTelefone = new
		// Select(driver.findElement(By.id("TipoFone1")));
	}

	public void preencherConfirmarEmail() {
		cadastroCBH.confemailCBH(driver).sendKeys(email);
	}

	public void preencherSenha() {
		cadastroCBH.senhaCBH(driver).sendKeys(senha);
	}

	public void preencherConfirmarSenha() {
		cadastroCBH.confsenhaCBH(driver).sendKeys(senha);

	}

	// linkSenha = indentificacaocbh.esquecisenha(driver).getText();
	// assertEquals(linkSenha, "Esqueci minha senha" );

	// emailinvalido = indentificacaocbh.emailinvalido(driver).getText();
	// assertEquals (emailinvalido, "Formato de E-mail inválido");
	// indentificacaocbh.email(driver).clear();

}
