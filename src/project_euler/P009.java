package project_euler;

public class P009 {

	public static void main(String[] args) {
		for (int a = 1; a < 1000; a++) {
			for (int b = 1; b < 1000; b++) {
				for (int c = 1; c < 1000; c++) {
					if (Math.pow(a, 2)+Math.pow(b, 2) == Math.pow(c, 2) && a + b + c == 1000) {
						int product = a*b*c;
						System.out.println(product);
						a = 1000;
						b = 1000;
						c = 1000;
					}
				}
			}
		}

	}

}
