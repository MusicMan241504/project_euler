package project_euler;

public class P017 {
	static String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	static String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	static String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

	public static void main(String[] args) {
		int letters = 0;
		for (int i = 1; i < 1000; i++) {
			letters += numToWords(i).replace(" ", "").length();
		}
		System.out.println(letters+11); // not worth adding one thousand seperately so just add length of it at end
	}

	static String numToWords(int num) {
		String numStr = Integer.toString(num);
		int[] numArr = new int[3];
		for (int i = 0; i < numStr.length(); i++) {
			numArr[2-i] = Character.getNumericValue(numStr.charAt(numStr.length()-1-i));
		}


		String words = "";



		if (numArr[0] != 0) {
			words = units[numArr[0]] + " hundred ";
		}
		if (numArr[0] != 0 && (numArr[1] != 0 || numArr[2] != 0)) {
			words = words + "and ";
		}
		if (numArr[1] == 1 && numArr[2] > 0) {
			words = words + teens[numArr[2]];
		} else {
			if (numArr[1] != 0) {
				words = words + tens[numArr[1]] + " ";
			}
			if (numArr[2] != 0) {
				words = words + units[numArr[2]];
			}		
		}
		return words;

	}

}
