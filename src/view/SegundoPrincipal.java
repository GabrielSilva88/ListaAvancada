package view;

import java.util.ArrayList;
import java.util.List;

public class SegundoPrincipal {
	
	/*
	2) Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente) uma lista com 10 posições, conforme abaixo:
		Valores    → 5 10 15 20 25 30 35 40 45 50
	 	Posições → 0   1   2   3   4   5   6   7   8   9
	 */
	
	public static void main(String[] args) {
			List<Integer> numeros = new ArrayList<Integer>(10);
			int n=0;
			
			 for (int i = 0; i < 10; i++) {
				n +=5;
				numeros.add(n);
				 // numeros.add(5*(i+1)); auternativo
			}
			 
			 System.out.println(numeros);
			 
			 System.out.print(numeros.size());
		} 
}
