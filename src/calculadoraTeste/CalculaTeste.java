package calculadoraTeste;
public class CalculaTeste {

	public static void main(String[] args) {
		 Soma calc = new Soma();
		 int soma = calc.soma(3,7);
		 System.out.println(soma); // Teste com números positivos: Somando 3 + 7, teremos um resultado correto de 10.
		 
		Soma calc2 = new Soma();
		 int soma2 = calc2.soma(5,1.5);
		 System.out.println(soma2); 
		 /*Teste com números quebrados: Aqui temos um erro, pois somando 5 + (1,5), teremos um resultado de 6,5, porém como a variável é do tipo Int
		 ele está ocorrendo  um erro, pois Inteiro só suporta números inteiros. A sugestão seria trocar 
		 a variável para Float, que suporta números quebrados.*/
		 
		 Soma calc3 = new Soma();
		 int soma3 = calc3.soma(6,-7); //Teste com números negativos: Somando 6 + (-7), teremos um resultado correto de -1.
		 System.out.println(soma3);
		 
		 
		 /**************************************************************/
		 Subtração calcsub1 = new Subtração();
		 int sub = calcsub1.sub(8,7);
		 System.out.println(sub); // Teste com números positivos: subtraindo 8-7, teremos um resultado correto de 1.
		 
		 Subtração calcsub2 = new Subtração();
		 int sub2 = calcsub2.sub(5,6);
		 System.out.println(sub2); // Teste com números negativos: subtraindo 5-6, teremos um resultado correto de -1. 
		 

		 Subtração calcsub3 = new Subtração();
		 int sub3 = calcsub3.sub(5,-6);
		 System.out.println(sub3); 
		 // Teste com números negativos, para verificar se está correto os sinais: subtraindo 5-(-6), teremos um resultado correto de 11. 
		 
		 Subtração calcsub4 = new Subtração();
		 int sub4 = calcsub4.sub(5,1.5); //Teste com números quebrados: Novamente ocorrendo um erro por causa da variável Int. Solução é trocar para Float.
		 System.out.println(sub4);
		 
		 /**************************************************************/
		 Multiplicação calcmult = new Multiplicação(); // Teste com números positivos: Multiplicando 3 X 7, teremos um resultado correto de 21.
		 int mult = calcmult.mult(3,7);
		 System.out.println(mult);
		 
		 Multiplicação calcmult2 = new Multiplicação(); // Teste com números negativos: Multiplicando 3 X 7, teremos um resultado correto de -21.
		 int mult2 = calcmult2.mult(7,-7);
		 System.out.println(mult2);
		 
		 Multiplicação calcmult3 = new Multiplicação(); // Teste para verificar se está correto os sinais. Resultado correto de 4.
		 int mult3 = calcmult3.mult(-2,-2);
		 System.out.println(mult3);
		 
		 Multiplicação calcmult4 = new Multiplicação(); 
		 int mult4 = calcmult4.mult(3,3.3);
		 System.out.println(mult4); /*Teste com números quebrados: Novamente ocorrendo um erro por causa da variável Int.
		 Solução é trocar a var para Float. */
		 
		 /**************************************************************/
		 Divisão calcdiv = new  Divisão();
		 int div = calcdiv.div(10,2); // Teste com números positivos: Dividindo 10 por 2, teremos um resultado correto de 2.
		 System.out.println(div);
		 
		 Divisão calcdiv2 = new  Divisão();
		 int div2 = calcdiv2.div(-2,1); // Teste com números negativos: Dividindo -2 por 1, teremos um resultado correto de -2.
		 System.out.println(div2);
		 
		 Divisão calcdiv3 = new  Divisão();
		 int div3 = calcdiv3.div(10,2.5);
		 System.out.println(div3);
		 /* Teste com números quebrados: Novamente ocorrendo um erro por causa da variável Int.
		 Solução é trocar a var para Float.*/
		
		 
		 Divisão calcdiv4 = new  Divisão();
		 int div4 = calcdiv4.div(7,3); 
		 System.out.println(div4);
		/* Teste com números ímpares: Dividindo 7 por 3, Teremos um resultado no console de 2, quando na verdade o correto seria de 2,333...
		 Solução é trocar a var para Float. */

		 Divisão calcdiv5 = new  Divisão();
		 int div5 = calcdiv5.div(10,0); // Qualquer numero dividido por 0 ocorre um erro no sistema.
		 System.out.println(div5);
	}

}
