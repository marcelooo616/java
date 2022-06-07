package br.com.generation.exercicios;

import java.util.Scanner;

public class ConsumodeCombustivel {

	public static void main(String[] args) {
	    
		int metragemA = 8, metragemB = 9, metragemC = 12, resultado, percurso;
		int divford = 12, divfiat = 8, divhonda = 9;
		
		
		String carro;
		
	  System.out.println("===============================");	
	  System.out.println("========Alugel de carros=======");
	  System.out.println("===============================");
      System.out.println("Digite o percurso: ");
      Scanner sc = new Scanner(System.in);
      percurso = sc.nextInt();
      System.out.println("Escolha o carro: ");
      carro = sc.next();
      
      
      switch (carro) {
      case "fiat":
    	//  resultado = metragemA * percurso / 12;
    	  percurso = percurso / divfiat;
    	  System.out.println(percurso + "Litros");    	  
    	  break;
      case "honda":
    	  resultado = metragemB * percurso;
    	  percurso = percurso / divhonda;
    	  System.out.println(percurso + "Litros");
    	  break;
      case "ford":
    	  //resultado = metragemC * percurso ;
    	  percurso = percurso / divford;
    	  System.out.println(percurso + "Litros");
    	  break;
    	  
    	  default:
    		  System.out.println("Opção invalida");
    		  break;
      }
	}

}
