package view;

import java.util.ArrayList;
import java.util.List;

public class QuartaPrincipal {
	/*
4) Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente) 
uma lista com 10 posições, conforme abaixo:
 Valores   → 5 3 5 3 5 3 5 3 5 3
 Posições → 0 1 2 3 4 5 6 7 8 9
 */
	public static void main(String[] args) {
		
		List<Integer> listas = new ArrayList<Integer>(10);
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				listas.add(5);
			} else {
				listas.add(3);
			}
		}
		
		System.out.println(listas);
	}
}
