package project_euler;

import java.math.BigInteger;

public class P016 {

	public static void main(String[] args) {
		BigInteger base = BigInteger.valueOf(2);
		BigInteger num = base.pow(1000);
		String numStr = num.toString();
		int sum = 0;
		for (int j = 0; j < numStr.length(); j++) {
			sum += Character.getNumericValue(numStr.charAt(j));
		}
		System.out.println(sum);
	}

}
