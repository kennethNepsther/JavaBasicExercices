package reactFast;

import java.util.Scanner;

public class ReactFast {

	private static Scanner teclado;

	public static void main(String[] args) throws InterruptedException {
		
		/*Calcula o tempo de reação até pressionar uma tecla*/
		System.out.println(3);
		Thread.sleep(1000);
		System.out.println(2);
		Thread.sleep(1000);
		System.out.println(1);
		Thread.sleep(1000);
		System.out.println("Valendo...");
		long startTime = System.currentTimeMillis();

		teclado = new Scanner(System.in);

		teclado.next();
		long StopTime = System.currentTimeMillis();

		long reactionTime = StopTime - startTime;
		System.out.println(reactionTime + "ms");
	}
}
