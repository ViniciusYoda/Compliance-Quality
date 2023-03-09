package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Fontes.MensagemBoasVindas;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class MensagemBoasVindasTeste {

	//Preparação de testes
	public MensagemBoasVindas mensUsuario;
	@Before
	public void prepTeste() {
		String mensx = "Pedro Bo";
		mensUsuario = new MensagemBoasVindas(mensx);   
	}  
		
	//Teste da mensagem de abertura
	@Test
	public void t01testeCriarMensRecepcao() {
	    String mensretorno = mensUsuario.exibirMensAbertura();
		assertEquals("Ola! Seja bem vindo a sua calculadora pessoal,", mensretorno);     
	}
	   
	//Teste da mensagem complementar
   @Test
   public void t02testeExibeMensComplementar() {
	  String mensRetornoEsperado = "Pedro Bo!/nConfira os resultados dos testes no painel da JUNIT!";	
      String mensRetornoReal = mensUsuario.exibirMensComplemento();
      assertEquals(mensRetornoEsperado, mensRetornoReal);     
   }

}
