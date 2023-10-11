package project_euler;

public class P015{
	public static void main(String[] args){
		// size of grid corners is x+1,y+1 but as starting at 0 the method inputs should be x,y
		for (int i = 1; i <= 21; i++) {
//			System.out.println(routes(0,0,i));
//			System.out.println(binomialCoefficient(2*i, i));

		}
		System.out.println(binomialCoefficient(2*20, 20));


	}

	public static long routes(int x, int y, int max) {
		if (x == max && y == max) {
			return 1;
		}
		long count = 0;
		if (x < max) {
			count += routes(x+1, y, max);
		}
		if (y < max) {
			count += routes(x, y+1, max);
		}
		return count;
	}
	
	public static long binomialCoefficient(int n, int k) {
		long c = 1;
		k = Math.min(k, n-k); // take advantage of symmetry
		for (int i = 0; i < k; i++) {
			c = c * (n-i) / (i+1); // multiplication must be done first to avoid int div error
		}
		return c;
	}
}
