package project_euler;

public class P006 {

	public static void main(String[] args) {
		int total1 = 0;
		for (int i = 1; i<=100; i++) {
			total1 += Math.pow(i, 2);
		}
		
		int total2 = 0;
		for (int i = 1; i<=100; i++) {
			total2 += i;
		}
		total2 = (int) Math.pow(total2, 2);
		
		System.out.println(total2-total1);

	}

}
