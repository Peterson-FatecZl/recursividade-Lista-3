package controller;

public class Metodo_5 {

	public Metodo_5() {
		super();
	}
	
	public int fibonacciRecursiva(int posicao) {
		if(posicao <= 2) {//Cond. Parada: o código retorna o valor 1 quando chega na primeira ou na segunda posição da série de Fibonacci.
			return 1;
		}else {
			return fibonacciRecursiva(posicao - 1) + fibonacciRecursiva(posicao - 2);
			/* A relação de chamada é definida da seguinte forma: o valor do termo recebido é
			   dado pelos seus 2 ultimos antecessores somados um ao outro e o valor desses atecessores
			   é a soma de seus 2 termos ateriores, na série de fibonaci.*/ 
		}

	}
	
}