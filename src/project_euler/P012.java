package project_euler;

public class P012 {

	public static void main(String[] args) {
		int num = 0;
		int factors = 1;
		for (int i = 1; factors <= 500; i++) {
			num += i;
			
			factors = 0;
			for (int j = 1; j < num / j; j++) {
				if (num%j == 0) {
					factors += 2;
				}
			}
		}
		System.out.println(num);

	}

}
