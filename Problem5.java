public class Problem5 {
	public static void main(String [] args ) {
		double startTime = System.currentTimeMillis();
		int i = 2520;

		while( !smallestNum(i)) {
		i += 20;	
		}

		System.out.println(i);

		double endTime = System.currentTimeMillis();
		double totalTime = endTime - startTime;

		System.out.println("Time: " + totalTime);

	}
	public static boolean smallestNum( int x) {
		for( int i = 1; i < 20; i++ ) {
			if( x % i != 0) {
				return false;
			}
		}
		return true;
		
	}
}