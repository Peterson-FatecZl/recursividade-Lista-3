package view;
import java.util.Scanner;

import controller.Metodos;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		Metodos metodo = new Metodos();
		
		System.out.println("Insira o Número");
		int numero = entrada.nextInt();
		
		int totalDeDigitos = metodo.contaDigitos(numero);
		System.out.println(totalDeDigitos);
		
		entrada.close();
	}

}
