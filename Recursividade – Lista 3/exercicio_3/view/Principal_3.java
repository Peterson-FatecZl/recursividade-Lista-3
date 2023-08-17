package view;

import java.util.Scanner;

import controller.Metodo_3;

public class Principal_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Metodo_3 metodo = new Metodo_3();
		
		System.out.println("Insira a Palavra que deseja inverter");
		String text = scanner.nextLine();
		
		String newText = metodo.inverteTexto(text, text.length()-1);
		System.out.println(newText);
		
		scanner.close();
	}

}
