package calculadoraTeste;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class SomaJunitTest {
	@Test
  public void SomarDoisNumerosPositivos() {
	 Soma calc = new Soma();
	int soma = calc.soma (3, 7);
	Assert.assertEquals(10, soma);
	 }
	public void Somando() {
		Soma calc = new Soma();
		int soma = calc.soma(5, 1.5);
		Assert.assertEquals(6.5, soma);
	}
 }
 