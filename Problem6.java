public class Problem6 {
	public static void main(String [] args) {
		double startTime = System.currentTimeMillis();

		long answer = squareOfSums(100) - sumOfSquares(100);

		System.out.println("The answer is: " + answer);

		double endTime = System.currentTimeMillis();
		double time = endTime - startTime;

		System.out.println("Time: " + time);
	}

	public static long sumOfSquares( int x) {
		long sum = 0;
		for( long i = 0; i <= x; i++) {
			sum += i * i; 
		}
		return sum;
	}

	public static long squareOfSums( int x) {
		long sum = 0;
		for( long i = 0; i <= x; i++) { 
			sum += i;

		}
		return sum * sum;

	}

}