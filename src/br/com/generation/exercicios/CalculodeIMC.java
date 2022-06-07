package br.com.generation.exercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculodeIMC {

	public static void main(String[] args) {
		
		double peso, altura, IMC;
		
//		System.out.print("Digite usa altura: ");
//		Scanner sc = new Scanner(System.in);
		altura = Integer.parseInt(JOptionPane.showInputDialog("Digite usa altura: "));
		System.out.print("Digite seu Peso: ");
//		Scanner sc = new Scanner(System.in);
		peso = Integer.parseInt(JOptionPane.showInputDialog("Digite seu Peso: "));
		
		IMC = peso / (altura * altura);
		
		System.out.println(IMC);
	}

}
