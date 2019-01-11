package testes;

import org.junit.Test;

import funcionalidades.Cadastro;
import funcionalidades.Home;
import funcionalidades.Ident;


public class Teste {
	

	
	Cadastro cadastro = new Cadastro();
	Home home = new Home();
	Ident ident = new Ident();
	
	@Test

	public void testNovoCadastro() throws InterruptedException{
		cadastro.acessarUrl();
		home.acessarMenuEntre();
		ident.botaoContinuar();
		cadastro.preencherNome();
		cadastro.preencherCpf();
		cadastro.preencherConfirmarEmail();
		cadastro.preencherSenha();
		cadastro.preencherConfirmarSenha();
		

		
	}
}
