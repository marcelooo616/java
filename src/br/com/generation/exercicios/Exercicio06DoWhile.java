package br.com.generation.exercicios;
import java.lang.ArithmeticException;
import java.util.Scanner;

public class Exercicio06DoWhile {

	public static void main(String[] args) {
		double numero, soma = 0, contador = 0, media = 0 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite numeros: ");
		
		do {
			numero = sc.nextInt();
			
		//vendo se e multiplo de 3		    
			if(numero % 3 == 0) {
			//somando os multiplos de 3	
				soma += numero;
				contador++;
				
				media = soma / contador;
			}
		}
		while( numero != 2); 
		System.out.println("A soma dos multiplos de '3' e: " + soma + " | "+ media );
		System.out.println("fim!!");	
		//System.out.println(media);
		

	}

}
