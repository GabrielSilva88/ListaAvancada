package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SetimoPrincipal {
	/*
	 * 7) Faça um programa que leia 7 nomes de pessoas e guarde-os em uma lista. No
	 * final, mostre uma listagem com todos os nomes informados, na ordem inversa
	 * daquela em que eles foram informados.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<String> NomesLista = new ArrayList<String>();
		
		for (int i = 0; i < 8; i++) {
			
			System.out.println("Digite nomes: ");
			String nomes = scan.nextLine();
			NomesLista.add(nomes);
		}
		
		Collections.reverse(NomesLista);
		
		System.out.println("Nomes: " + NomesLista);
	}
}
