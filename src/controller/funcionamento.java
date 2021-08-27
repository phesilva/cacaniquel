package controller;

import java.util.Random;

public class funcionamento {
	Random random = new Random();
	private Boolean resultado;
	
	public String sortidos() {
		Random random = new Random();
		int primeiro = 0;
		int a = random.nextInt(150);
		//Primeiro looping para o primeiro numero
		for(int i = 0; i < a; i++) {
			 primeiro = random.nextInt(7);
			 while(primeiro == 0) {
				 primeiro = random.nextInt(7);
			 }
		}
		String a1 = Integer.toString(primeiro);
		return a1;
	}
	public String Sortidos3() {
		//looping pro terceiro numero
		int c = random.nextInt(150);
		int terceiro = 0;
		for(int i = 0; i < c; i++) {
			 terceiro = random.nextInt(7);
			 while(terceiro == 0) {
				 terceiro = random.nextInt(7);
			 }
		}
		String c3 = Integer.toString(terceiro);

		return c3;
	}
	//Segundo numero
	public String Sortido2() {
		int b = random.nextInt(150);
		int segundo=0;
				for(int i = 0; i < b; i++) {
					 segundo = random.nextInt(7);
					 while(segundo == 0) {
						 segundo = random.nextInt(7);
					 }
				}
				String b2 = Integer.toString(segundo);
		return b2;
	}
	//resultado do caçaniquel ainda não implementado
	/*
	public Boolean WinAndLose() {
		Boolean resultado2 = false;
		if(sortidos() == Sortido2() && Sortido2() == Sortidos3()) {
			
			resultado2 = true;
	    }else if(sortidos()== Sortido2()){
	    	resultado2 = false;
	    }
		return resultado2;
	}*/
}
