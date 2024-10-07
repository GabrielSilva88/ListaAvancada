package view;

import java.util.ArrayList;
import java.util.List;

public class QuintaPrincipal {

/*5) Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente) uma lista com 15 posições com os primeiros
elementos da sequência de Fibonacci:
 Valores   → 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
 Posições → 0 1 2 3 4 5   6   7   8   9 10   11   12   13   14   15
 */
	public static void main(String[] args) {
		List<Integer> fibonacciNumeros = new ArrayList<Integer>(15);
			int t1 = 0;
			int t2 = 1;
			
			for(int i = 0; i <= 15; i++) {
				fibonacciNumeros.add(t2);
				int proximo = t1 + t2;
				t1= t2;
				t2 = proximo;				
			//fibonacciNumeros.add(proximo);
		}
			
		System.out.println(fibonacciNumeros);
	}
}
