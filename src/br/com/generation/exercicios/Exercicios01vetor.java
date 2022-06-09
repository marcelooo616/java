package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicios01vetor {

	public static void main(String[] args) {
		
		int valor[] = new int [5];
				int maior = 0;
				int menor = 0;
				Scanner sc = new Scanner(System.in);
				System.out.println("COMPARANDO VALORES");
				System.out.println("Digite um valor: "  );
				for(int i = 0; i < valor.length; i++) {
					
					valor[i] = sc.nextInt();
					
					if(maior < valor[i]) {
						maior = valor[i];
					}
					
						
				}
				
				System.out.println("O maior valor e " + maior);
		
		
	}

}
