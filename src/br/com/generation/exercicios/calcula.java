package br.com.generation.exercicios;

import java.util.Scanner;

public class calcula {
	//public class exerciciocalculadora {
		public static void main(String[] args) {
			System.out.println("=====Calculadora======");
			double numero1, numero2, resultado = 0;
			String operador ;
			
			System.out.print("Digite o primeiro valor: ");
		    Scanner sc = new Scanner(System.in);
				numero1 = sc.nextDouble();
				System.out.print("Digite o operador: ");
				operador = sc.next() ; 
				System.out.print("Digite o primeiro valor: ");
				numero2 = sc.nextDouble();
			
			switch(operador) {
			
			case "+":
				resultado = numero1 + numero2;
				break;
			case "-":
				resultado = numero1 - numero2;
				break;
			case "/":
				resultado = numero1 / numero2;
				break;
			case "*":
				resultado = numero1 * numero2;
				break;
			 default:
	             System.out.println("Opção inválida!!");
			}
			System.out.println(resultado);
			
		
		}

	}


//}
