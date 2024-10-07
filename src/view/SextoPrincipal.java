package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SextoPrincipal {
	/* 
	6)  Crie um programa que preencha automaticamente uma lista com 7
		números gerados aleatoriamente pelo computador e depois mostre os valores
		gerados na tela.
	*/
	public static void main(String[] args) {
		
		List<Integer> aleatoria = new ArrayList<Integer>();
		
		for (int i = 0; i < 8; i++) {
			Random r = new Random();
			int nr = r.nextInt(7);
			aleatoria.add(nr);
			
			//aleatoria.add(r.nextInt(7));
		}
		
		System.out.println(aleatoria);
		
	}
}
