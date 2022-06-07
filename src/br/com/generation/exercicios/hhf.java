package br.com.generation.exercicios;

import java.util.Scanner;

public class hhf {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3; 

            System.out.print("Digite o 1° numero: ");
            num1 = sc.nextInt();

            System.out.print("Digite o 2° numero: ");
            num2 = sc.nextInt();

            System.out.print("Digite o 3° numero: ");
            num3 = sc.nextInt();

            if(num1 > num2 && num2 > num3) {
                System.out.println("--Sequencia--\n" + "1° " + num1 + "\n2° " + num2 + "\n3° " + num3);

            }
            if(num1 > num3 &&  num3 > num2) {
                System.out.println("--Sequencia--\n" + "1° " + num1 + "\n2° " + num3 + "\n3° " + num2);

            }
            if(num2 > num3 && num3 > num1 ) {
                System.out.println("--Sequencia--\n" + "1° " + num2 + "\n2° " + num3 + "\n3° " + num1);

            }
            if(num2 > num1 && num1 > num3 ) {
                System.out.println("--Sequencia--\n" + "1° " + num2 + "\n2° " + num1 + "\n3° " + num3);

            }
            if(num3 > num2 && num2 > num1 ) {
                System.out.println("--Sequencia--\n" + "1° " + num3 + "\n2° " + num1 + "\n3° " + num2);

            }
            if(num3 > num1 && num1 > num2 ) {
                System.out.println("--Sequencia--\n" + "1° " + num3 + "\n2° " + num1 + "\n3° " + num2);

        }
    }
}

