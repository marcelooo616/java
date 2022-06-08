package br.com.generation.exercicios;

import java.util.Scanner;

public class ExercicioLadosdotriangulo {

	public static void main(String[] args) {
		
		int ladoA, ladoB, ladoC;
		int soma1 = 0, soma2 = 0, soma3 = 0, triangulo = 0;
		
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
		triangulo = ladoA+ladoB+ladoC;
		/*"Nesse caso, um triângulo pode ser escaleno, quando todos os lados possuem
		 *  medidas diferentes; isósceles, quando existem dois lados que possuem mesma
		 *   medida; ou equilátero, quando todos os"

*/
		if(ladoA < soma1 && ladoB < soma2 && ladoC < soma3) {
			if (ladoA != ladoB && ladoB != ladoC) {
				System.out.println(" 'Triangulo Escaleno' -> Porque todos os lado posuem mediads diferentes ");
			}else if(ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
				System.out.println("'trinagulo Isoscelas' -> Porque ha dois lados com medidas iguais'");
			}else if(ladoA == ladoB && ladoB == ladoC && ladoC == ladoA) {				
				System.out.println("'Tringulo Equilatero -> Porque todos os lados são congruentes");				
			}if (soma1 == 108 || soma2 == 180 || soma3 == 180) {
				System.out.println("'Tringulo Retangulo' -> Porque a soma dos seus lados e igual a '180°'");
			}
			System.out.println(" A soma dos lados e: " + triangulo);
		}else {
			System.out.println("!!Um dos lados e invalido!!"); 
		}
		
		
	}

}
