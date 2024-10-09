package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DecimoPrincipal {
/*10) Faça um algoritmo que preencha uma lista de 30 posições com números entre 1 e 15 sorteados pelo computador. 
 * 	  Depois disso, peça para o usuário digitar um número (chave) e seu programa deve mostrar em que posições essa chave foi encontrada.
 * 	  Mostre também quantas vezes a chave foi sorteada./
 */
	
	public static void main(String[] args) {
		List<Integer> sorteadosUmQuize = new ArrayList<Integer>(30);
		Random r = new Random();
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 30; i++) {
			int n = r.nextInt(15) + 1;
			sorteadosUmQuize.add(n);
		}
		
		System.out.println("Digite um número: ");
		int dig = s.nextInt();
		
		
		/* não mostra qtd e vezes */
		for (Integer chave : sorteadosUmQuize) {
			if(chave == dig) {
				if (chave != dig) {
					System.out.println("Chave digitada não esta nessa lista.");
				}
				System.out.println("Posições: " +sorteadosUmQuize.indexOf(dig) + ", numero: " + sorteadosUmQuize.get(dig));
			}
		}
		
		System.out.println(sorteadosUmQuize);
	}
}
