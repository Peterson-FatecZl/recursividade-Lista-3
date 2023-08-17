package controller;

public class Metodo_3 {

	public Metodo_3() {
		super();
	}
	
	public String inverteTexto(String texto, int tam){
		if(tam == 0) {
			return texto.substring(0, 1);//paramos quando estivermos na primeira letra da String
		}
		return texto.substring(tam, tam+1) + inverteTexto(texto, tam-1);//aqui pegamos a ultima letra da palavra e chamamos
																		//novamente a função com a palvra sem sua ultima letra.
		
	}

}
