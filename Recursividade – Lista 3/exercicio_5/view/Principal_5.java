package view;

import java.util.Scanner;
import controller.Metodo_5;

public class Principal_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Metodo_5 metodo = new Metodo_5();
		
		
		System.out.println("insira o valor da posição desejada (Sequência Fibonacci)!");
		int number = scanner.nextInt();
		
		System.out.println("Nesta posição o valor é: "+(metodo.fibonacciRecursiva(number)));
		
		scanner.close();
	}

}
