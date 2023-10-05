package project_euler;


public class P014 {
	static int[] collatz = new int[1000000];

	public static void main(String[] args) {
		long startTime = System.nanoTime();


		long num = 1;
		long bigNum[] = {num, 1};
		while (num <= 1000000) {
			int count = collatzCount(num);
			collatz[(int)num-1] = count;
			if (count > bigNum[1]) {
				bigNum[0] = num;
				bigNum[1] = count;
			}
			num++;
		}
		System.out.println(bigNum[0]);



		long endTime = System.nanoTime();
		long time = endTime-startTime;
		System.out.println(time/1000000.0 + " ms");
	}

	public static int collatzCount(long num) {
		int count = 1;


		while (num != 1) {
			// use bitwise and to check if even
			if ((num & 1) == 0) {
				num = num/2;
			} else {
				num = 3*num + 1;
			}
			// this only works if within the indexes of the array

			// check if this numbers length has been calculated before and if it has add current length to that and exit loop
			if (num <= 1000000 && collatz[(int)num-1] > 0) {
				count += collatz[(int)num-1];
				break;
			}

			count++;

		}
		return count;
	}

}
