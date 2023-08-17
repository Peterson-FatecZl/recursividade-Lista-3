package controller;

public class Metodo_4 {

	public Metodo_4(){
		super();
	}

	public String transformaEmBinario(int dividendo){
		if(dividendo < 2){
			return String.valueOf(dividendo);//cond. Parada: quando o dividendo for menor que 2, encontramos o ultimo numero da sequência
 
		}else{
			int resto = dividendo % 2;

			String binário = String.valueOf( resto );

			return transformaEmBinario( dividendo / 2) + binário;
			/* Chamamos novamente a função e concatenamos o resto encontrado ao resultado dela;
			   fazemos isso até chegarmos a condiçõa de parada.*/

		}

	}

}