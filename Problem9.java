public class Problem9 {
	public static void main(String [] args) {

		//Start time
		long startTime = System.currentTimeMillis();

	for( int c = 334; c < 1000; c++) {
		for( int a = 1; a < c; a++) {
			int b = 1000 - c - a;
				if( isPythagTriple(a,b,c)) {
						System.out.println(a + " , " + b + " , " + c);
				}
			}
		}

		//End time 
		long endTime = System.currentTimeMillis();

		//Calculate total time
		long totalTime = endTime - startTime;

		//Print time
		System.out.println("Time is: " + totalTime);
	}

	public static boolean isPythagTriple(int a, int b, int c) {

		if( (a < b) && (b < c) {
			if( (a * a) + (b * b) == (c * c) ) {
				return true;
			}
		}
		return false;
	}
}
