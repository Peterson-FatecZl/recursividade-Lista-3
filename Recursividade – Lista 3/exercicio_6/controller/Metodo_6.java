package controller;

public class Metodo_6 {

	public Metodo_6() {
		super();
	}
	
	public double somatoriaDeDivisoesRecursivas(double divisor) {
		
		if(divisor == 1) {
			return 1;//Parada: Quando o divisor chega a 1, retornamos 1/1 = 1.
		}else {
			return somatoriaDeDivisoesRecursivas(divisor - 1)+(1 / fatorialRecursivo(divisor));
			/* chamamos a função fatorial, passando nossa base da divisão, pegamos o valor do fatorial
			 * dividimos o 1 por esse valor e somamos com a chamada da função, reduzindo uma unidade no divisor
			 * este loop se repete até chegarmos na condição de parada.
			 * 
			 * RESULTADO:
			 * 1/1 + 1/2 + 1/6 + 1/24 ... 1/N*/
		}
	}
	
	public double fatorialRecursivo(double N) {
		if(N == 1) {
			return 1;//Parada: Paramos quando o valor recebido é igual a 1.
		}else{
			return N * fatorialRecursivo(N - 1);//Multiplicamos o valor recebido pelo seu antecessor, até chegarmos a 1.
		}
	}

}
