package br.com.generation.exercicios;

public class Exercicio01for {

	public static void main(String[] args) throws InterruptedException {
		
		
		for(int i = 1000; i <= 1999; i++) {
			
			if (i % 11 == 5) {
				System.out.println(i);
			}
			//System.out.println(i);
			
			//Thread.sleep(500);
		}

	}

}
