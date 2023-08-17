package controller;

public class Metodo_2 {

	public Metodo_2() {
		super();
	}
	
	public int SegundoNumeroEstaNoPrimeiro(int primeiro, int segundo){
		if (primeiro == 0) {//Cond Parada: quando o termo de comperação for zero
			return 0;
			
		}else {
			if((primeiro % 10) == segundo) {//se o resto da divisão é igual ao segundo numero então o segundo numero está contido no primeiro
				return 1 + SegundoNumeroEstaNoPrimeiro(((int)primeiro / 10), segundo);//Chamamos a função com o primeiro numero contendo um digito a menos
			}
			return SegundoNumeroEstaNoPrimeiro(((int)primeiro / 10), segundo);//Chamamos a função com o primeiro numero contendo um digito a menos
		}
	}

}
