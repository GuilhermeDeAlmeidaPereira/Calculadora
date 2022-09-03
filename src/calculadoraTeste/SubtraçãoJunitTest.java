package calculadoraTeste;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class SubtraçãoJunitTest {

	@Test
  public void SubtracaoNumeroPositivo() {
	 Subtração calc = new Subtração();
	int sub = calc.sub (8, 7);
	Assert.assertEquals(1, sub); // Teste com números positivos: subtraindo 8-7, teremos um resultado correto de 1.
	 }
	
	@Test
	public void SubtracaoNumeroNegativo() {
		Subtração calc = new Subtração();
		int sub = calc.sub(5, 6); // Teste com números negativos: subtraindo 5-6, teremos um resultado correto de -1. 
		Assert.assertEquals(-1, sub);

	}
	@Test
	public void SubtracaoNumerosNegativo() {
		Subtração calc = new Subtração();
		int sub = calc.sub(5, -6);
		Assert.assertEquals(11, sub);  //Teste com números negativos, para verificar se está correto os sinais: subtraindo 5(-6), teremos um resultado correto de 11. 
	}

	@Test
	public void SubtracaoNumeroQuebrado() {
		Subtração calc = new Subtração();
		int sub = calc.sub(5, 1.5); //Teste com números quebrados: Novamente ocorrendo um erro por causa da variável Int. Solução é trocar para Float.
		Assert.assertEquals(3.5, sub);
	
 }
 
