package br.com.generation.exercicios;
import java.util.Scanner;
public class calculosalario {

	public static void main(String[] args) {
		
		double UMSM = 788, salario,salariototal; 
		
		
		System.out.println("Quantos salario voce tem? ");
		System.out.println("Digite seu salario");
        Scanner sl = new Scanner(System.in);
        salario = sl.nextDouble();
        
        salario = salario ;
        
        if (salario > UMSM) {
        	System.out.println("O seu salario e maior que um salario minimo");
            System.out.println(salario);
	}else {
		System.out.println("voce tem um salario minimo");
		System.out.println(salario);
	}
}
}


