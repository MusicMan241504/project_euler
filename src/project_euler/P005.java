package project_euler;

public class P005 {

	public static void main(String[] args) {
		int i = 1;
		while (true) {
			i++;
			if (isDiv(i)) {
				break;
			}
		}
		System.out.print(i);

	}
	
	public static boolean isDiv(int num) {
		boolean div = true;
		for (int i = 1; i <= 20; i++) {
			if (num%i != 0) {
				div = false;
				break;
			}
		}
		return div;
	}

}
