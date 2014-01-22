public class Problem9 {
	public static void main(String [] args) {

		//Start time
		long startTime = System.currentTimeMillis();

		for( int a = 0; a < c; a++) {
				for( int c = 334; c < 1000; c++) {
					int b = 1000 - c; 
				if( (a * a) || (b * b) == (c * c)) {
					System.out.println(a + " , " b + " , " + c);
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

	
}