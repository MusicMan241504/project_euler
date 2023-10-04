package project_euler;

public class P007 {

	public static void main(String[] args) {
		int max = 10001;
		boolean isPrime = true;
		int[] primes = new int[max];
		int num = 2;
		int i = 0;
		primes[0] = 2;
		while (i<max) {
			isPrime = true;
			for (int j=0; primes[j]<=num/primes[j]; j++) {
				if (num%primes[j] == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes[i] = num;
				i++;
				
			}
			num++;
		}
		System.out.println(primes[i-1]);

	}

}
