package calculadoraTeste;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class MultiplicaçãoJunitTest {
	   @Test
	  public void MultiplicacaoNumeroPositivo() {
		Multiplicação calc = new Multiplicação();
		int mult = calc.mult (3, 7);
		Assert.assertEquals(21, mult); // Teste com números positivos: Multiplicando 3 X 7, teremos um resultado correto de 21.
		 }
		
		@Test
		public void MultiplicacaoNumeroNegativo() {
			Multiplicação calc = new Multiplicação();
			int mult = calc.mult(7, -7); // Teste com números negativos: Multiplicando 7 X -7, teremos um resultado correto de -49. 
			Assert.assertEquals(-49, mult);

		}
		@Test
		public void MultiplicacaoNumerosNegativo() {
			Multiplicação calc = new Multiplicação();
			int mult = calc.mult(-2, -2);
			Assert.assertEquals(11, mult);   // Teste para verificar se está correto os sinais. Resultado correto de 4.
		}

		@Test
		public void MultiplicacaoNumeroQuebrado() {
			Multiplicação calc = new Multiplicação();
			int mult = calc.mult(3, 3.3); //Teste com números quebrados: Novamente ocorrendo um erro por causa da variável Int. Solução é trocar para Float.
			Assert.assertEquals(9.9, mult);
		}
		
}
