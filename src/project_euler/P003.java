package project_euler;


public class P003 {

	public static void main(String[] args) {
		long largestFactor = 1;
		long num = 600851475143L;
		for (long i = 1; i<Math.sqrt(num);i++) {
			if (num%i == 0 && isPrime(i)) {
				largestFactor = i;
			}
		}
		System.out.print(largestFactor);
	}

	public static boolean isPrime(long num) {
		boolean prime = true;
		for (long i = 2; i < Math.sqrt(num); i++) {
			if (num%i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}
