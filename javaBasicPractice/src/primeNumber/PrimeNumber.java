package primeNumber;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(findPrimes(1, 1000));

	}

	private static ArrayList<Integer> findPrimes(int start, int end) {
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = start; i < end; i++) {
			boolean prime = true;
			int j = 2;
			while (j <= i / 2) {
				if (i % j == 0) {
					prime = false;
					break;
				}
				j++;
			}
			if (prime) {
				primes.add(i);
			}

		}
		return primes;

	}
}
