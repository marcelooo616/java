package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio2for {

	public static void main(String[] args)  {
		int numero = 0;
		int contadopar = 0, contadorimpar = 0;
		
		
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um numero: ");
			Scanner sc = new Scanner(System.in);
			numero = sc.nextInt();
			// System.out.println(numero);
			//System.out.println(i);
			if (numero % 2 == 0 ) {
				contadopar++;
				 
				 //System.out.println(contador);
			 }if(numero % 2 != 0) {
				 contadorimpar++;
				 
			 }
			
		} System.out.println("De '0' a '10' ha : " +  contadopar + " numero pares");
		 System.out.println("De '0' a '10' ha : " + contadorimpar + " numero impares");
		 

	}

}
