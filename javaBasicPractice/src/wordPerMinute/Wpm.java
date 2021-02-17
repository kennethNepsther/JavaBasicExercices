package wordPerMinute;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Wpm {

	static String words[] = { "nuceque", "outro", "texto", "mais um" };

	public static void main(String[] args) throws InterruptedException {

		/* Calcula o tempo para se escrever um texto */
		System.out.println(3);
		TimeUnit.SECONDS.sleep(1);

		System.out.println(2);
		TimeUnit.SECONDS.sleep(1);

		System.out.println(1);
		TimeUnit.SECONDS.sleep(1);

		System.out.println("Valendo...");

		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.print(words[rand.nextInt(words.length)]);

		}

	}

}
