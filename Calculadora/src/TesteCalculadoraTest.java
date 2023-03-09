import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalculadoraTest {

	/**
	* Teste de somar na Calculadora.
	*/
	@Test
	public void testeSomar() {
	int nro1 = 5;
	int nro2 = 5;
	CalculadoraDim calc= new CalculadoraDim();
	int resultadoEsperado = 10;
	int resultadoReal= calc.somar(nro1, nro2);
	assertEquals(resultadoEsperado, resultadoReal);
	}
	
	/**
	* Teste de subtrair na Calculadora.
	*/
	@Test
	public void testeSubtrair() {
	int nro1 = 5;
	int nro2 = 3;
	CalculadoraDim calc = new CalculadoraDim();
	int resultadoEsperado= 2;
	int resultadoReal= calc.subtrair(nro1, nro2);
	assertEquals(resultadoEsperado, resultadoReal);
	}
	
	/**
	* Teste de multiplicar na Calculadora.
	*/
	@Test
	public void testeMultiplicar() {
	int nro1 = 3;
	int nro2 = 3;
	CalculadoraDim calc = new CalculadoraDim();
	int resultadoEsperado = 9;
	int resultadoReal = calc.multiplicar(nro1, nro2);
	assertEquals(resultadoEsperado, resultadoReal);
	}
	
	/**
	* Teste de dividir na Calculadora.
	*/
	@Test
	public void testeDividir() {
	int nro1 = 6;
	int nro2 = 2;
	CalculadoraDim calc = new CalculadoraDim();
	int resultadoEsperado= 3;
	int resultadoReal = calc.dividir(nro1, nro2);
	assertEquals(resultadoEsperado, resultadoReal);
	}

}
