package project_euler;

public class P010 {

	public static void main(String[] args) {
		int max = 2000000;
		int[] primes = new int[1000000];
		int i = 0;
		int num = 2;
		primes[i] = num;
		
		long total = 0;

		while (num < max) {
			boolean isPrime = true;
			for (int j = 0; primes[j] <= num/primes[j]; j++) {
				if (num%primes[j] == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes[i] = num;
				total+=num;
				i++;
			}
			num++;
		}
		
		for (int prime : primes) {
			System.out.println(prime);
		}
		
		System.out.println(total);
	}

}
