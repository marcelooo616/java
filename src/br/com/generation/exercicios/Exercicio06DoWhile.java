package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio06DoWhile {

	public static void main(String[] args) {
		int numero, soma = 0, contador = 1, media = 0 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite numeros: ");
		
		do {
			numero = sc.nextInt();
			
				    
			if(numero % 3 == 0) {
				
				soma += numero;
				
			}
		}
		while( numero != 0); 
		System.out.println("A soma dos multiplos de '3' e: " + soma);
			
		//System.out.println(media);
		

	}

}
