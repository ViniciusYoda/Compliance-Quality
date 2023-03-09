import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesteMensagem {
	@Test
	public void testeCriaMesnsagemPadrao() {
		String mensx;
		mensx = "Pedro Bo";
		Boasvindas mensagemUsuario = new Boasvindas(mensx);
		String mensretorno = mensagemUsuario.completarMenssagem();
		assertEquals("Ola! Seja bem vindo a sua calculadora pessoal", mensretorno);
	}

	@Test
	public void testeExibeMesnsagem() {
		String mensx;
		mensx = "Pedro Bo";
		Boasvindas mensagemUsuario = new Boasvindas(mensx);
		String mensRetorno;
		mensRetorno = mensagemUsuario.exibirMenssagem();
		assertEquals(mensx, mensRetorno);
	}
}