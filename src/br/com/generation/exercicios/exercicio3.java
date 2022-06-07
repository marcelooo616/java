package br.com.generation.exercicios;

import javax.swing.JOptionPane;

public class exercicio3 {
    /*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
      categoria ela se encontra:
     10-14 infantil
     15-17 juvenil
     18-25 adulto*/
	public static void main(String[] args) {
		int idade ;
		//System.out.println(idade);
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
		
		if (idade >= 10 && idade <= 14) {
			JOptionPane.showMessageDialog(null, "Infatil");
			
		}if (idade >= 15 && idade <= 17) {
			JOptionPane.showMessageDialog(null, "Juvenil");
			
		}if (idade >= 18 && idade <= 25 ) {
			JOptionPane.showMessageDialog(null, "Jovem Adulto");
			
		}if (idade >= 26 && idade <= 59 ) {
			JOptionPane.showMessageDialog(null, "Adulto");
			
		}if (idade >= 60 && idade <= 80 ) {
			JOptionPane.showMessageDialog(null, "Ja começa a escreve o testamento kk");
			
		}
		
		

	}

}
