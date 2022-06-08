package br.com.generation.exercicios;

import java.util.Scanner;

public class exercicio03while {

	public static void main(String[] args) {
		int idade = 0, contador1 = 1, contador2 = 0;
		System.out.println("Digite : ");
		Scanner sc = new Scanner(System.in);
		idade = sc.nextInt();
		
		while( idade != -99) {
			idade = sc.nextInt();
			if (idade > 0 && idade <= 21) {
				
				contador1++;				
			}
			
			if(idade > 50) {
				
				contador2++;
			}
			
		}
		
		System.out.println("ha "+ contador1 + " com menos de 21 anos");
		System.out.println("ha "+ contador2 + " com mais de 50 anos");
		
			
			
		}

	}


