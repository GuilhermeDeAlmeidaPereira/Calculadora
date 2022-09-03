package calculadoraTeste;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class DivisãoJunitTest {
	
	       @Test
		  public void DivisãoMultiplicacaoNumeroPositivo() {
		   Divisão calc = new  Divisão();
			int div = calc.div (10, 2);
			Assert.assertEquals(2, div); // Teste com números positivos: Dividindo 10 por 2, teremos um resultado correto de 2.
			 }
			
			@Test
			public void  DivisãoNumeroNegativo() {
				 Divisão calc = new  Divisão();
				int div = calc.div(-2, -1); ; // Teste com números negativos: Dividindo -2 por 1, teremos um resultado correto de -2.
				Assert.assertEquals(-2, div);

			}
			@Test
			public void DivisãoNumeroQuebrado() {
				 Divisão calc = new  Divisão();
				int div = calc.div(10, 2.5);
				Assert.assertEquals(4, div);    /* Teste com números quebrados: Novamente ocorrendo um erro por causa da variável Int.
				 Solução é trocar a var para Float.*/
			}

			@Test
			public void  DivisãoNumeroImpar() {
				 Divisão calc = new  Divisão();
				int div = calc.div(7, 3); /* Teste com números ímpares: Dividindo 7 por 3, Teremos um resultado no console de 2, quando na verdade o correto seria de 2,333...
				 Solução é trocar a var para Float. */
				Assert.assertEquals(2.333, div);  
				
			}
			
			@Test
			public void  DivisãoPorZero() {
				 Divisão calc = new  Divisão();
				int div = calc.div(10, 0); ;  // Qualquer numero dividido por 0 ocorre um erro no sistema.
				Assert.assertEquals(0, div);  
			
           }
}
