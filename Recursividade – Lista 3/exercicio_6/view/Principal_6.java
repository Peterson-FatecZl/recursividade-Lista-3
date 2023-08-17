package view;

import java.util.Scanner;
import controller.Metodo_6;

public class Principal_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Metodo_6 metodo = new Metodo_6();
		
		System.out.println("Insira o valor da ultima base(Esta Será Transformada em Fatorial)");
		int number = scanner.nextInt();
		
		System.out.printf("O Valor da Somatória é: %.3f",metodo.somatoriaDeDivisoesRecursivas(number));
		scanner.close();
	}

}
