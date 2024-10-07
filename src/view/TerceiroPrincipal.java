package view;

import java.util.ArrayList;
import java.util.List;

public class TerceiroPrincipal {

	public static void main(String[] args) {
		
		/* 
		 3) Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente)
		  	uma lista com 10 posições, conforme abaixo:
 				Valores   → 9 8 7 6 5 4 3 2 1 0
 				Posições  → 0 1 2 3 4 5 6 7 8 9
		 */
		 
		List<Integer> listaNumeros = new ArrayList<Integer>(10);
		
		for (int i = 10; i > 0; i--) {
			
			listaNumeros.add(i-1);
		}
		
		System.out.println(listaNumeros);
	}
	
}
