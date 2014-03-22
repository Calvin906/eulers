

public class Problem10 {
	public static void main(String [] args ) {

		//Start time 
		double startTime = System.currentTimeMillis();

		
		long i = 0;
		long sum = 0;
		while (i < 2000000){

			if( isPrime(i) ) {
				sum += i;
				
			}
			i++;
			
		}

		System.out.println(sum);

		//End time 
		double endTime = System.currentTimeMillis();

		//Total time 
		double totalTime = endTime - startTime;

		//Print out the time 
		System.out.println(totalTime);
	}

	//Create a Method that determines whether it is prime or not
	public static boolean isPrime( long x) {
		long max = (long)Math.sqrt(x);
		if( x == 2) {
			return true;
		}
		if( x % 2 == 0) {
			return false;
		}
		if(  x <= 1) {
			return false;
		}
		for( long i = 3L; i <= max; i+=2) {
			if( x % i == 0) {
				return false;
			}
		}
		return true;
	}
}