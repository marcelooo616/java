package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio05dowhilee {
    
	public static void main(String[] args) {
		
		int numero , soma = 0, contador = 0;
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Digite um numero: ");	
		
		
		do {
			numero = sc.nextInt();			
			soma += numero;
		}
		while( numero != 0); 
			
		System.out.println(soma);			
			
		
	}

}
