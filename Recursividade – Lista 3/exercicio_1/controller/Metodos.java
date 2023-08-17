package controller;

public class Metodos {

	public Metodos() {
		super();
	}
	
	public int contaDigitos(int numero){
		if (numero == 0) {//Cond Parada: quando o termo for zero
			return 0;
			
		}else {
			numero /= 10;//dividimos o termo por 10, isso desloca a virgula uma casa, contando o digito ao mesmo tempo.
			return 1 + contaDigitos(numero);//retornamos o numero com um digito a menos.
			
		}
		
	}

}
