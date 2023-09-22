package project_euler;

public class P002 {

	public static void main(String[] args) {
		int total = 0;
		int num = 1;
		int numOld = 1;
		int tmp = 1;
		while(num<4000000) {
			tmp = num;
			num = num + numOld;
			numOld = tmp;
			if (num%2 == 0) {
				total+=num;
			}
		}
		System.out.println(total);

	}

}
