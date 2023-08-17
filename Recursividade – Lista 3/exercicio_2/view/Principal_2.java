package view;

import java.util.Scanner;

import controller.Metodo_2;

public class Principal_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		Metodo_2 metodo = new Metodo_2();
		
		System.out.println("Insira o primeiro valor (de 10 a 999999)");
		int number = entrada.nextInt();
		if(number < 10 || number > 999999) {
			throw new IllegalArgumentException("Valor inválido");
		}
		
		System.out.println("Insira o Sefgundo valor (de 0 a 9)");
		int number2 = entrada.nextInt();
		if(number2 < 0 || number2 > 9) {
			throw new IllegalArgumentException("Valor inválido");
		}
		
		System.out.println(metodo.SegundoNumeroEstaNoPrimeiro(number, number2));
		entrada.close();
	}

}