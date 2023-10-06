package project_euler;

public class P015{
	public static void main(String[] args){
		// size of grid corners is x+1,y+1 but as starting at 0 the method inputs should be x,y
		for (int i = 1; i < 13; i++) {
			System.out.println(routes(0,0,i));
		}


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
}
