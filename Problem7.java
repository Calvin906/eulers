public class Problem7 {
	public static void main(String [] args) {

		//Start the timer
		double startTime = System.currentTimeMillis();

		int i = 0;
		int count = 0;
		while( count < 10001 ){

			i++;

			if( isPrime(i) ){
				count++;
			}
		}

		System.out.println(i);

		//End the timer
		double endTimer = System.currentTimeMillis();

		//Calculate time
		double totalTime = endTimer - startTime;

		//Print out the time
		System.out.println("Time is: " + totalTime);
	}

	//Create a Method that determines whether it is prime or not
	public static boolean isPrime( long x) {
		long max = (long)Math.sqrt(x);
		if( x ==2) {
			return true;
		}
		if( x % 2 ==0) {
			return false;
		}
		if( x <= 1) {
			return false;
		}
		for( int i = 2; i <= max; i++) {
			if( x % i ==0) {
				return false;
			}
		}
		return true;

	}
}