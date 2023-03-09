package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Fontes.Calculadora;

public class CalculadoraTeste {

    /**
    * Teste de somar na Calculadora.
    */
   @Test
   public void testeSomar6com2() {
       int nro1 = 6;
       int nro2 = 2;
       Calculadora calc = new Calculadora();
       int resultadoEsperado= 8;
       int resultadoReal = calc.somar(nro1, nro2);
       assertEquals(resultadoEsperado, resultadoReal);
   }
   
    /**
    * Teste de subtrair na Calculadora.
    */
   @Test
   public void testeSubtrair6po2() {
       int nro1 = 6;
       int nro2 = 2;
       Calculadora calc = new Calculadora();
       int resultadoEsperado= 4;
       int resultadoReal = calc.subtrair(nro1, nro2);
       assertEquals(resultadoEsperado, resultadoReal);
   }
   
    /**
    * Teste de multiplicar na Calculadora.
    */
   @Test
   public void testeMultiplicar6po2() {
       int nro1 = 6;
       int nro2 = 2;
       Calculadora calc = new Calculadora();
       int resultadoEsperado= 12;
       int resultadoReal = calc.multiplicar(nro1, nro2);
       assertEquals(resultadoEsperado, resultadoReal);
   }

   /**
   * Teste de dividir na Calculadora.
   */
  @Test
  public void testeDividir6po2() {
      int nro1 = 6;
      int nro2 = 2;
      Calculadora calc = new Calculadora();
      int resultadoEsperado= 3;
      int resultadoReal = calc.dividir(nro1, nro2);
      assertEquals(resultadoEsperado, resultadoReal);
  }

}
