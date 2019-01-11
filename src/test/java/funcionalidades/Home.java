package funcionalidades;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import telas.TelaHome;

public class Home {
	
	TelaHome homecbh = new TelaHome();
	private WebDriver driver;
	
	public void acessarMenuEntre() throws InterruptedException{
		
		Thread.sleep(30000);
		homecbh.menuCBH(driver).click();

		
//		linkSenha = ident_CBH.esqueciCBH(driver).getText();
//		Assert.assertEquals("Validacao", "Esqueci minha senha", linkSenha);
	
	}
	

}
