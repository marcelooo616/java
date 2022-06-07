package br.com.generation.exercicios;

import java.util.Scanner;

public class ExercicioLadosdotriangulo {

	public static void main(String[] args) {
		
		int ladoA, ladoB, ladoC;
		int soma1 = 0, soma2 = 0, soma3 = 0;
		
		System.out.println("Digite o lado A do triangulo: ");
		Scanner sc = new Scanner(System.in);
		ladoA = sc.nextInt();
		System.out.println("Digite o lado B do triangulo: ");
		ladoB = sc.nextInt();
		System.out.println("Digite o lado C do triangulo: ");
		ladoC = sc.nextInt();
		
		soma1 =  ladoC + ladoB;
		soma2 =  ladoC + ladoA;
		soma3 =  ladoA + ladoB;
		
		if(ladoA < soma1 && ladoB < soma2 && ladoC < soma3) {
			System.out.println(" A soma dos lados e: " + soma1);
		}else {
			System.out.println("!!Um dos lados e invalido!!"); 
		}
		
	}

}
