package view;
import java.util.Scanner;
import controller.Metodo_4;
public class Principal_4 { 
	
	public static void main(String[]args){
		
	    Scanner scanner = new Scanner(System.in);
	    Metodo_4 método = new Metodo_4();
	    
	    System.out.println("Digite o número que deseja transformar em Binário");
	    int número = scanner.nextInt();
	
	    System.out.print("Este número  em binário é: "+ método.transformaEmBinario( número ) );
	    
	    scanner.close();
	}
	
}