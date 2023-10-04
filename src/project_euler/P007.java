package project_euler;

import java.util.LinkedList;

public class P007 {

	public static void main(String[] args) {
		boolean isPrime = true;
		LinkedList<Integer> primes = new LinkedList<Integer>();
		int num = 2;
		primes.add(num);
		while (num<1000) {
			isPrime = true;
			for (int prime : primes) {
				if (num%prime == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes.add(num);
				
			}
			num++;
		}



		for (int prime: primes) {
			System.out.println(prime);
		}

	}

}
