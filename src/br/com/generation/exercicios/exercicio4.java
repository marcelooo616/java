package br.com.generation.exercicios;
import java.math.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		double numero1, numero2, resultado1 = 0, resultado2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
		if (numero1 % 2 == 1 ) {
			resultado2 = numero1 * numero1;
			JOptionPane.showMessageDialog(null, numero1 + "<--Este numero e 'Impar'  ele ao quadrado e: " + resultado2);
		}else {
			//Math.sqrt(numero1);
			resultado1 = Math.sqrt(numero1);
			JOptionPane.showMessageDialog(null, numero1 + " <--Este numero e 'Par' e a raiz e: " + resultado1 );
		}
        //numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
        //resultado = numero1 + numero2;
        //Integer.parseInt(JOptionPane.showInputDialog(resultado));
        
	}

}