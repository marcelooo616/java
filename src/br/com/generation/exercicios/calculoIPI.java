package br.com.generation.exercicios;

import java.util.Scanner;

public class calculoIPI {
/*Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)*/
	public static void main(String[] args) {
		
		int peca1 = 1, peca2 = 2, pecasjapedidas1 = 100, pecasjapedidas2 = 100;
		int valorpeca1 = 1, valorpeca2 = 2 ,soma1,soma2, resultado;
		//Scanner sc = new Scanner(System.in);
		System.out.println("porcentagem do IPI");
		System.out.println("Digite a qunatidade de peca 1: ");
		Scanner sc = new Scanner (System.in);
		peca1 = sc.nextInt();
		System.out.println("Digiten a quantidade de peca 2: ");
        peca2 = sc.nextInt();
        
        pecasjapedidas1 = pecasjapedidas1 * valorpeca1;
        pecasjapedidas2 = pecasjapedidas2 * valorpeca2;
        soma1 = peca1 * valorpeca1;
        soma2 = peca2 * valorpeca2;
        resultado = (soma1 + soma2) + (pecasjapedidas1 + pecasjapedidas2) ;
        
        System.out.println("O valor a ser acrecido e : " + (soma1 + soma2)+"\no valor total com acrecimo e: "+resultado);
        
        
        
	}

}

