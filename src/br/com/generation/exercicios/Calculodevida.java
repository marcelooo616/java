package br.com.generation.exercicios;

import java.util.Scanner;

public class Calculodevida {

	public static void main(String[] args) {
		int idade, ano = 365, meses = 12;
		System.out.println("Exercicio 1 de portugol em java");
		System.out.println("==============================");
        System.out.print("Digite sua idade: ");
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        idade = sc.nextInt();
        System.out.print("(((("+(idade * ano)+" Dias" + "))))");
        
        int dias, idaded = idade, resultado;
        System.out.print("Digite seus dias de vida: ");
        dias = sc.nextInt();
        
        resultado = dias / ano;
        System.out.println("((((" + resultado + " Anos" + "))))");
	}

}
