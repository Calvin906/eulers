public class Problem4 {
	public static void main(String [] args){
		long start = System.currentTimeMillis();

		double end = System.currentTimeMillis();
		double time = end - start;
		int sum = 0;
		int largestNum = 0;

		for( int x = 100; x < 1000; x++) {
			for( int y = 100; y < 1000; y++) {
				sum = x * y;
				if( palindrome(sum)) {
					if( largestNum < sum) {
						largestNum = sum;
					}
				}
			}
		}
		System.out.println(largestNum);
		
		System.out.println("Time: " + time);
	}

	public static boolean palindrome( int x) {
		String s = Integer.toString(x);
		for( int i = 0; i <= s.length()/2; i++) {
			if( s.charAt(i) != s.charAt(s.length()- 1- i)) {
				return false;
			}



		}
		return true;
	}
}
