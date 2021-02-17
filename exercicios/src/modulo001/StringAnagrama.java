package modulo001;

import java.util.Scanner;

public class StringAnagrama {
	/*
	 * Determinar se uma string � anagrama da outra(permuta��o) EX: ROMA � anagrama
	 * de AMOR e de RAMO, mas n�o � de MARRON
	 */

	private static Scanner teclado;

	private static boolean verificaAnagrama(String frase1, String frase2) {
		int resul = 0;
		for (int i = 0; i < frase1.length(); i++)
			resul = resul ^ frase1.charAt(i); // (^)--> XOR

		for (int i = 0; i < frase2.length(); i++)
			resul = resul ^ frase2.charAt(i);

		return (resul == 0);
	}

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira frase: ");		
		String frase1 = teclado.nextLine();
		
		System.out.println("Digite a segunda frase: ");		
		String frase2 = teclado.next();
		

		if (verificaAnagrama(frase1, frase2))
			System.out.println("� anagrama");
		else
			System.out.println("N�o � anagrama");

	}

}
