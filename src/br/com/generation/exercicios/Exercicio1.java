package br.com.generation.exercicios;
/* Faça um programa que receba três inteiros e diga qual deles é o maior.*/
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		int numero1, numero2 , numero3;
		
		System.out.print("Digite um numero: ");
		Scanner sc = new Scanner(System.in);
		numero1 = sc.nextInt();
		System.out.print("Digite um numero: ");
		numero2 = sc.nextInt();
		System.out.print("Digite um numero: ");
		numero3 = sc.nextInt();
		
		
		if (numero1 > numero2 && numero1 > numero3){
			System.out.println("Entre "+ numero1 + " " + numero2 + " " + numero3 + " o maior e " + numero1);
		}else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("Entre "+ numero1 + " " + numero2 + " " + numero3 + " o maior e " + numero2);
		}else if(numero3 > numero1 && numero3 > numero2) {
			System.out.println("Entre "+ numero1 + " " + numero2 + " " + numero3 + " o maior e "+ numero3);
		}
		
		


		
	}

}
